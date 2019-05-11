/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista.modelos;

import java.util.logging.Logger;

/**
 *
 * @author RealEnvido
 */
public class Paciente {
   
    private int idPaciente;
    private String dni;
    private String nombre;
    private String domicilio;
    private String  celular;
  

    
    public Paciente(){
    }
    
    public Paciente(String nombre, String domicilio, String celular, String dni) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.celular = celular;
        this.dni = dni;
    }

    public Paciente(int id,String dni, String nombre, String domicilio, String celular) {
        this.idPaciente = id;
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.celular = celular;
      
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getCelular() {
        return celular;
    }

   

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getIdPaciente() {
        return idPaciente;
    }
   

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

   
    
}
