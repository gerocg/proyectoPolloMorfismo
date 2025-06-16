/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Exceptions.EstadoPedidoException;
import estados.EstadoPedido;
import estados.EstadoPedidoNoConfirmado;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Gerónimo
 */
public class Pedido {
    private Cliente cliente;
    private Item item;
    private String comentario;
    private UnidadProcesadora unidad;
    private Gestor gestor;
    private float precio;
    private EstadoPedido estado;
    private Date fechaConfirmacion;

    public Pedido(Cliente c, Item item, String comentario, float precio, UnidadProcesadora unidad) {
        this.cliente = c;
        this.item = item;
        this.comentario = comentario;
        this.precio = precio;
        this.estado = new EstadoPedidoNoConfirmado(this, cliente);
        this.unidad = unidad;
    }
    
    public Item getItem() {
        return item;
    }

    public String getComentario() {
        return comentario;
    }

    public UnidadProcesadora getUnidad() {
        return unidad;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public float getPrecio() {
        return precio;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setUnidad(UnidadProcesadora unidad) {
        this.unidad = unidad;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void cobrarPedido() throws EstadoPedidoException{
        this.estado.cobrarPedido();
    }
    
    public void definirFecha(){
        this.fechaConfirmacion = new Date();
    }
    
    public String getFecha(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return formato.format(fechaConfirmacion);
    }
}
