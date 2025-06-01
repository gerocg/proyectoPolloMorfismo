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
public class Dispositivo {
    
    private final int id;
    private Servicio servicioActual;
    private List<Servicio> servicioHistorico;
    
    public Dispositivo(int id) {
        this.id = id;
    }

    public void setServicioActual(Servicio servicioActual) {
        this.servicioActual = servicioActual;
    }

    public Servicio getServicioActual() {
        return servicioActual;
    }

    public List getServicioHistorico() {
        return servicioHistorico;
    }

    public int getId() {
        return id;
    }
    
    public void agregarServicio(Servicio servicio){
        this.setServicioActual(servicio);
        this.servicioHistorico.add(servicio);
        
    }
    
    
}
