/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tallerMecanico.entidades;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import mx.itson.tallerMecanico.persistencia.Conexion;
import mx.itson.tallerMecanico.ui.Arreglado;
import static mx.itson.tallerMecanico.ui.Arreglado.tblArreglados;
import static mx.itson.tallerMecanico.ui.Main.pnlJFrames;
import mx.itson.tallerMecanico.ui.Reparacion;

/**
 * En esta clase se crearan los metodos que se utilizaran para el proceso de datos del proyecto
 * @author Hector
 */
public class Auto {
    
    private int id;
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private String combustible;
    private String detalle;
    
    public static List<Auto> obtenerTodosReparacion() {
        List<Auto> autos = new ArrayList<>();
        try {
            
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, marca, modelo, anio, color, combustible, detalle FROM taller.Reparacion");
            
            while(resultSet.next()) {
                Auto auto = new Auto();
                auto.setId(resultSet.getInt(1));
                auto.setMarca(resultSet.getString(2));
                auto.setModelo(resultSet.getString(3));
                auto.setAnio(resultSet.getInt(4));
                auto.setColor(resultSet.getString(5));
                auto.setCombustible(resultSet.getString(6));
                auto.setDetalle(resultSet.getString(7));
                
                autos.add(auto);
                
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+ e.getMessage());
        }
        return autos;
    }
    
    
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
     * Muestra en la tabla de reparacion la tabla de la base de datos conectada
     */
    public void mostrarTablaArreglado(){
        
        String consulta = "SELECT * FROM taller.arreglados";
        
        try {
            
            String[] nombreColumnas = {"id", "marca", "modelo", "anio", "color", "combustible", "detalle"};
            String[] registros = new String[7];
            
            DefaultTableModel model2 = new DefaultTableModel(null, nombreColumnas);
            
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
                model2.addRow(registros);
            }
            Arreglado.tblArreglados.setModel(model2);
            
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
     * Elimina la fila seleccionada de la tabla  
     */
    public static void eliminarAutoDeReparacion(){
        
        try {
            
            int filaSeleccionada = Reparacion.tblReparacion.getSelectedRow();
            String consulta = "DELETE FROM taller.reparacion WHERE id=" + Reparacion.tblReparacion.getValueAt(filaSeleccionada,0);
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            
            int n = statement.executeUpdate(consulta);
            
            if (n >= 0) {
                System.out.println("Auto eliminado de tabla reparacion");
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error al intentar elminiar la fila: " + e);
            JOptionPane.showMessageDialog(null, "Selecciona un auto");
        }
        
    }
    
    /**
     * Elimina la fila seleccionada de la tabla  
     */
    public static void eliminarAutoDeArreglado(){
        
        try {
            
            int filaSeleccionada = Arreglado.tblArreglados.getSelectedRow();
            String consulta = "DELETE FROM taller.arreglados WHERE id=" + Arreglado.tblArreglados.getValueAt(filaSeleccionada,0);
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            
            int n = statement.executeUpdate(consulta);
            
            if (n >= 0) {
                System.out.println("Auto eliminado de tabla arreglados");
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error al intentar elminiar la fila: " + e);
            JOptionPane.showMessageDialog(null, "Selecciona un auto");
        }
        
    }
    
    /**
     * Transfiere la fila(el auto) de la tabla reparacion a la tabla arreglado
     */
    public static void transferirAutoAArreglado(){
        try {
            
            int filaSeleccionada = Reparacion.tblReparacion.getSelectedRow();
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            
            int n = statement.executeUpdate("INSERT INTO taller.arreglados(id, marca, modelo, anio, color, combustible, detalle) SELECT id, marca, modelo, anio, color, combustible, detalle FROM taller.reparacion WHERE (id=" + Reparacion.tblReparacion.getValueAt(filaSeleccionada,0)+");");
            
            if (n >= 0) {
                System.out.println("Auto transferido a Arreglado");
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error al intentar transferir el auto: " + e);
        }
    }
    
    /**
     * 
     * @param id
     * @param marca
     * @param modelo
     * @param anio
     * @param color
     * @param combustible
     * @param detalle
     * @return 
     */
    public static boolean editarReparacion(int id, String marca, String modelo, int anio, String color, String combustible, String detalle){
        boolean resultado = false;
        
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "UPDATE taller.reparacion SET marca = ?, modelo = ?, anio = ?, color = ?, combustible = ?, detalle = ? WHERE id = ?";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            
            statement.setString(1, marca);
            statement.setString(2, modelo);
            statement.setInt(3, anio);
            statement.setString(4, color);
            statement.setString(5, combustible);
            statement.setString(6, detalle);
            statement.setInt(7, id);
            
            statement.execute();
            
            resultado = statement.getUpdateCount() == 1;
            conexion.close();
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e);
        }
        
        return resultado;
    }
    
    /**
     * 
     */
    public void obtenerTotal(){
        
        int numeroFilas = tblArreglados.getRowCount();
        int total = numeroFilas * 1000;
        
        Locale local = new Locale("es", "MX");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(local);
        
        Arreglado.lblTotal.setText(formatoMoneda.format(total));
    }
    
    public static Auto obtenerPorIdReparacion(int id){
        
        Auto auto = new Auto();
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement statement = conexion.prepareStatement("SELECT id, marca, modelo, anio, color, combustible, detalle FROM taller.reparacion WHERE id = ?");
            statement.setInt(1, id);
            
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                auto.setId(resultSet.getInt(1));
                auto.setMarca(resultSet.getString(2));
                auto.setModelo(resultSet.getString(3));
                auto.setAnio(resultSet.getInt(4));
                auto.setColor(resultSet.getString(5));
                auto.setCombustible(resultSet.getString(6));
                auto.setDetalle(resultSet.getString(7));
            }
            
        } catch (Exception e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
        return auto;
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
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    /**
     * @return the detalle
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
}
