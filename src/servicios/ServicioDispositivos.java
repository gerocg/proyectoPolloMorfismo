/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Pedido;
import modelo.Servicio;

/**
 *
 * @author Gerónimo
 */
public class ServicioDispositivos {
    private List<Dispositivo> dispositivos;
    private List<Pedido> pedidos;
    private List<Servicio> servicios;

    public ServicioDispositivos() {
        this.dispositivos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.servicios = new ArrayList<>();
    }
    
    public void agregar (Dispositivo d){
        this.dispositivos.add(d);
    }
    
    public void agregar (Pedido p){
        this.pedidos.add(p);
    }
    
    public List<Dispositivo> getDispositivos(){
        return dispositivos;
    }
    
    public void agregar (Servicio s){
        this.servicios.add(s);
    }
    
    public void agregarAServicio(Cliente c, Servicio s){
        s.agregarCliente(c);
    }

    

    public Dispositivo ingresarClienteADispositivo(Cliente cliente) {
        for(Dispositivo d : this.dispositivos){
            d.identificarse(cliente);
            return d;
        }
        return null;
    }
    
}
