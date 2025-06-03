/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estados;

import Exceptions.EstadoPedidoException;
import modelo.Gestor;
import modelo.UnidadProcesadora;

/**
 *
 * @author Gerónimo
 */
public interface EstadoPedido {
    public String getNombre();
    public void confirmarPedido() throws EstadoPedidoException;
    public void quitarPedido() throws EstadoPedidoException;
    public void tomarPedido(Gestor gestor) throws EstadoPedidoException;
    public void entregarPedido() throws EstadoPedidoException;
    public void finalizarPedido() throws EstadoPedidoException;

}
