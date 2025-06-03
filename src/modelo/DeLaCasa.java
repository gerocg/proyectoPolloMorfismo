/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gerónimo
 */
public class DeLaCasa extends TipoCliente{

    public DeLaCasa(Cliente cliente) {
        super("De la casa", cliente);
    }

    @Override
    public String getBeneficio() {
        return "Tendrá $500 de descuento por el servicio.";
    }

    @Override
    public Servicio otorgarBeneficios(Servicio servicio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
