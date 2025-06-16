/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estados;

import Exceptions.DispositivoException;
import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Item;
import modelo.Pedido;
import modelo.UnidadProcesadora;

/**
 *
 * @author Gerónimo
 */
public interface EstadoDispositivo {
    public Dispositivo identificarse(Cliente c) throws DispositivoException;
    public Pedido realizarPedido(Cliente cliente, Item item, String comentario, float precio, UnidadProcesadora unidad) throws DispositivoException;
    public void quitarPedido(Pedido pedido) throws DispositivoException;
    public void finalizarServicio() throws DispositivoException;
    public float calcularCostoFinal() throws DispositivoException;
    public String getNombre();
    public boolean estaDisponible();
}
