/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estados;

import modelo.Gestor;

/**
 *
 * @author Gerónimo
 */
public interface EstadoPedido {
    public void confirmarPedido();
    public void quitarPedido();
    public void tomarPedido(Gestor gestor);
    public void cobrarPedido();
    public void finalizarPedido();
    public void entregarPedido();
}
