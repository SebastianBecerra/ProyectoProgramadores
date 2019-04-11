/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista.modelos;
import java.util.List;
import java.sql.Date;
import java.sql.Array;
/**
 *
 * @author RealEnvido
 */
public class Dieta {
    private Array comidas;
    private Paciente paciente;
    private Date fechaInicial;
    private Date fechaFinal;
    private int pesoInicial;
    private int pesoFinal;

    public Dieta(Array comidas, Paciente persona, Date fechaInicial, Date fechaFinal, int pesoInicial, int pesoFinal) {
        this.comidas = comidas;
        this.paciente = persona;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
    }

    public void setComidas(Array comidas) {
        this.comidas = comidas;
    }

    public void setPaciente(Paciente persona) {
        this.paciente = persona;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public void setPesoInicial(int pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public void setPesoFinal(int pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public Array getComidas() {
        return comidas;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public int getPesoInicial() {
        return pesoInicial;
    }

    public int getPesoFinal() {
        return pesoFinal;
    }
    
    
}