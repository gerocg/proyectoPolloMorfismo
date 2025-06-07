/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estados;

import Exceptions.EstadoPedidoException;
import modelo.Cliente;
import modelo.Gestor;
import modelo.Pedido;

/**
 *
 * @author Gerónimo
 */
public class EstadoPedidoNoConfirmado implements EstadoPedido {

    private final Pedido pedido;
    private final Cliente cliente;

    public EstadoPedidoNoConfirmado(Pedido pedido, Cliente cliente) {
        this.pedido = pedido;
        this.cliente = cliente;
    }

    @Override
    public void confirmarPedido() {
        this.pedido.setEstado(new EstadoPedidoConfirmado(pedido, cliente));
    }

    @Override
    public void quitarPedido() throws EstadoPedidoException {

    }

    @Override
    public void tomarPedido(Gestor gestor) throws EstadoPedidoException {
        throw new EstadoPedidoException("No puede ser tomado sin ser confirmado.");
    }

    @Override
    public void entregarPedido() throws EstadoPedidoException {
        throw new EstadoPedidoException("No puede ser tomado sin ser confirmado.");
    }
    
    @Override
    public void finalizarPedido() throws EstadoPedidoException{
        throw new EstadoPedidoException("Debe confirmar el pedido antes de finalizarlo."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cobrarPedido() throws EstadoPedidoException {
        throw new EstadoPedidoException("Debe confirmar el pedido antes de poder finalizarlo.");
    }

    @Override
    public String getNombre() {
        return "No confirmado";
    }

}
