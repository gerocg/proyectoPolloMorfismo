/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import modelo.Categoria;
import modelo.Cliente;
import modelo.Gestor;
import modelo.Item;
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

    private Fachada() {
        this.sDispositivos = new ServicioDispositivos();
        this.sItems = new ServicioItems();
        this.sPersonas = new ServicioPersonas();
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
}
