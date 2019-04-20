/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista.modelos;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
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
           
            String sql = "INSERT INTO dieta (idComida, idPaciente, fechaInicio, fechaFin, pesoInicial, pesoBuscado) VALUES ( ? , ? , ? , ? , ? , ? );";

          
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         
          for (Comida number : dieta.getComidas()) 
           {
            ps.setInt(1,number.getId());
            ps.setInt(2, dieta.getPaciente().getId());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(4, Date.valueOf(dieta.getFechaFinal()));
            ps.setFloat(5, dieta.getPesoInicial());
            ps.setFloat(6, dieta.getPesoFinal());
            
            ps.executeQuery();
           // ps.executeUpdate();
           }
         
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una Dieta: " + ex.getMessage());
        }
    }
      public void borrarDieta(String nombrePaciente){
    try {
            
            String sql = "DELETE FROM dieta WHERE idPaciente = ?;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nombrePaciente);
                      
            ps.executeUpdate();
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una Dieta: " + ex.getMessage());
        }     
    
    }
       public void actualizarDieta(Array comidas, String paciente, Date fechaInicial, Date fechaFinal,int pesoInicial, int pesoFinal){
    
        try {
            
            String sql = "UPDATE cursada SET idComida = ?, idPaciente = ?, fechaInicio = ?, fechaFin = ?, pesoInicial = ?, pesoBuscado = ? WHERE paciente = ?;";

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
            System.out.println("Error al insertar una Dieta " + ex.getMessage());
        }
  
    }
}
