/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estados;

import Exceptions.DispositivoException;
import Exceptions.EstadoPedidoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Item;
import modelo.Pedido;
import modelo.UnidadProcesadora;

/**
 *
 * @author Gerónimo
 */
public class EstadoDispositivoOcupado implements EstadoDispositivo {

    private Dispositivo dispositivo;
    private String nombre = "Ocupado";

    public EstadoDispositivoOcupado(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public Dispositivo identificarse(Cliente c) throws DispositivoException {
        throw new DispositivoException("El dispositivo ya está siendo ocupado.");
    }

    @Override
    public Pedido realizarPedido(Cliente cliente, Item item, String comentario, float precio, UnidadProcesadora unidad) {
        Pedido p = new Pedido(cliente, item, comentario, precio, unidad);
        this.dispositivo.getServicioActual().agregarPedido(p);
        return p;
    }

    @Override
    public void quitarPedido(Pedido pedido) throws DispositivoException {
        try {
            pedido.getEstado().quitarPedido();
        } catch (EstadoPedidoException ex) {
            throw new DispositivoException("El estado del pedido es incorrecto.");
        }
    }

    @Override
    public void finalizarServicio() throws DispositivoException {
        this.dispositivo.getServicioActual().calcularCostoFinal();
        this.dispositivo.setServicioActual(null);
        this.dispositivo.setEstado(new EstadoDispositivoDisponible(this.dispositivo));
    }

    @Override
    public boolean estaDisponible() {
        return false;
    }

    @Override
    public float calcularCostoFinal() throws DispositivoException {
        return this.dispositivo.getServicioActual().calcularCostoFinal();
    }

}
