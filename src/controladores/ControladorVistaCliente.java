/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import InterfacesVistas.VistaCliente;
import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Item;
import modelo.Pedido;
import modelo.Servicio;
import servicios.Fachada;

/**
 *
 * @author Gerónimo
 */
public class ControladorVistaCliente {

    private final VistaCliente vista;
    private final Fachada fachada = Fachada.getInstancia();
    private Cliente cliente;
    private Dispositivo dispositivo;
    private Servicio servicio;

    public ControladorVistaCliente(VistaCliente vista) {
        this.vista = vista;
        cargarDatos();
    }

    private void cargarDatos() {
        vista.cargarDatos(fachada.getCategorias());
    }

    public void ingresar(int numCliente, String password) {
        try {
            Cliente clienteLogeado = fachada.ingresar(numCliente, password);
            if (this.dispositivo == null) {
                this.cliente = clienteLogeado;
                this.dispositivo = fachada.ingresarCliente(clienteLogeado);
                System.out.println("PRIMERO Dispositivo: " + dispositivo.getId() + " - Nombre del estado: " + dispositivo.getEstado().getNombre());
                servicio = dispositivo.getServicioActual();
                vista.mostrarTitulo("Ventana Cliente | Usuario: " + clienteLogeado.getNombreCompleto());
                vista.mensajeSistema("¡Bienvenido/a " + clienteLogeado.getNombreCompleto() + "!"
                        + "\n Recuerde que es un cliente " + clienteLogeado.getTipo().getNombre() + ", por lo que " + clienteLogeado.getTipo().getBeneficioTexto());
            } else if (dispositivo != null) {
                vista.mensajeError("Ya hay un usuario logeado.");
            }
        } catch (Exception e) {
            vista.mensajeError(e.getMessage());
        }
    }

    public void finalizarServicio() {
        try {
            fachada.finalizarServicio(dispositivo);
            vista.cargarTituloInicial();
            vista.mensajeSistema("Servicio finalizado correctamente. Se le aplicó el beneficio de: " + cliente.getTipo().getBeneficioTexto());
            fachada.finalizarSesion(cliente);
            this.cliente = null;
            this.dispositivo = null;
        } catch (Exception e) {
            vista.mensajeError(e.getMessage());
        }
    }

    public void agregarPedido(Item itemSeleccionado, String text) {
        try {
            if (itemSeleccionado == null) {
                vista.mensajeError("Debe seleccionar un item primero.");
            } else {
                Pedido p = dispositivo.realizarPedido(this.cliente, itemSeleccionado, text, itemSeleccionado.getPrecio());
                vista.agregarPedido(p);
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
            } catch (Exception e) {
                vista.mensajeError(e.getMessage());
            }
        }

    }
}
