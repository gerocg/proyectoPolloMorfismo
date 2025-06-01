/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;
import modelo.Item;
import modelo.UnidadProcesadora;


/**
 *
 * @author Gerónimo
 */
public class ServicioItems {
    private List<Item> items;
    private List<Categoria> categorias;
    private List<UnidadProcesadora> unidadesProcesadoras;

    public ServicioItems() {
        this.items = new ArrayList<>();
        this.categorias = new ArrayList<>();
        this.unidadesProcesadoras = new ArrayList<>();
    }
    
    public void agregar(Item i){
        items.add(i);
    }
    
    public void agregar(Categoria c){
        categorias.add(c);
    }
    
    public void agregar(UnidadProcesadora u){
        unidadesProcesadoras.add(u);
    }
}
