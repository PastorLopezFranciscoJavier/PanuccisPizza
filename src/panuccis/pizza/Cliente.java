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
public class Cliente {
    private String nombre, direccion, email;
    
    public Cliente(String nombre, String direccion, String email){
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "Cliente: " + nombre + " " + "Dirección: " + direccion + " " +
                "Email: " + email;
    }
    
}
