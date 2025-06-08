/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estados;

import Exceptions.DispositivoException;
import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Item;
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
        dispositivo.agregarServicio(new Servicio(c, dispositivo));
        dispositivo.setEstado(new EstadoDispositivoOcupado(dispositivo));
        return dispositivo;
    }
   
    @Override
    public Pedido realizarPedido(Cliente cliente, Item item, String comentario, float precio) throws DispositivoException{
        throw new DispositivoException("El dispositivo no está siendo utilizado.");
    }

    @Override
    public void quitarPedido(Pedido pedido) throws DispositivoException{
        throw new DispositivoException("El dispositivo no está siendo utilizado.");
    }

    @Override
    public void finalizarServicio() throws DispositivoException{
        throw new DispositivoException("El dispositivo no está siendo utilizado.");
    }

    @Override
    public boolean estaDisponible() {
        return true;
    }

    
    
}
