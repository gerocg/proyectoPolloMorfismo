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
    public String getBeneficioTexto() {
        return "Tendrá $500 de descuento por el servicio.";
    }

    @Override
    public float otorgarBeneficios(Pedido pedido) {
        return pedido.getPrecio();
    }

    @Override
    public float aplicarDescuentos(float total) {
        float totalActual = total - 500;
        if(totalActual < 0){
            return 0;
        }
        return totalActual;
    }
    
    
}
