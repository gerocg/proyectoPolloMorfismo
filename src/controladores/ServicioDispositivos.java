/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import java.util.List;
import modelo.Dispositivo;
import modelo.Pedido;

/**
 *
 * @author Gerónimo
 */
public class ServicioDispositivos {
    private List<Dispositivo> dispositivos;
    private List<Pedido> pedidos;

    public ServicioDispositivos() {
        this.dispositivos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }
    
    public void agregar (Dispositivo d){
        this.dispositivos.add(d);
    }
    
    public void agregar (Pedido p){
        this.pedidos.add(p);
    }
}
