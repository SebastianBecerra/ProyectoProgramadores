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
   public void guardarPaciente(Paciente paciente){
        try {
            
            String sql = "INSERT INTO paciente (nombre, domicilio, celular, dni) VALUES ( ? , ? , ? ,? );";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getDomicilio());
            ps.setString(3, paciente.getCelular());
            ps.setString(4, paciente.getDni());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un paciente");
            }
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un paciente: " + ex.getMessage());
        }
    }
   
    public void borrarPaciente(int id){
    try {
            
            String sql = "DELETE FROM paciente WHERE idPaciente =?;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
                      
            ps.executeUpdate();
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un paciente : " + ex.getMessage());
        }
        
    
    }
    
   public List<Paciente> obtenerPaciente(){
        List<Paciente> pacientes = new ArrayList<Paciente>();
            

        try {
            String sql = "SELECT * FROM paciente;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Paciente paciente;
            while(resultSet.next()){
                paciente = new Paciente();
                paciente.setIdPaciente(resultSet.getInt("idPaciente"));
                paciente.setNombre(resultSet.getString("nombre"));
                paciente.setDomicilio(resultSet.getString("domicilio"));
                paciente.setCelular(resultSet.getString("celular"));
                paciente.setDni(resultSet.getString("dni"));

                pacientes.add(paciente);
            }      
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return pacientes;
    } 
    
   
   /////////////////////////////////////
    public Paciente buscarPaciente(int id){
    Paciente paciente= null;
    
    try {
            
            String sql = "SELECT * FROM paciente WHERE idPaciente =?;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
           
            
            ResultSet resultSet=ps.executeQuery(); //hace executeQuery porque estamos haciendo un Select  
            
            
            
            while(resultSet.next()){
                
                paciente = new Paciente();
                paciente.setIdPaciente(resultSet.getInt("idPaciente"));
                paciente.setDni(resultSet.getString("dni"));
                paciente.setNombre(resultSet.getString("nombre"));
                paciente.setDomicilio(resultSet.getString("domicilio"));
                paciente.setCelular(resultSet.getString("celular"));

                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar Paciente: " + ex.getMessage());
        }
        
        return paciente;
    }
    public Paciente buscarPacienteNombre(String nombre){
    Paciente paciente=null;
    try {
            
            String sql = "SELECT * FROM paciente WHERE nombre  =?;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, nombre);
           
            
            ResultSet resultSet=ps.executeQuery(); //hace executeQuery porque estamos haciendo un Select
            
            while(resultSet.next()){
                paciente = new Paciente();
                paciente.setIdPaciente(resultSet.getInt("idPaciente"));
                paciente.setDni(resultSet.getString("dni"));
                paciente.setNombre(resultSet.getString("nombre"));
                paciente.setDomicilio(resultSet.getString("domicilio"));
                paciente.setCelular(resultSet.getString("celular"));

                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar alumno: " + ex.getMessage());
        }
        
        return paciente;
    }
      public void actualizarPaciente2(Paciente paciente){
    
        try {
            
            String sql = "UPDATE paciente SET nombre = ?, dni = ? , domicilio = ?, celular = ? WHERE idPaciente = ?;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getDni());
            ps.setString(3 , paciente.getDomicilio());
            ps.setString(4 , paciente.getCelular());
            ps.setInt(5, paciente.getIdPaciente());
            ps.executeUpdate();
            
          
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar Paciente: " + ex.getMessage());
        }
    
    }
      public Paciente buscarPacienteDNI(String dni){
    Paciente paciente=null;
    try {
            
            String sql = "SELECT * FROM paciente WHERE dni  =?;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dni);
           
            
            ResultSet resultSet=ps.executeQuery(); //hace executeQuery porque estamos haciendo un Select
            
            while(resultSet.next()){
                paciente = new Paciente();
                paciente.setIdPaciente(resultSet.getInt("idPaciente"));
                paciente.setDni(resultSet.getString("dni"));
                paciente.setNombre(resultSet.getString("nombre"));
                paciente.setDomicilio(resultSet.getString("domicilio"));
                paciente.setCelular(resultSet.getString("celular"));

                
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar alumno: " + ex.getMessage());
        }
        
        return paciente;
    }
    
}
