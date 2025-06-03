/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import estados.EstadoPedido;
import estados.EstadoPedidoNoConfirmado;
import java.util.List;

/**
 *
 * @author Gerónimo
 */
public class Pedido {
    private Item item;
    private String comentario;
    private UnidadProcesadora unidad;
    private Gestor gestor;
    private float precio;
    private EstadoPedido estado;

    public Pedido( Item item, String comentario, float precio) {
        this.item = item;
        this.comentario = comentario;
        this.precio = precio;
        this.estado = new EstadoPedidoNoConfirmado(this);
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
    
    
    
    
    
    
}
