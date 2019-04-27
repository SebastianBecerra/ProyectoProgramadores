/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RealEnvido
 */
public class DietaComidaData {
     private Connection con = null;
     private Conexion connection;

    public DietaComidaData (Conexion conexion) {
        try {
            this.connection = conexion;
            con = conexion.getConexion();
        } 
        catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
 public void guardarDietaComida(DietaComida dietaComida){
       /*   DietaData dd = new DietaData(connection);
          ComidaData cd = new ComidaData(connection);*/
        try {
          
            String sql = "INSERT INTO dietacomida (idDieta,idComida) VALUES ( ? , ? );";
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dietaComida.getIdDieta().getId());
            ps.setInt(2, dietaComida.getIdComida().getId());
          
           ps.executeQuery();
            
            ResultSet rs = ps.getGeneratedKeys();

         /*   if (rs.next()) {
                dietaComida.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una DietaComida");
            }*/
            ps.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una DietaComida " + ex.getMessage());
        }
    }
  
}
