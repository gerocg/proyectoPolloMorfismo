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
public class EstadoPedidoEnProceso implements EstadoPedido {

    private final Pedido pedido;
    private final Cliente cliente;

    public EstadoPedidoEnProceso(Pedido pedido, Cliente cliente) {
        this.pedido = pedido;
        this.cliente = cliente;
    }

    @Override
    public void confirmarPedido() throws EstadoPedidoException {
        throw new EstadoPedidoException("El pedido está en proceso, no puede ser confirmado.");
    }

    @Override
    public void quitarPedido() throws EstadoPedidoException {
        throw new EstadoPedidoException("El pedido está en proceso, no puede ser quitado.");
    }

    @Override
    public void tomarPedido(Gestor gestor) throws EstadoPedidoException {
        throw new EstadoPedidoException("El pedido está en proceso, no puede ser tomado.");
    }

    @Override
    public void entregarPedido() throws EstadoPedidoException {
        throw new EstadoPedidoException("El pedido está en proceso, no puede ser entregado.");
    }

    @Override
    public void finalizarPedido() throws EstadoPedidoException {
        this.pedido.setEstado(new EstadoPedidoFinalizado(pedido, cliente));
    }

    @Override
    public void finalizarServicio() {
        
    }

    @Override
    public String getNombre() {
        return "En proceso";
    }

    @Override
    public boolean estaPendienteEntrega() {
        return true;
    }
}
