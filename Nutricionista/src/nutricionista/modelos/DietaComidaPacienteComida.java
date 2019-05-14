/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista.modelos;

/**
 *
 * @author RealEnvido
 */
public class DietaComidaPacienteComida {
    private int idDieta;
    private int idComida;
    private String nombreComida;
    private double calorias;
    private String Detalles;

    public int getIdDieta() {
        return idDieta;
    }

    public int getIdComida() {
        return idComida;
    }

    public String getNombreComida() {
        return nombreComida;
    }

    public Double getCalorias() {
        return calorias;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    public void setCalorias(Double calorias) {
        this.calorias = calorias;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
    }

    public DietaComidaPacienteComida() {
    }
   
    
    
}
