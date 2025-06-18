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
public class EstadoPedidoFinalizado implements EstadoPedido{
    
    private final Pedido pedido;
    private final Cliente cliente;

    public EstadoPedidoFinalizado(Pedido pedido, Cliente cliente) {
        this.pedido = pedido;
        this.cliente = cliente;
    }

    @Override
    public void confirmarPedido() throws EstadoPedidoException{
        throw new EstadoPedidoException("El pedido " + pedido.getItem().getNombre() +" ya está finalizado, no puede ser confirmado.");
    }

    @Override
    public void quitarPedido() throws EstadoPedidoException{
        throw new EstadoPedidoException("El pedido ya está finalizado, no puede ser quitado.");
    }

    @Override
    public void tomarPedido(Gestor gestor) throws EstadoPedidoException{
        throw new EstadoPedidoException("El pedido ya está finalizado, no puede ser tomado.");
    }
    
    @Override
    public void entregarPedido() throws EstadoPedidoException{
        this.pedido.setEstado(new EstadoPedidoEntregado(pedido, cliente));
    }
    
    @Override
    public void finalizarPedido() throws EstadoPedidoException{
        throw new EstadoPedidoException("El pedido ya está finalizado.");
    }

    @Override
    public void finalizarServicio() throws EstadoPedidoException{
        
    }

    @Override
    public String getNombre() {
        return "Finalizado";
    }

    @Override
    public boolean estaPendienteEntrega() {
        return true;
    }

    @Override
    public boolean verificarInsumo() {
        return false;
    }
    
    @Override
    public String verificarFinalizado() {
        return "El pedido " + pedido.getItem().getNombre() + " está finalizado, recuerde ir a retirarlo.";
    }
}
