/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Gerónimo
 */
public class Comun extends TipoCliente{

    public Comun(Cliente cliente) {
        super("Común", cliente);
    }


    @Override
    public String getBeneficio() {
        return "no tendrá ningún beneficio.";
    }

    @Override
    public Servicio otorgarBeneficios(Servicio servicio) {
        return servicio;
    }
    
}
