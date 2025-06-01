/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gerónimo
 */
public class Gestor {
    private String usuario;
    private String password;
    private String nombreCompleto;
    private UnidadProcesadora unidad;

    public Gestor(String usuario, String password, String nombreCompleto, UnidadProcesadora unidad) {
        this.usuario = usuario;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
        this.unidad = unidad;
    }
    
}
