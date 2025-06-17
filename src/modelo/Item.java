/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author Gerónimo
 */
public class Item {
    private String nombre;
    private float precio;
    private List<Ingrediente> ingredientes;
    private UnidadProcesadora unidad;
    private Categoria categoria;
    private TipoAlimento tipo;

    public Item(String nombre, float precio, List<Ingrediente> ingredientes, UnidadProcesadora unidad, Categoria categoria, TipoAlimento tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.unidad = unidad;
        this.categoria = categoria;
        this.tipo = tipo;
        registrarMinimo();
    }

    public String getNombre() {
        return nombre;
    }

    public TipoAlimento getTipo() {
        return tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public UnidadProcesadora getUnidad() {
        return unidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    private void registrarMinimo() {
        for(Ingrediente i : this.ingredientes){
            i.getInsumo().verificarMinimo(i.getCantidad());
        }
    }
}
