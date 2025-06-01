/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Gestor;

/**
 *
 * @author Gerónimo
 */
public class ServicioPersonas {
    private List<Cliente> clientes;
    private List<Gestor> gestores;

    public ServicioPersonas() {
        this.clientes = new ArrayList<>();
        this.gestores = new ArrayList<>();
    }
    
    public void agregar(Cliente c){
        clientes.add(c);
    }
    
    public void agregar(Gestor g){
        gestores.add(g);
    }
    
    
    
}
