/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Exceptions.DispositivoException;
import estados.EstadoDispositivo;
import estados.EstadoDispositivoDisponible;
import estados.EstadoDispositivoOcupado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gerónimo
 */
public class Dispositivo {
    
    private final int id;
    private Servicio servicioActual;
    private List<Servicio> servicioHistorico;
    private EstadoDispositivo estado;
    
    public Dispositivo(int id) {
        this.id = id;
        this.servicioActual = null;
        this.estado = new EstadoDispositivoDisponible(this);
        this.servicioHistorico = new ArrayList<>();
    }

    public EstadoDispositivo getEstado() {
        return estado;
    }
    
    public void setServicioActual(Servicio servicioActual) {
        this.servicioActual = servicioActual;
        this.estado = new EstadoDispositivoOcupado(this);
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
    
    public Pedido realizarPedido(Cliente cliente, Item item, String comentario, float precio, UnidadProcesadora unidad) throws DispositivoException{
        return estado.realizarPedido(cliente, item, comentario, precio, unidad);
    }

    public void identificarse(Cliente c) throws DispositivoException{
        estado.identificarse(c);
    }
    
    public void setEstado (EstadoDispositivo estado){
        this.estado = estado;
    }
    
    public void finalizarServicio() throws DispositivoException{
        this.estado.finalizarServicio();
    }

    public boolean estaDisponible() {
        return estado.estaDisponible();
    }

    public void finalizarPrecioServicio() throws DispositivoException {
        estado.calcularCostoFinal();
    }
    
    
    
    
}
