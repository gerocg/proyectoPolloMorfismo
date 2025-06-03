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
public class EstadoDispositivoOcupado implements EstadoDispositivo{
    
    private Dispositivo dispositivo;
    private String nombre = "Ocupado";

    public EstadoDispositivoOcupado(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getNombre() {
        return nombre;
    }
    

    @Override
    public Dispositivo identificarse(Cliente c) {
        return null;
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
        
        this.dispositivo.setServicioActual(null);
        this.dispositivo.setEstado(new EstadoDispositivoDisponible(this.dispositivo));
    }

    @Override
    public boolean estaDisponible() {
        return false;
    }
    
}
