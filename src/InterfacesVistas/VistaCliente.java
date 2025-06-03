/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfacesVistas;

import java.util.List;
import modelo.Categoria;

/**
 *
 * @author Gerónimo
 */
public interface VistaCliente {
    
    public void cargarDatos(List<Categoria> categorias);

    public void mostrarTitulo(String string);

    public void mensajeSistema(String string);

    public void mensajeError(String ya_hay_un_usuario_logeado);
    
    public void cargarTituloInicial();
    
}
