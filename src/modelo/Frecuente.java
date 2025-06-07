/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gerónimo
 */
public class Frecuente extends TipoCliente{

    public Frecuente(Cliente cliente) {
        super("Frecuente", cliente);
    }

 

    @Override
    public String getBeneficioTexto() {
        return "¡Tendrá todos los cafés consumidos de forma gratuita!";
    }

    @Override
    public float otorgarBeneficios(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
