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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author RealEnvido
 */
public class DietaData {
    private Connection connection = null;
    private Conexion con;

    public DietaData(Conexion conexion) {
        try {
            this.con = conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    public void guardarDieta(Dieta dieta){ 
        try {
           
            String sql = "INSERT INTO dieta ( idPaciente, fechaInicio, fechaFin, pesoInicial, pesoBuscado) VALUES ( ? , ? , ? , ? , ? );";

          
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         
          
           
            ps.setInt(1, dieta.getPaciente());
            ps.setDate(2, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(3, Date.valueOf(dieta.getFechaFinal()));
            ps.setFloat(4, dieta.getPesoInicial());
            ps.setFloat(5, dieta.getPesoFinal());
            
            ps.executeQuery();
           // ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                dieta.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alumno");
            }
         
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una Dieta: " + ex.getMessage());
        }
    }
      public void borrarDieta2(int id){
    try {
            
            String sql = "DELETE FROM dieta WHERE id = ?;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
                      
            ps.executeUpdate();
                        
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una Dieta: " + ex.getMessage());
        }     
    
    }
       public void actualizarDieta(Dieta dietaN){
    
        try {
            
            String sql = "UPDATE dieta SET id = ? ,idPaciente = ?, fechaInicio = ?, fechaFin = ?, pesoInicial = ?, pesoBuscado = ? WHERE dieta.id = ?;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dietaN.getId());
            ps.setInt(2, dietaN.getPaciente());
            ps.setDate(3, java.sql.Date.valueOf(dietaN.getFechaInicial()));
            ps.setDate(4, java.sql.Date.valueOf(dietaN.getFechaFinal()));
            ps.setFloat(5,dietaN.getPesoInicial());
            ps.setFloat(6, dietaN.getPesoFinal());
            ps.setInt(7, dietaN.getId());
           
            
            ps.executeUpdate();
            
            
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una Dieta " + ex.getMessage());
        }
  
    }
        public List<Dieta> obtenerDietas3(){
         List<Dieta> dietas = new ArrayList<Dieta>();
        PacienteData pd = new PacienteData(con);
        
        try {
            String sql = "SELECT * FROM dieta;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Dieta dieta;
            while(resultSet.next()){
                
                dieta = new Dieta();
                dieta.setId(resultSet.getInt("id"));
                dieta.setPaciente(resultSet.getInt("idPaciente"));
                dieta.setFechaInicial(resultSet.getDate("fechaInicio").toLocalDate());
                dieta.setFechaFinal(resultSet.getDate("fechaFin").toLocalDate());
                dieta.setPesoInicial(resultSet.getFloat("pesoInicial"));
                dieta.setPesoFinal(resultSet.getFloat("pesoBuscado"));
               
                dietas.add(dieta);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las Dietas " + ex.getMessage());
        }
        
        
        return dietas;
    }
    public List<Paciente> buscarPacientesQueDebenBajar(int peso){
          List<Paciente> pacientes = new ArrayList<Paciente>();

    try {
            
            String sql = "SELECT paciente.nombre FROM paciente, dieta WHERE dieta.pesoInicial - ? > dieta.pesoBuscado && dieta.idPaciente = paciente.idPaciente";
          
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, peso);
            ResultSet resultSet=ps.executeQuery(); //hace executeQuery porque estamos haciendo un Select
            Paciente paciente;
            while(resultSet.next()){
                paciente = new Paciente();
                paciente.setIdPaciente(resultSet.getInt("idPaciente"));
                paciente.setNombre(resultSet.getString("nombre"));
                paciente.setDni(resultSet.getString("dni"));
                paciente.setDomicilio(resultSet.getString("direccion"));
                paciente.setCelular(resultSet.getString("celular"));
                
                pacientes.add(paciente);
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar Paciente" + ex.getMessage());
        }
        
        return pacientes;
    }
         public List<Comida> CantidadCaloriasDieta4(int idPacienteIngresado){
           List<Comida> comidasDieta = new ArrayList<Comida>();

    try {
            
            String sql = "SELECT comida.calorias FROM dietacomida ,comida WHERE dietacomida.idComida = comida.id && dietacomida.idDieta = ?";
          
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idPacienteIngresado);
          
            ResultSet resultSet=ps.executeQuery(); //hace executeQuery porque estamos haciendo un Select
            Comida comida;
            while(resultSet.next()){
                comida = new Comida();
                comida.setCalorias(resultSet.getInt("calorias"));  
                comidasDieta.add(comida);
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar Paciente" + ex.getMessage());
        }
        
        return comidasDieta;
    }
         
    public Dieta buscarDieta(int id){
    Dieta dieta=null;
    try {
            
            String sql = "SELECT * FROM dieta WHERE id =?;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
           
            
            ResultSet resultSet=ps.executeQuery(); //hace executeQuery porque estamos haciendo un Select
            
            while(resultSet.next()){
                dieta = new Dieta();
                dieta.setId(resultSet.getInt("id"));
                dieta.setPaciente(resultSet.getInt("idPaciente"));
                dieta.setFechaInicial(resultSet.getDate("fechaInicio").toLocalDate());
                dieta.setFechaFinal(resultSet.getDate("fechaFin").toLocalDate());
                dieta.setPesoInicial(resultSet.getFloat("pesoInicial"));
                dieta.setPesoFinal(resultSet.getFloat("pesoBuscado"));
            }      
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una Comida: " + ex.getMessage());
        }
        
        return dieta;
    }
    public Dieta buscarDietaIDcondni(String id){
    Dieta dieta=null;
    try {
            
            String sql = "SELECT dieta.* FROM dieta,paciente WHERE paciente.dni=? && dieta.idPaciente = paciente.idPaciente;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, id);
           
            
            ResultSet resultSet=ps.executeQuery(); //hace executeQuery porque estamos haciendo un Select
            
            while(resultSet.next()){
                dieta = new Dieta();
                dieta.setId(resultSet.getInt("id"));
               
            }      
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una Comida: " + ex.getMessage());
        }
        
        return dieta;
    }
    public Dieta buscarDietaporPaciente (int id){
    Dieta dieta=null;
    try {
            
            String sql = "SELECT * FROM dieta WHERE idPaciente =?;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
           
            
            ResultSet resultSet=ps.executeQuery(); //hace executeQuery porque estamos haciendo un Select
            
            while(resultSet.next()){
                dieta = new Dieta();
                dieta.setId(resultSet.getInt("id"));
                dieta.setPaciente(resultSet.getInt("idPaciente"));
                dieta.setFechaInicial(resultSet.getDate("fechaInicio").toLocalDate());
                dieta.setFechaFinal(resultSet.getDate("fechaFin").toLocalDate());
                dieta.setPesoInicial(resultSet.getFloat("pesoInicial"));
                dieta.setPesoFinal(resultSet.getFloat("pesoBuscado"));
            }      
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una Comida: " + ex.getMessage());
        }
        
        return dieta;
    }
}
