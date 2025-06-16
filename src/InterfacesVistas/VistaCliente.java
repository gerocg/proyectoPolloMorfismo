/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesVistas;

import java.util.List;
import modelo.Categoria;
import modelo.Pedido;

/**
 *
 * @author Gerónimo
 */
public interface VistaCliente {
    
    public void cargarDatos(List<Categoria> categorias);

    public void mostrarTitulo(String titulo);

    public void mensajeSistema(String mensaje);

    public void mensajeError(String error);
    
    public void cargarTituloInicial();

    public void agregarPedido(Pedido p);

    public void quitarFilaPedido(int fila);

    public void refrescarPedidos(List<Pedido> pedidosDelServicio);

    
}
