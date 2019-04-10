/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista.modelos;


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
 * @author Usuario
 */
public class ComidaData {
    private Connection connection = null;

    public ComidaData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    //metodo que devuelve lista de comidas cuyas calorias son menores
    //al parametro indicado
    public List<Comida> obtenerComidas(Double calorias){
        List<Comida> comidas = new ArrayList<Comida>();
            

        try {
            String sql = "SELECT * FROM comida WHERE calorias < ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1, calorias);
            ResultSet resultSet = statement.executeQuery();
            Comida comida;
            while(resultSet.next()){
                comida = new Comida();
                comida.setId(resultSet.getInt("idComida"));
                comida.setNombre(resultSet.getString("nombre"));
                comida.setCalorias(resultSet.getDouble("calorias"));
                comidas.add(comida);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return comidas;
    }
    
    
    }
    

