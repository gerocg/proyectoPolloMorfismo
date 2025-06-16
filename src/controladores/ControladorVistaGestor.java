/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import InterfacesVistas.VistaGestor;
import Observer.Observable;
import Observer.Observador;
import java.util.ArrayList;
import java.util.List;
import modelo.Gestor;
import modelo.Pedido;
import servicios.Fachada;

/**
 *
 * @author Gerónimo
 */
public class ControladorVistaGestor implements Observador {

    private final Gestor gestor;
    private final VistaGestor vista;
    private List<Pedido> pedidosConfirmados;
    private List<Pedido> pedidosTabla;
    private final Fachada fachada = Fachada.getInstancia();

    public ControladorVistaGestor(Gestor gestor, VistaGestor vista) {
        this.gestor = gestor;
        this.vista = vista;
        this.pedidosConfirmados = new ArrayList();
        this.pedidosTabla = new ArrayList();
        this.fachada.suscribirADispositivos(this);
        actualizarPedidos();
    }

    @Override
    public void notificar(Observable origen, Object evento) {
        if (evento.equals(Observable.Evento.PEDIDO_CONFIRMADO)) {
            actualizarPedidos();
        }
        if (evento.equals(Observable.Evento.PEDIDO_EN_PROCESO)) {
            actualizarPedidos();
            actualizarTabla();
        }
        if (evento.equals(Observable.Evento.PEDIDO_FINALIZADO) || evento.equals(Observable.Evento.PEDIDO_ENTREGADO)) {
            actualizarTabla();
        }
    }

    private void actualizarPedidos() {
        vista.borrarPedidos();
        pedidosConfirmados.clear();
        List<Pedido> todosLosPedidosConfirmados = fachada.getPedidosConfirmados();
        for (Pedido p : todosLosPedidosConfirmados) {
            if (!pedidosConfirmados.contains(p) && p.getUnidad().equals(gestor.getUnidad())) {
                this.pedidosConfirmados.add(p);
            }
        }
        vista.actualizarPedidos(this.pedidosConfirmados);
    }

    public void tomarPedido(Pedido pedidoSeleccionado) {
        try {
            fachada.tomarPedido(pedidoSeleccionado, gestor);
            if (!pedidosTabla.contains(pedidoSeleccionado)) {
                this.pedidosTabla.add(pedidoSeleccionado);
            }
            actualizarTabla();
        } catch (Exception e) {
            vista.mensajeError(e.getMessage());
        }
    }

    private void actualizarTabla() {
        vista.cargarPedidoTabla(pedidosTabla);
    }

    public void finalizarPedido(Pedido p) {
        try{
            fachada.finalizarPedido(p);
        } catch (Exception e){
            vista.mensajeError(e.getMessage());
        }
    }

    public void entregarPedido(Pedido p) {
       try{
            fachada.entregarPedido(p);
            System.out.println("Funciona");
        } catch (Exception e){
            vista.mensajeError(e.getMessage());
        } 
    }

}
