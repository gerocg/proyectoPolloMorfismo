/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import java.util.List;
import modelo.Ingrediente;
import modelo.Insumo;

/**
 *
 * @author Gerónimo
 */
public class ServicioInsumos {
    private List<Insumo> insumos;
    private List<Ingrediente> ingredientes;

    public ServicioInsumos() {
        this.insumos = new ArrayList<>();
        this.ingredientes = new ArrayList<>();
    }
    
    public void agregar (Insumo insumo){
        this.insumos.add(insumo);
    }
    
    public void agregar (Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
    }
    
}
