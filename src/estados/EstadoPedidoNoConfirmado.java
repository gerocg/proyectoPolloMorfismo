/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estados;

import Exceptions.EstadoPedidoException;
import Exceptions.InsumoException;
import modelo.Cliente;
import modelo.Gestor;
import modelo.Ingrediente;
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
    public void confirmarPedido() throws InsumoException {
        for(Ingrediente i : pedido.getItem().getIngredientes()){
            if(i.getInsumo().noQuedaStock()){
                throw new InsumoException("No hay stock suficiente de " + pedido.getItem().getNombre() + ".");
            }
            i.getInsumo().restarStock(i.getCantidad());
        }
        this.pedido.setEstado(new EstadoPedidoConfirmado(pedido, cliente));
        this.pedido.definirFecha();
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
    public void finalizarServicio() throws EstadoPedidoException {
        throw new EstadoPedidoException("Debe confirmar el pedido antes de poder finalizarlo.");
    }

    @Override
    public String getNombre() {
        return "No confirmado";
    }

    @Override
    public boolean estaPendienteEntrega() {
        return false;
    }

    @Override
    public boolean verificarInsumo() {
        return true;
    }

}
