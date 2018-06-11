/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panuccis.pizza;

/**
 *
 * @author Francisco Javier Pastor López
 * @version 1.0
 */

public enum TipoPizza {
    BBQ("BBQ"), CARBONARA("Carbonara"), QUESOS4("4 Quesos");
    
    private String nombre;
    
    private TipoPizza(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}
