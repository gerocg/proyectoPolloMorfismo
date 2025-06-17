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
public class Servicio {

    private Cliente cliente;
    private List<Pedido> pedidos;
    private Dispositivo dispositivo;
    private float precioServicio;

    public Servicio(Cliente cliente, Dispositivo dispositivo) {
        this.cliente = cliente;
        this.pedidos = new ArrayList<>();
        this.dispositivo = dispositivo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void agregarCliente(Cliente c) {
        if (cliente == null) {
            this.cliente = c;
        }
    }

    public void agregarPedido(Pedido p) {
        this.pedidos.add(p);
        this.precioServicio = calcularSinDescuento();
    }

    public void quitarPedido(Pedido p) {
        if (this.pedidos.contains(p)) {
            this.pedidos.remove(p);
            this.precioServicio = calcularSinDescuento();
        }
    }

    public float getPrecioServicio() {
        return precioServicio;
    }

    public float calcularCostoFinal() {
        for(Pedido p: pedidos){
            p.setPrecio(cliente.aplicarBeneficio(p));
        }
        float totalSinDescuento = calcularSinDescuento();
        this.precioServicio = cliente.aplicarDescuento(totalSinDescuento);
        return precioServicio;
    }

    private float calcularSinDescuento() {
        float total = 0;
        for(Pedido p: pedidos){
            total += p.getPrecio();
        }
        return total;
    }

    

}
