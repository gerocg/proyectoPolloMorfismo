/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gerónimo
 */

public abstract class TipoCliente {
    private String nombre;

    public TipoCliente(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void cobrar();
}
