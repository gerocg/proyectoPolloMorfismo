/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gerónimo
 */
public class Insumo {
    private String nombre;
    private int stock;
    private int stockMinimo;

    public Insumo(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
        this.stockMinimo = 0;
    }   

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public boolean noQuedaStock() {
        return this.stockMinimo > this.stock;
    }

    public void verificarMinimo(int cantidad) {
        if(this.stockMinimo < cantidad){
            this.stockMinimo = cantidad;
        }
        System.out.println(stockMinimo + " " + nombre);
    }

    public void restarStock(int cantidad) {
        this.stock -= cantidad;
    }
    
    
    
    
}
