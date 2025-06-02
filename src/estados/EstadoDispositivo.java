/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estados;

import modelo.Pedido;
import modelo.Servicio;

/**
 *
 * @author Gerónimo
 */
public interface EstadoDispositivo {
    public void identificarse(String usuario, String password);
    public void realizarPedido(Pedido pedido);
    public void quitarPedido(Pedido pedido);
    public void finalizarServicio(Servicio servicio);
}
