/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gerónimo
 */
public class Categoria {
    private String nombre;
    private List<Item> menu;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.menu = new ArrayList<>();
    }
    
    public void agregarItemAMenu(Item item){
        this.menu.add(item);
    }
    
    
}
