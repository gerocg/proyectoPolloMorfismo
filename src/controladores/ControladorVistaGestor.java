/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import InterfacesVistas.VistaGestor;
import Observer.Observable;
import Observer.Observador;
import java.util.List;
import modelo.Gestor;
import modelo.Pedido;
import servicios.Fachada;

/**
 *
 * @author Gerónimo
 */
public class ControladorVistaGestor implements Observador{
    
    private Gestor gestor;
    private VistaGestor vista;
    private List<Pedido> pedidosConfirmados;
    private Fachada fachada = Fachada.getInstancia();

    public ControladorVistaGestor(Gestor gestor, VistaGestor vista) {
        this.gestor = gestor;
        this.vista = vista;
        actualizarPedidos();
    }
    
    

    @Override
    public void notificar(Observable origen, Object evento) {
        if(evento.equals(Observable.Evento.PEDIDO_CONFIRMADO)){
            actualizarPedidos();
        }
    }

    private void actualizarPedidos() {
        List<Pedido> todosLosPedidosConfirmados = fachada.getPedidosConfirmados();
        for(Pedido p : todosLosPedidosConfirmados){
            if(p.getUnidad().equals(this.gestor.getUnidad())){
                this.pedidosConfirmados.add(p);
            }
        }
        vista.actualizarPedidos(this.pedidosConfirmados);
    }
    
}
