/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista.modelos;
import nutricionista.modelos.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/**
 *
 * @author RealEnvido
 */
public class PacienteData {
     private Connection connection = null;

    public PacienteData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } 
        catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
   
}
