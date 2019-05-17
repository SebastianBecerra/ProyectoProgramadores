/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import nutricionista.modelos.Comida;
import nutricionista.modelos.ComidaData;
import nutricionista.modelos.Conexion;
import nutricionista.modelos.Dieta;
import nutricionista.modelos.DietaComida;
import nutricionista.modelos.DietaComidaData;
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
    Paciente pedro = new Paciente("pedro", "barrio cotorra mz 1 cs5", "26648974", "5688779");
    PacienteData p = new PacienteData(con);
    //p.buscarPaciente(1);
    
    System.out.println(p.buscarPaciente(1));
   //List <Paciente> paciente = p.obtenerPaciente();
   //paciente.forEach(pacientes -> {System.out.println("Nombre: "+ pacientes.getNombre()+"  Domicilio: "+pacientes.getDomicilio()+" Celular: "+pacientes.getCelular());});
    
    //*PRUEBA DE INGRESAR COMIDA Y HACER LA CONSULTA DE LAS QUE TIENEN MENOS DE UNA CIERTA CANTIDAD DE CALORIAS     
    //ComidaData cd = new ComidaData(con);
   // Comida asado = new Comida("asado", 800, "tres porciones");
    //Comida lomoPizza = new Comida("lomoPizza", 1600, "cuatro porciones");
    //List<Comida> lista = cd.obtenerComidas2(900.0);
    //cd.guardarComida(asado); 
   //cd.guardarComida(lomoPizza); 

     

    //PRUEBA DIETA
     
     DietaData dd = new DietaData(con);
     //Dieta laLuna = new Dieta(pedro,LocalDate.now(),LocalDate.now(),90,80);
     //dd.guardarDieta(laLuna);// ANTES SE TIENE QUE INSERTAR UN PACIENTE
     
     
     //COMPORTAMIENTO 1 MOSTRAR PACIENTES QUE DEBEN BAJAR MAS DE UNA CANTIDAD DE KILOS DADOS
//     List <Paciente> paciente = dd.buscarPacientesQueDebenBajar(9);
  //   paciente.forEach(pacientes -> {System.out.println("Paciente a Bajar mas de ese peso:"+ pacientes.getNombre());});

     
    //PRUEBA DIETACOMIDA
    DietaComidaData dcd = new DietaComidaData(con);
    //DietaComida laNueva = new DietaComida(laLuna,asado);
    //DietaComida laNueva2 = new DietaComida(laLuna,lomoPizza);

    //dcd.guardarDietaComida(laNueva);    // ANTES SE TIENE QUE INSERTA UNA DIETA Y UNA COMIDA
   //dcd.guardarDietaComida(laNueva2); // ANTES SE TIENE QUE INSERTA UNA DIETA Y UNA COMIDA
    
   //COMPORTAMIENTO 2 Devolver la cantidad de calorias de la dienta de un paciente Especifico
    int caloriasTotales =0;
    List <Comida> listaSumarCalorias;
    //listaSumarCalorias = dd.CantidadCaloriasDieta(34);
    //caloriasTotales = cd.sumaDeCaloriasComidas(listaSumarCalorias);
    //System.out.println(caloriasTotales);
    String sDate = "17/05/2019";
   LocalDate localDate1 = LocalDate.parse(sDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    System.out.println(sDate);
    
    
    }
    
    
    
}
