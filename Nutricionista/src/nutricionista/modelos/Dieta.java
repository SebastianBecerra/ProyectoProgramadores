/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista.modelos;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author RealEnvido
 */
public class Dieta {
    private int id;
    private Paciente paciente;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private float pesoInicial;
    private float pesoFinal;

    public Dieta(Paciente persona, LocalDate fechaInicial, LocalDate fechaFinal, float pesoInicial, float pesoFinal) {
        this.paciente = persona;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
    }

    public Dieta() 
    {
        
    }

    public Dieta(int id, Paciente paciente, LocalDate fechaInicial, LocalDate fechaFinal, float pesoInicial, float pesoFinal) {
        this.id = id;      
        this.paciente = paciente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
    }

    public Dieta(Paciente paciente) {
       this.paciente = paciente;
    }
    

    public void setPaciente(Paciente persona) {
        this.paciente = persona;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public void setPesoInicial(float pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public void setPesoFinal(float pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

   

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public float getPesoInicial() {
        return pesoInicial;
    }

    public float getPesoFinal() {
        return pesoFinal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
  
    
}
