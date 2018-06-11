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
public class Pizza {

    TipoPizza tipo;
    Tamanio tamanio;
    private boolean[] toppings;
    private double precio;

    public Pizza(TipoPizza tipo, Tamanio tamanio, boolean[] toppings) {
        this.tipo = tipo;
        this.tamanio = tamanio;
        this.toppings = toppings;
    }

    public TipoPizza getTipo() {
        return tipo;
    }

    public void setTipo(TipoPizza tipo) {
        this.tipo = tipo;
    }

    public Tamanio getTamanyo() {
        return tamanio;
    }

    public void setTamanyo(Tamanio tamanyo) {
        this.tamanio = tamanyo;
    }

    public boolean[] getToppings() {
        return toppings;
    }

    public void setToppings(boolean[] toppings) {
        this.toppings = toppings;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String res = "Pizza tipo " + tipo + ", ";
        res += tamanio + ", ";
        
        // Sacamos el array de los valores del enum Toppings
        Toppings[] values = Toppings.values();

        // Recorremos el array para añadir, o no, los extras
        for(int i = 0; i < toppings.length; i++){
            if (toppings[i]) {
                res += values[i].toString() + ", ";
            }
        }
        
        res += "Precio = €" + precio;
        return res;
    }
}
