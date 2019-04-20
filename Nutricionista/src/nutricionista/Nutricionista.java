/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista;

import java.sql.Array;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nutricionista.modelos.Comida;
import nutricionista.modelos.ComidaData;
import nutricionista.modelos.Conexion;
import nutricionista.modelos.Dieta;
import nutricionista.modelos.DietaData;
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
    Paciente pedro = new Paciente("pedro", "barrio cotorra mz 1 cs5", 26648974, 5688779);
    PacienteData p = new PacienteData(con);
    //p.guardarPaciente(pedro);
    List <Paciente> paciente = p.obtenerPaciente();
    paciente.forEach(pacientes -> {System.out.println("Nombre: "+ pacientes.getNombre()+"  Domicilio: "+pacientes.getDomicilio()+" Celular: "+pacientes.getCelular());});
    
    //*PRUEBA DE INGRESAR COMIDA Y HACER LA CONSULTA DE LAS QUE TIENEN MENOS DE UNA CIERTA CANTIDAD DE CALORIAS     
    ComidaData cd = new ComidaData(con);
    Comida asado = new Comida("asado", 800, "tres porciones");
    Comida lomoPizza = new Comida("lomoPizza", 1600, "cuatro porciones");
    List<Comida> lista = cd.obtenerComidas(900.0);
    lista.forEach( comida ->{System.out.println("nombre: "+ comida.getNombre());} );
    
    //PRUEBA DIETA
    ArrayList<Comida> listaComidas = new ArrayList <Comida>();
    listaComidas.add(asado);
    listaComidas.add(lomoPizza);
  
    //listaComidas.forEach(listaComida -> {System.out.println(" "+ listaComidas.getNombre());});
    DietaData dt = new DietaData(con);
    Dieta miDieta = new Dieta(listaComidas,pedro,LocalDate.now(),LocalDate.now(),90,80);
    miDieta.addDieta(asado);
    miDieta.addDieta(lomoPizza);
    dt.guardarDieta(miDieta);
    
    
    }
    
    
}
