/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import Exceptions.DispositivoException;
import Exceptions.EstadoPedidoException;
import Observer.Observable;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Gestor;
import modelo.Pedido;
import modelo.Servicio;

/**
 *
 * @author Gerónimo
 */
public class ServicioDispositivos extends Observable{

    private List<Dispositivo> dispositivos;
    private List<Pedido> pedidos;
    private List<Pedido> pedidosConfirmados;
    private List<Servicio> servicios;

    public ServicioDispositivos() {
        this.dispositivos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.servicios = new ArrayList<>();
        this.pedidosConfirmados = new ArrayList<>();
    }

    public void agregar(Dispositivo d) {
        this.dispositivos.add(d);
    }

    public void agregar(Pedido p) {
        this.pedidos.add(p);
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public void agregar(Servicio s) {
        this.servicios.add(s);
    }

    public void agregarAServicio(Cliente c, Servicio s) {
        s.agregarCliente(c);
    }

    public Dispositivo ingresarClienteADispositivo(Cliente cliente) throws DispositivoException {
        for (Dispositivo d : this.dispositivos) {
            if (d.estaDisponible()) {
                d.identificarse(cliente);
                return d;
            }
        }
        throw new DispositivoException("No hay dispositivos disponibles.");
    }

    void finalizarServicio(Dispositivo dispositivo) throws DispositivoException {
        dispositivo.finalizarServicio();
    }
    
    public List<Pedido> getPedidosConfirmados(){
        return this.pedidosConfirmados;
    }

    public void pedidoConfirmado(Pedido p) {
        this.pedidosConfirmados.add(p);
        notificar(Observable.Evento.PEDIDO_CONFIRMADO);
    }

    void tomarPedido(Pedido pedidoSeleccionado, Gestor gestor) throws EstadoPedidoException {
        pedidoSeleccionado.getEstado().tomarPedido(gestor);
        this.pedidosConfirmados.remove(pedidoSeleccionado);
        notificar(Observable.Evento.PEDIDO_EN_PROCESO);
    }

    void finalizarPedido(Pedido p) throws EstadoPedidoException {
        p.getEstado().finalizarPedido();
        notificar(Observable.Evento.PEDIDO_FINALIZADO);
    }

    void entregarPedido(Pedido p) throws EstadoPedidoException {
        p.getEstado().entregarPedido();
        notificar(Observable.Evento.PEDIDO_ENTREGADO);
    }

    void finalizarPrecioServicio(Dispositivo dispositivo) throws DispositivoException {
        dispositivo.finalizarPrecioServicio();
    }

}
