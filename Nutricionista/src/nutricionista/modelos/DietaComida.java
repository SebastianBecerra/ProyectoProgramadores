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
    private int idDieta;
    private int idComida;

    public int getIdDieta() {
        return idDieta;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public DietaComida() {
    }

       public DietaComida(int idDieta, int idComida) {
        this.idDieta = idDieta;
        this.idComida = idComida;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
