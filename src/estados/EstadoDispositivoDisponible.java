/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estados;

import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Pedido;
import modelo.Servicio;

/**
 *
 * @author Gerónimo
 */
public class EstadoDispositivoDisponible implements EstadoDispositivo{
    
    private Dispositivo dispositivo;
    private String nombre = "Disponible";

    public EstadoDispositivoDisponible(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public Dispositivo identificarse(Cliente c) {
        dispositivo.setEstado(new EstadoDispositivoOcupado(dispositivo));
        dispositivo.agregarServicio(new Servicio(c, dispositivo));
        return dispositivo;
    }
   
    @Override
    public void realizarPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void quitarPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void finalizarServicio(Servicio servicio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean estaDisponible() {
        return true;
    }

    
    
}
