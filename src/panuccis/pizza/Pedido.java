/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panuccis.pizza;

import java.util.LinkedList;

/**
 *
 * @author Francisco Javier Pastor López
 * @version 1.0
 */
public class Pedido {
    private Cliente c1;
    private LinkedList<Pizza> pizzas;

    public Pedido(Cliente c1) {
        this.c1 = c1;
        pizzas = new LinkedList<>();
    }

    public Cliente getC1() {
        return c1;
    }

    public void setC1(Cliente c1) {
        this.c1 = c1;
    }

    public LinkedList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(LinkedList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
    
    public void añadirPizza(Pizza p){
        pizzas.add(p);
    }
    
    public void eliminarPizza(int pos){
        pizzas.remove(pos);
    }
    
    public void eliminarTodas(){
        pizzas.clear();
    }
    
    public double getPrecio(){
        double total = 0.0;
        for (Pizza pizza : pizzas) {
            total += pizza.getPrecio();
        }
        return total;
    }
    
    @Override
    public String toString(){
        String res = c1 + "\n";
        for (Pizza pizza : pizzas) {
            res += pizza + "\n";
        }
        res += "Precio total " + getPrecio() + "€";
        return res;
    }
    
}
