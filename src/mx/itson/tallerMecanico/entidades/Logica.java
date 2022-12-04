/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tallerMecanico.entidades;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import mx.itson.tallerMecanico.persistencia.Conexion;
import mx.itson.tallerMecanico.ui.Reparacion;

/**
 * En esta clase se crearan los metodos que se utilizaran para el proceso de datos del proyecto
 * @author Hector
 */
public class Logica {
    
    /**
     * Muestra en la tabla de reparacion la tabla de la base de datos conectada
     */
    public void mostrarTablaReparacion(){
        
        String consulta = "SELECT * FROM taller.reparacion";
        
        try {
            
            String[] nombreColumnas = {"id", "marca", "modelo", "anio", "color", "combustible", "detalle"};
            String[] registros = new String[7];
            
            DefaultTableModel model1 = new DefaultTableModel(null, nombreColumnas);
            
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery(consulta);
            
            while(resultSet.next()){
                registros [0] = resultSet.getString("id");
                registros [1] = resultSet.getString("marca");
                registros [2] = resultSet.getString("modelo");
                registros [3] = resultSet.getString("anio");
                registros [4] = resultSet.getString("color");
                registros [5] = resultSet.getString("combustible");
                registros [6] = resultSet.getString("detalle");
                
                model1.addRow(registros);
            }
            Reparacion.tblReparacion.setModel(model1);
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }
    }
    
    /**
     * Inserta en la base de datos los valores que se agregan en los parametros
     * @param marca El marca del auto que se agregará
     * @param modelo El modelo del auto que se agregará
     * @param anio El año del auto que se agregará
     * @param color El color del auto que se agregará
     * @param combustible El tipo de combusible que se agregará
     * @param detalle El defecto por el que entrará el auto al taller
     * @return Retorna si se ejecutó la actualizacion en la base de datos.
     */
    public static boolean guardar(String marca, String modelo, int anio, String color, String combustible, String detalle){
        boolean resultado = false;
        try {
            
           String consulta = "INSERT INTO taller.reparacion (marca, modelo, anio, color, combustible, detalle) VALUES (?, ?, ?, ?, ?, ?)";
           Connection conexion = Conexion.obtener();
           PreparedStatement statement = conexion.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
           statement.setString(1, marca);
           statement.setString(2, modelo);
           statement.setInt(3, anio);
           statement.setString(4, color);
           statement.setString(5, combustible);
           statement.setString(6, detalle);
           statement.executeUpdate();
           
           resultado = statement.getUpdateCount() == 1;
           
        } catch (Exception e) {
            System.out.println("Ocurrio un error al agregar la fila: " + e);
        }
        return resultado;
    }
    
    /**
     * Establece un panel del color rgb que pongamos
     * Se utilizará para cuando esté seleccionado un panel del menu en el ui principal
     * @param panel Nombre del panel que queramos establecerle el color
     */
    public static void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    
    /**
     * Establece un panel del color rgb que pongamos
     * Se ultilizará para cuando se deje de seleccionar un panel del menú en el ui principal
     * @param panel Nombre del panel que queramos establecerle el color
     */
    public static void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    
}
