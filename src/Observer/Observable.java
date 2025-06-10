/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dgreg
 */
public abstract class Observable {
    private List<Observador> subscriptores;
    public enum Evento { PEDIDO_CONFIRMADO, PEDIDO_EN_PROCESO, PEDIDO_FINALIZADO, PEDIDO_ENTREGADO }

    public Observable() {
        this.subscriptores = new ArrayList();
    }
        
    public void subscribir(Observador subscriptor) {
        this.subscriptores.add(subscriptor);
    }
    
    public void desusbscribir(Observador subscriptor) {
        this.subscriptores.remove(subscriptor);
    }
    
    public void notificar(Object evento) {
        for(Observador o : subscriptores)
            o.notificar(this, evento);
    }
}
