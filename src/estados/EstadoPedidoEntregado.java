/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estados;

import Exceptions.EstadoPedidoException;
import modelo.Cliente;
import modelo.Gestor;
import modelo.Pedido;
import modelo.Servicio;

/**
 *
 * @author Gerónimo
 */
public class EstadoPedidoEntregado implements EstadoPedido {
    
    private final Pedido pedido;
    private final Cliente cliente;

    public EstadoPedidoEntregado(Pedido pedido, Cliente cliente) {
        this.pedido = pedido;
        this.cliente = cliente;
    }

    @Override
    public String getNombre() {
        return "Entregado";
    }

    @Override
    public void confirmarPedido() throws EstadoPedidoException {
        throw new EstadoPedidoException("El pedido " + pedido.getItem().getNombre() +" ya está entregado, no puede ser confirmado.");
    }

    @Override
    public void quitarPedido() throws EstadoPedidoException {
        throw new EstadoPedidoException("El pedido " + pedido.getItem().getNombre() +" ya ha sido entregado, no puede ser eliminado.");
    }

    @Override
    public void tomarPedido(Gestor gestor) throws EstadoPedidoException {
        throw new EstadoPedidoException("El pedido " + pedido.getItem().getNombre() +" ya ha sido entregado, no puede ser tomado.");
    }

    @Override
    public void entregarPedido() throws EstadoPedidoException {
        throw new EstadoPedidoException("El pedido " + pedido.getItem().getNombre() +" ya ha sido entregado, no puede ser entregado nuevamente.");
    }
    
    @Override
    public void finalizarPedido() throws EstadoPedidoException{
        throw new EstadoPedidoException("El pedido " + pedido.getItem().getNombre() +" ya ha sido entregado, no puede ser finalizado.");
    }

    @Override
    public void finalizarServicio() throws EstadoPedidoException {
        
    }

    @Override
    public boolean estaPendienteEntrega() {
        return false;
    }

    @Override
    public boolean verificarInsumo() {
        return false;
    }

    @Override
    public String verificarFinalizado() {
        return null;
    }
    
}
