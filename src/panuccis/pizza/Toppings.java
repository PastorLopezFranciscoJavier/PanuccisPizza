/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panuccis.pizza;

/**
 *
 * @author prog
 */
public enum Toppings {
    CEBOLLA("Cebolla"), QUESO("Queso"), PINIA("Piña");
    
    String nombre;
    
    private Toppings(String nombre){
        this.nombre = nombre;
    }
    
   @Override
    public String toString(){
        return nombre;
    }
}
