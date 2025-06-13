/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Exceptions.GestorIngresadoException;
import InterfacesVistas.VistaLoginGestor;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Gestor;
import servicios.Fachada;

/**
 *
 * @author Gerónimo
 */
public class ControladorLogin {

    private VistaLoginGestor vista;
    private Fachada fachada = Fachada.getInstancia();
    
    public ControladorLogin(VistaLoginGestor vista) {
        this.vista = vista;
    }

    public void verificarLogin(String usuario, String password) {
        try {
            Gestor gestor = fachada.ingresar(usuario, password);
            vista.ingresar(gestor);
        } catch (Exception e) {
            vista.mostrarError(e.getMessage());
        }
    }
    
}
