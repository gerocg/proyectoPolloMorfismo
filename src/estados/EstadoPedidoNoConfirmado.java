/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estados;

import Exceptions.EstadoPedidoException;
import modelo.Gestor;
import modelo.Pedido;
import modelo.UnidadProcesadora;

/**
 *
 * @author Gerónimo
 */
public class EstadoPedidoNoConfirmado implements EstadoPedido {

    private Pedido pedido;

    public EstadoPedidoNoConfirmado(Pedido p) {
        this.pedido = p;
    }

    @Override
    public void confirmarPedido() {
        this.pedido.setEstado(new EstadoPedidoConfirmado(pedido));
    }

    @Override
    public void quitarPedido() throws EstadoPedidoException {

    }

    @Override
    public void tomarPedido(Gestor gestor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void entregarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void finalizarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getNombre() {
        return "No confirmado";
    }

}
