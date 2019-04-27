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
         
          
           
            ps.setInt(1, dieta.getPaciente().getId());
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
            
            String sql = "UPDATE cursada SET idPaciente = ?, fechaInicio = ?, fechaFin = ?, pesoInicial = ?, pesoBuscado = ? WHERE paciente = ?;";

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
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
        public List<Dieta> obtenerDietas(){
         List<Dieta> dietas = new ArrayList<Dieta>();
        PacienteData pd = new PacienteData(con);
 
        try {
            String sql = "SELECT * FROM dieta;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Dieta dieta;
            while(resultSet.next()){
                
                dieta = new Dieta();
                Paciente p = pd.buscarPaciente(resultSet.getInt("idPaciente"));
                dieta.setPaciente(p);
                dieta.setFechaInicial(resultSet.getDate("fechaInicio").toLocalDate());
                dieta.setFechaInicial(resultSet.getDate("fechaFin").toLocalDate());
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
                paciente.setNombre(resultSet.getString("nombre"));  
                pacientes.add(paciente);
            }      
            ps.close();
            
            
            
            
    
        } catch (SQLException ex) {
            System.out.println("Error al buscar Paciente" + ex.getMessage());
        }
        
        return pacientes;
    }
           public List<Comida> CantidadCaloriasDieta(int idPacienteIngresado){
           List<Comida> comidasDieta = new ArrayList<Comida>();

    try {
            
            String sql = "SELECT comida.calorias FROM paciente, dieta , dietacomida ,comida WHERE paciente.idPaciente = ? && dieta.idPaciente = ? && dieta.id = dietacomida.idDieta && dietacomida.idComida = comida.id";
          
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idPacienteIngresado);
            ps.setInt(2, idPacienteIngresado);
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
}
