/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panuccis.pizza;

/**
 * Enumera los distintos tamaños
 * como solamente acepta enteros, se multiplica por 10 el precio y se retorna
 * dividido por 10 y en float.
 * @author Francisco Javier Pastor López
 * @version 1.0
 */

public enum Tamanio {
    PEQUEYA("Pequeña", 50), MEDIANA("Mediana", 75), FAMILIAR("Familiar", 100);
    
    private String nombre;
    private float precio;
    
    private Tamanio(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public float getPrecio() {
        return (float) (precio / 10.0);
    }
    
    @Override
    public String toString(){
        return nombre;
    }
}
