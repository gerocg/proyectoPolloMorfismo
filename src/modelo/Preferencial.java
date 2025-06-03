/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gerónimo
 */
public class Preferencial extends TipoCliente{

    public Preferencial(Cliente cliente) {
        super("Preferencial", cliente);
    }

    @Override
    public String getBeneficio() {
        return "Tendrá todas las aguas minerales de forma gratuita. Además, si el costo del servicio supera los $2000, tendrá un 5% de descuento.";
    }

    @Override
    public Servicio otorgarBeneficios(Servicio servicio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
