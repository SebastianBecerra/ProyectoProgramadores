/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista.modelos;
import nutricionista.modelos.Comida;
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
import java.sql.Array;
/**
 *
 * @author RealEnvido
 */
public class DietaData {
    private Connection connection = null;

    public DietaData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    public void guardarDieta(Dieta dieta){ 
        try {
           
            String sql = "INSERT INTO dieta (comidas, persona, fechaInicial, fechaFinal, pesoInicial, pesoFinal) VALUES ( ? , ? , ? , ? , ? , ? );";

          
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setArray(1, dieta.getComidas() );
            ps.setString(2, dieta.getPaciente().getNombre());
            ps.setDate(3, dieta.getFechaInicial());
            ps.setDate(4, dieta.getFechaFinal());
            ps.setInt(5, dieta.getPesoInicial());
            ps.setInt(6, dieta.getPesoFinal());
            
            ps.executeUpdate();
         
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
    }
      public void borrarDieta(String nombrePaciente){
    try {
            
            String sql = "DELETE FROM dieta WHERE paciente = ?;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nombrePaciente);
                      
            ps.executeUpdate();
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }     
    
    }
       public void actualizarDieta(Array comidas, String paciente, Date fechaInicial, Date fechaFinal,int pesoInicial, int pesoFinal){
    
        try {
            
            String sql = "UPDATE cursada SET comidas = ?, paciente = ?, fechaInicial = ?, fechaFinal = ?, pesoInicial = ?, pesoFinal = ? WHERE paciente = ?;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setArray(1, comidas);
            ps.setString(2, paciente);
            ps.setDate(3, fechaInicial);
            ps.setDate(4, fechaFinal);
            ps.setInt(5, pesoInicial);
            ps.setInt(6, pesoFinal);
            ps.setString(7, paciente);
           
            
            ps.executeUpdate();
            
            
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
  
    }
}
