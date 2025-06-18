/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import Exceptions.ClienteIngresadoException;
import Exceptions.GestorIngresadoException;
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
    private List<Cliente> clientesIngresados;
    private List<Gestor> gestoresIngresados;

    public ServicioPersonas() {
        this.clientes = new ArrayList<>();
        this.gestores = new ArrayList<>();
        this.clientesIngresados = new ArrayList<>();
        this.gestoresIngresados = new ArrayList<>();
    }

    public void agregar(Cliente c) {
        clientes.add(c);
    }

    public void agregar(Gestor g) {
        gestores.add(g);
    }

    public Cliente ingresar(int numCliente, String password) throws ClienteIngresadoException {
        Cliente cliente = loginCliente(numCliente, password, this.clientes);
        if (cliente == null) {
            throw new ClienteIngresadoException("Datos incorrectos.");
        }
        if (clientesIngresados.contains(cliente)) {
            throw new ClienteIngresadoException("El usuario ya ha sido ingresado.");
        }
        clientesIngresados.add(cliente);
        return cliente;
    }

    private Cliente loginCliente(int numCliente, String password, List<Cliente> clientes) {
        if (numCliente < 0 || password == null || password.isEmpty()) {
            return null;
        }

        for (Cliente c : clientes) {
            if (c.getNumCliente() == numCliente && c.isPasswordValid(password)) {
                return c;
            }
        }
        return null;
    }

    public Gestor ingresar(String usuario, String password) throws GestorIngresadoException {
        Gestor gestor = loginGestor(usuario, password, this.gestores);
        if (gestor == null) {
            throw new GestorIngresadoException("Datos incorrectos.");
        }
        if(gestoresIngresados.contains(gestor)){
            throw new GestorIngresadoException("El gestor ya está ingresado.");
        }
        gestoresIngresados.add(gestor);
        return gestor;
    }

    private Gestor loginGestor(String usuario, String password, List<Gestor> gestores) {
        if (usuario == null || usuario.isEmpty() || password == null || password.isEmpty()) {
            return null;
        }

        for (Gestor g : gestores) {
            if (g.getUsuario().equals(usuario) && g.isPasswordValid(password)) {
                return g;
            }
        }
        return null;
    }

    public void finalizarSesion(Cliente cliente) {
        if (clientesIngresados.contains(cliente)) {
            clientesIngresados.remove(cliente);
        }
    }
    
    public void cerrarSesionGestor(Gestor gestor){
        if(gestoresIngresados.contains(gestor)){
            gestoresIngresados.remove(gestor);
        }
    }

}
