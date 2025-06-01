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
public class Pedido {
    private Dispositivo dispositivo;
    private List<Item> items;
    private String comentario;

    public Pedido(Dispositivo dispositivo, List<Item> items, String comentario) {
        this.dispositivo = dispositivo;
        this.items = items;
        this.comentario = comentario;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getComentario() {
        return comentario;
    }
    
    
}
