/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista.modelos;

/**
 *
 * @author usuario
 */
public class Comida {
    
    private int id=-1;
    private String nombre;
    private double calorias;
    private String detalle;

    public Comida(int id, String nombre, double calorias, String detalle) {
        this.id= id;
        this.nombre = nombre;
        this.calorias = calorias;
        this.detalle = detalle;
    }

    public Comida(double calorias, String detalle) {
        this.calorias = calorias;
        this.detalle = detalle;
    }

    public Comida() {}

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCalorias() {
        return calorias;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
       
}
