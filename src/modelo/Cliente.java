/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gerónimo
 */
public class Cliente {
    private TipoCliente tipo;
    private String nombreCompleto;
    private int numCliente;
    private String password;

    public Cliente(TipoCliente tipo, String nombreCompleto, int numCliente, String password) {
        this.tipo = tipo;
        this.nombreCompleto = nombreCompleto;
        this.numCliente = numCliente;
        this.password = password;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public boolean isPasswordValid(String pass){
        return this.password.equals(pass);
    }
    
    public void setTipoCliente(TipoCliente tipo){
        this.tipo = tipo;
    }
    
    
    
}
