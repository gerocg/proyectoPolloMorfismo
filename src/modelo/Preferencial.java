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
    public String getBeneficioTexto() {
        return "Tendrá todas las aguas minerales de forma gratuita. Además, si el costo del servicio supera los $2000, tendrá un 5% de descuento.";
    }

    @Override
    public float otorgarBeneficios(Pedido pedido) {
        if(pedido.getItem().getTipo().equals(TipoAlimento.Agua)){
            return 0;
        }
        return pedido.getPrecio();
    }

    @Override
    public float aplicarDescuentos(float total) {
        if(total > 2000){
            return total * 0.95f;
        }
        return total;
    }
    
}
