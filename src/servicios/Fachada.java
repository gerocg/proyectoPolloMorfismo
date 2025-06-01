/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import modelo.Categoria;
import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Gestor;
import modelo.Ingrediente;
import modelo.Insumo;
import modelo.Item;
import modelo.Pedido;
import modelo.UnidadProcesadora;

/**
 *
 * @author Gerónimo
 */
public class Fachada {
    private static final Fachada instancia = new Fachada();
    private ServicioDispositivos sDispositivos;
    private ServicioItems sItems;
    private ServicioPersonas sPersonas;
    private ServicioInsumos sInsumos;

    private Fachada() {
        this.sDispositivos = new ServicioDispositivos();
        this.sItems = new ServicioItems();
        this.sPersonas = new ServicioPersonas();
        this.sInsumos = new ServicioInsumos();
    }

    public static Fachada getInstancia() {
        return instancia;
    }
    
    public void agregar (Cliente c){
        sPersonas.agregar(c);
    }
    
    public void agregar (Gestor g){
        sPersonas.agregar(g);
    }
    
    public void agregar (Item i){
        sItems.agregar(i);
    }
    
    public void agregar (Categoria c){
        sItems.agregar(c);
    }
    
    public void agregar (UnidadProcesadora u){
        sItems.agregar(u);
    }
    
    public void agregar (Insumo insumo){
        sInsumos.agregar(insumo);
    }
    
    public void agregar (Ingrediente ingrediente){
        sInsumos.agregar(ingrediente);
    }
    
    public void agregar (Dispositivo d){
        sDispositivos.agregar(d);
    }
    
    public void agregar (Pedido p){
        sDispositivos.agregar(p);
    }
}
