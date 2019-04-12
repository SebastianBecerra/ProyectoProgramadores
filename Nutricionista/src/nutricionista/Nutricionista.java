/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import nutricionista.modelos.Conexion;
import nutricionista.modelos.Paciente;
import nutricionista.modelos.PacienteData;

/**
 *
 * @author usuario
 */
public class Nutricionista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    
    Conexion con = new Conexion();
    //Paciente pedro = new Paciente("pedro", "barrio cotorra mz 1 cs5", 26648974, 5688779);
    PacienteData p = new PacienteData(con);
    //p.guardarPaciente(pedro);
    List <Paciente> paciente = p.obtenerPaciente();
    paciente.forEach(pacientes -> {System.out.println("Nombre: "+ pacientes.getNombre()+"  Domicilio: "+pacientes.getDomicilio());});
    
    }
    
    
}
