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
    private Cliente cliente;

    public TipoCliente(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
    }
    
    public abstract Servicio otorgarBeneficios(Servicio servicio);

    public String getNombre() {
        return nombre;
    }
    
    public abstract String getBeneficio();
}
