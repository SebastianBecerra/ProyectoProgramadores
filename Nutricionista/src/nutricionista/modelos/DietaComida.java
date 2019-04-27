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
public class DietaComida {
    private Dieta idDieta;
    private Comida idComida;

    public Dieta getIdDieta() {
        return idDieta;
    }

    public Comida getIdComida() {
        return idComida;
    }

    public void setIdDieta(Dieta idDieta) {
        this.idDieta = idDieta;
    }

    public void setIdComida(Comida idComida) {
        this.idComida = idComida;
    }

    public DietaComida() {
    }

       public DietaComida(Dieta idDieta, Comida idComida) {
        this.idDieta = idDieta;
        this.idComida = idComida;
    }
    
}
