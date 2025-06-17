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
public class EstadoPedidoConfirmado implements EstadoPedido {

    private final Pedido pedido;
    private final Cliente cliente;

    public EstadoPedidoConfirmado(Pedido pedido, Cliente cliente) {
        this.pedido = pedido;
        this.cliente = cliente;
    }

    @Override
    public void confirmarPedido() throws EstadoPedidoException {
        throw new EstadoPedidoException("El pedido ya está confirmado, no puede ser confirmado de nuevo.");
    }
    

    @Override
    public void quitarPedido() throws EstadoPedidoException {

    }

    @Override
    public void tomarPedido(Gestor gestor) throws EstadoPedidoException {
        this.pedido.setGestor(gestor);
        this.pedido.setEstado(new EstadoPedidoEnProceso(this.pedido, this.cliente));
    }

    @Override
    public void entregarPedido() throws EstadoPedidoException {
        throw new EstadoPedidoException("El pedido está confirmado, no puede ser entregado.");
    }

    @Override
    public void finalizarPedido() throws EstadoPedidoException {
        throw new EstadoPedidoException("El pedido está confirmado, no puede ser finalizado.");
    }

    @Override
    public void finalizarServicio() throws EstadoPedidoException {
        
    }

    @Override
    public String getNombre() {
        return "Confirmado";
    }

    @Override
    public boolean estaPendienteEntrega() {
        return true;
    }

    @Override
    public boolean verificarInsumo() {
        return false;
    }
}
