/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesVistas;

import java.util.List;
import modelo.Pedido;

/**
 *
 * @author Gerónimo
 */
public interface VistaGestor {

    public void actualizarPedidos(List<Pedido> pedidosConfirmados);

    public void mensajeError(String message);

    public void cargarPedidoTabla(List<Pedido> pedidosTabla);

    public void borrarPedidos();
    
}
