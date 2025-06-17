/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import InterfacesVistas.VistaCliente;
import Observer.Observable;
import Observer.Observador;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Ingrediente;
import modelo.Item;
import modelo.Pedido;
import servicios.Fachada;

/**
 *
 * @author Gerónimo
 */
public class ControladorVistaCliente implements Observador {
    
    private final VistaCliente vista;
    private final Fachada fachada = Fachada.getInstancia();
    private Cliente cliente;
    private Dispositivo dispositivo;
    private List<Pedido> pedidosDelDispositivo;
    
    public ControladorVistaCliente(VistaCliente vista) {
        this.vista = vista;
        fachada.suscribirADispositivos(this);
        this.pedidosDelDispositivo = new ArrayList();
        cargarDatos();
    }
    
    private void cargarDatos() {
        vista.cargarDatos(fachada.getCategorias());
    }
    
    public void ingresar(int numCliente, String password) {
        try {
            Cliente clienteLogeado = fachada.ingresar(numCliente, password);
            this.cliente = clienteLogeado;
            this.dispositivo = fachada.ingresarCliente(clienteLogeado);
            vista.mostrarTitulo("Ventana Cliente | Usuario: " + clienteLogeado.getNombreCompleto());
            vista.mensajeSistema("<html>¡Bienvenido/a " + clienteLogeado.getNombreCompleto()
                    + "!<br>Recuerde que es un cliente " + clienteLogeado.getTipo().getNombre()
                    + ". <br>Por lo tanto: " + clienteLogeado.getTipo().getBeneficioTexto() + "</html>");
            vista.borrarPedidos();
        } catch (Exception e) {
            vista.mensajeError(e.getMessage());
        }
    }
    
    public void finalizarServicio() {
        int pedidosPendientes = 0;
        
        for (Pedido p : pedidosDelDispositivo) {
            if (p.getEstado().estaPendienteEntrega()) {
                pedidosPendientes++;
            }
        }
        try {
            for (Pedido p : pedidosDelDispositivo) {
                p.finalizarServicio();
            }
            fachada.finalizarPrecioServicio(dispositivo);
            if (pedidosPendientes > 0) {
                vista.mensajeSistema("<html>¡Tienes " + pedidosPendientes + " pedidos en proceso, recuerda ir a retirarlos!<br>Servicio finalizado correctamente. Se le aplicó el beneficio de: " + cliente.getTipo().getBeneficioTexto() + ""
                        + "<br> El monto total es de: $" + precioServicio() + "</html>");
            } else {
                vista.mensajeSistema("<html>Servicio finalizado correctamente. Se le aplicó el beneficio de: " + cliente.getTipo().getBeneficioTexto()
                        + "<br>El monto total a pagar es de: $" + precioServicio() + " </html>");
            }
            fachada.finalizarServicio(dispositivo);
            vista.cargarTituloInicial();
            fachada.finalizarSesion(cliente);
            this.cliente = null;
            this.dispositivo = null;
        } catch (Exception e) {
            vista.mensajeError(e.getMessage());
        }
    }
    
    private float precioServicio() {
        return dispositivo.getServicioActual().getPrecioServicio();
    }
    
    public void agregarPedido(Item itemSeleccionado, String text) {
        try {
            if (itemSeleccionado == null) {
                vista.mensajeError("Debe seleccionar un item primero.");
            } else if (dispositivo == null) {
                vista.mensajeError("Inicie sesión antes de realizar un pedido.");
            } else {
                Pedido p = dispositivo.realizarPedido(this.cliente, itemSeleccionado, text, itemSeleccionado.getPrecio(), itemSeleccionado.getUnidad());
                this.pedidosDelDispositivo.add(p);
                vista.agregarPedido(p);
                vista.actualizarPrecio(precioServicio());
            }
        } catch (Exception e) {
            vista.mensajeError(e.getMessage());
        }
    }
    
    public void eliminarPedido(int fila, Pedido pedido) {
        if (pedido == null || fila < 0) {
            vista.mensajeError("Seleccione un pedido.");
        } else {
            try {
                dispositivo.getEstado().quitarPedido(pedido);
                vista.quitarFilaPedido(fila);
                this.pedidosDelDispositivo.remove(pedido);
                vista.actualizarPrecio(precioServicio());
            } catch (Exception e) {
                vista.mensajeError(e.getMessage());
            }
        }
        
    }
    
    @Override
    public void notificar(Observable origen, Object evento) {
        vista.refrescarPedidos(pedidosDelDispositivo);
        if (evento.equals(Observable.Evento.PEDIDO_CONFIRMADO)) {
            confirmarInsumos();
        }
    }
    
    public void confirmarPedidos(List<Pedido> pedidosDelServicio) {
        for (Pedido p : pedidosDelServicio) {
            try {
                p.getEstado().confirmarPedido();
                fachada.pedidoConfirmado(p);
            } catch (Exception e) {
                vista.mensajeError(e.getMessage());
            }
        }
        vista.refrescarPedidos(pedidosDelServicio);
    }
    
    private void confirmarInsumos() {
        for (Pedido p : this.pedidosDelDispositivo) {
            if (p.verificarInsumo()) {
                for (Ingrediente i : p.getItem().getIngredientes()) {
                    if (i.getInsumo().noQuedaStock()) {
                        vista.eliminarPedido(p);
                        vista.mensajeError("<html>Lo sentimos, nos hemos quedado sin stock de “" + p.getItem().getNombre() +
                                "“<br>por lo que lo hemos quitado el pedido del servicio.");
                    }
                }
            }
        }
    }
}
