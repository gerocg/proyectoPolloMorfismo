/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gerónimo
 */
public abstract class UnidadProcesadora {
    
    private String nombre;

    public UnidadProcesadora(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void procesar();
    
}
