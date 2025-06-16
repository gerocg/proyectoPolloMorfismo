/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Objects;

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
    
    public String getNombre(){
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UnidadProcesadora other = (UnidadProcesadora) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
}
