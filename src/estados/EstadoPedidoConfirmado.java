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
public class EstadoPedidoConfirmado implements EstadoPedido{
    
    private Pedido pedido;

    public EstadoPedidoConfirmado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void confirmarPedido() throws EstadoPedidoException{
        throw new EstadoPedidoException("El pedido ya está confirmado, no puede ser confirmado de nuevo.");
    }

    @Override
    public void quitarPedido() throws EstadoPedidoException{
        throw new EstadoPedidoException("El pedido ya está confirmado, no puede ser quitado.");
    }

    @Override
    public void tomarPedido(Gestor gestor) throws EstadoPedidoException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void entregarPedido() throws EstadoPedidoException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void finalizarPedido() throws EstadoPedidoException{
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    @Override
    public String getNombre() {
        return "Confirmado";
    }
}
