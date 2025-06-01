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

    public Item(String nombre, float precio, List<Ingrediente> ingredientes, UnidadProcesadora unidad, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.unidad = unidad;
        this.categoria = categoria;
    }
    
    
    
}
