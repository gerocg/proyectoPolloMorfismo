/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import InterfacesVistas.VistaCliente;
import estados.EstadoDispositivoDisponible;
import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Servicio;
import servicios.Fachada;

/**
 *
 * @author Gerónimo
 */
public class ControladorVistaCliente {

    private VistaCliente vista;
    private Fachada fachada = Fachada.getInstancia();
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
                        + "\n Recuerde que es un cliente " + clienteLogeado.getTipo().getNombre() + ", por lo que " + clienteLogeado.getTipo().getBeneficio());
            } else if (dispositivo != null) {
                vista.mensajeError("Ya hay un usuario logeado.");
            }
        } catch (Exception e) {
            vista.mensajeError(e.getMessage());
        }

    }

    public void finalizarServicio() {
        fachada.finalizarSesion(cliente);
        fachada.finalizarServicio(dispositivo);
        this.cliente = null;
        this.dispositivo = null;
        vista.cargarTituloInicial();
        vista.mensajeSistema("Servicio finalizado correctamente.");
    }

}
