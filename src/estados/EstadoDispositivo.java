/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estados;

import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Pedido;
import modelo.Servicio;

/**
 *
 * @author Gerónimo
 */
public interface EstadoDispositivo {
    public Dispositivo identificarse(Cliente c);
    public void realizarPedido(Pedido pedido);
    public void quitarPedido(Pedido pedido);
    public void finalizarServicio(Servicio servicio);
    public String getNombre();
    public boolean estaDisponible();
}
