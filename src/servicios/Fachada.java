/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import Exceptions.ClienteIngresadoException;
import Exceptions.DispositivoException;
import Exceptions.EstadoPedidoException;
import Exceptions.GestorIngresadoException;
import Observer.Observador;
import controladores.ControladorVistaGestor;
import java.util.List;
import modelo.Categoria;
import modelo.Cliente;
import modelo.Dispositivo;
import modelo.Gestor;
import modelo.Ingrediente;
import modelo.Insumo;
import modelo.Item;
import modelo.Pedido;
import modelo.Servicio;
import modelo.UnidadProcesadora;

/**
 *
 * @author Gerónimo
 */
public class Fachada {
    private static final Fachada instancia = new Fachada();
    private ServicioDispositivos sDispositivos;
    private ServicioItems sItems;
    private ServicioPersonas sPersonas;
    private ServicioInsumos sInsumos;

    private Fachada() {
        this.sDispositivos = new ServicioDispositivos();
        this.sItems = new ServicioItems();
        this.sPersonas = new ServicioPersonas();
        this.sInsumos = new ServicioInsumos();
    }

    public static Fachada getInstancia() {
        return instancia;
    }
    
    public void agregar (Cliente c){
        sPersonas.agregar(c);
    }
    
    public void agregar (Gestor g){
        sPersonas.agregar(g);
    }
    
    public void agregar (Item i){
        sItems.agregar(i);
    }
    
    public void agregar (Categoria c){
        sItems.agregar(c);
    }
    
    public void agregar (UnidadProcesadora u){
        sItems.agregar(u);
    }
    
    public void agregar (Insumo insumo){
        sInsumos.agregar(insumo);
    }
    
    public void agregar (Ingrediente ingrediente){
        sInsumos.agregar(ingrediente);
    }
    
    public void agregar (Dispositivo d){
        sDispositivos.agregar(d);
    }
    
    public void agregar (Pedido p){
        sDispositivos.agregar(p);
    }
    
    public void agregarItemACategoria(Categoria c, Item i){
        sItems.agregarItemACategoria(c, i);
    }
    
    public Cliente ingresar(int numCliente, String password) throws ClienteIngresadoException{
       return sPersonas.ingresar(numCliente, password);
    }
    
    public Gestor ingresar(String usuario, String password) throws GestorIngresadoException{
        return sPersonas.ingresar(usuario, password);
    }

    public void agregarAServicio(Cliente clienteLogeado, Servicio servicio) {
        sDispositivos.agregarAServicio(clienteLogeado, servicio);
    }

    void ingresarClienteADispositivo(Cliente cliente) throws DispositivoException {
        sDispositivos.ingresarClienteADispositivo(cliente);
    }

    public Dispositivo ingresarCliente(Cliente clienteLogeado) throws DispositivoException {
        return sDispositivos.ingresarClienteADispositivo(clienteLogeado);
    }

    public List<Categoria> getCategorias() {
        return sItems.getCategorias();
    }

    public void finalizarServicio( Dispositivo dispositivo) throws DispositivoException {
        sDispositivos.finalizarServicio(dispositivo);
    }

    public void finalizarSesion(Cliente cliente) {
        sPersonas.finalizarSesion(cliente);
    }

    public List<Pedido> getPedidosConfirmados() {
        return sDispositivos.getPedidosConfirmados();
    }

    public void pedidoConfirmado(Pedido p) {
        sDispositivos.pedidoConfirmado(p);
    }

    public void tomarPedido(Pedido pedidoSeleccionado, Gestor gestor) throws EstadoPedidoException {
        sDispositivos.tomarPedido(pedidoSeleccionado, gestor);
    }

    public void suscribirADispositivos(Observador obs) {
        sDispositivos.subscribir(obs);
    }
    
    public void desuscribirADispositivos(Observador obs){
        sDispositivos.desusbscribir(obs);
    }

    public void finalizarPedido(Pedido p) throws EstadoPedidoException {
        sDispositivos.finalizarPedido(p);
    }

    public void entregarPedido(Pedido p) throws EstadoPedidoException {
        sDispositivos.entregarPedido(p);
    }

    public void finalizarPrecioServicio(Dispositivo dispositivo) throws DispositivoException {
        sDispositivos.finalizarPrecioServicio(dispositivo);
    }

    public void cerrarSesionGestor(Gestor gestor) {
        sPersonas.cerrarSesionGestor(gestor);
    }

    

}

