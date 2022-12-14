package mx.itson.tallerMecanico.entidades;

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
    
    /**
     * Este metodo obtiene todos los datos de la tabla de reparacion
     * @return La lista de los datos de la tabla de reparacion
     */
    public static List<Auto> obtenerTodosReparacion() {
        List<Auto> autos = new ArrayList<>();
        try {
            
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, marca, modelo, anio, color, combustible, detalle FROM taller.reparacion");
            
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
     * Este metodo obtiene todos los datos de la tabla de Arreglado
     * @return La lista de los datos de la tabla de arreglado
     */
    public static List<Auto> obtenerTodosArreglado() {
        List<Auto> autos = new ArrayList<>();
        try {
            
            Connection conexion = Conexion.obtener();
            Statement statement = conexion.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id, marca, modelo, anio, color, combustible, detalle FROM taller.arreglados");
            
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
     * @param marca El marca del auto que se agregar??
     * @param modelo El modelo del auto que se agregar??
     * @param anio El a??o del auto que se agregar??
     * @param color El color del auto que se agregar??
     * @param combustible El tipo de combusible que se agregar??
     * @param detalle El defecto por el que entrar?? el auto al taller
     * @return Retorna si se ejecut?? la actualizacion en la base de datos.
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
     * Elimina la fila seleccionada de la tabla de reparacion
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
     * Elimina la fila seleccionada de la tabla de arreglado
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
     * Edita los valores de la tabla reparacion
     * @param id El id unico del auto que se editar?? de la tabla reparacion
     * @param marca El marca del auto que se editar?? de la tabla reparacion
     * @param modelo El modelo del auto que se editar?? de la tabla reparacion
     * @param anio El a??o del auto que se editar?? de la tabla reparacion
     * @param color El color del auto que se editar?? de la tabla reparacion
     * @param combustible El tipo de combusible que se editar?? de la tabla reparacion
     * @param detalle El defecto por el que el auto entr?? al taller y que se editar?? de la tabla reparacion
     * @return resultado si se actualiz?? la cuenta o no de la tabla reparacion
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
     * Edita los valores de la tabla arreglado
     * @param id El id unico del auto que se editar?? de la tabla reparacion
     * @param marca El marca del auto que se editar?? de la tabla reparacion
     * @param modelo El modelo del auto que se editar?? de la tabla reparacion
     * @param anio El a??o del auto que se editar?? de la tabla reparacion
     * @param color El color del auto que se editar?? de la tabla reparacion
     * @param combustible El tipo de combusible que se editar?? de la tabla reparacion
     * @param detalle El defecto por el que el auto entr?? al taller y que se editar?? de la tabla reparacion
     * @return resultado si se actualiz?? la cuenta o no de la tabla reparacion
     */
    public static boolean editarArreglado(int id, String marca, String modelo, int anio, String color, String combustible, String detalle){
        boolean resultado = false;
        
        try {
            Connection conexion = Conexion.obtener();
            String consulta = "UPDATE taller.arreglados SET marca = ?, modelo = ?, anio = ?, color = ?, combustible = ?, detalle = ? WHERE id = ?";
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
     * Obtiene el total de lo generado por todos los autos reparados
     */
    public void obtenerTotal(){
        
        int numeroFilas = tblArreglados.getRowCount();
        int total = numeroFilas * 1000;
        
        Locale local = new Locale("es", "MX");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(local);
        
        Arreglado.lblTotal.setText(formatoMoneda.format(total));
    }
    
    /**
     * Obtiene los valores de la fila que se seleccione con el id que se pase en el parametro de la tabla reparacion
     * @param id Se obtienen los valores de la fila a partir del id de  la tabla de reparacion
     * @return Los valores de la fila del id seleccionado de la tabla reparacion
     */
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
     * Obtiene los valores de la fila que se seleccione con el id que se pase en el parametro de la tabla arreglado
     * @param id Se obtienen los valores de la fila a partir del id de  la tabla de reparacion
     * @return Los valores de la fila del id seleccionado de la tabla reparacion
     */
    public static Auto obtenerPorIdArreglado(int id){
        
        Auto auto = new Auto();
        try {
            Connection conexion = Conexion.obtener();
            PreparedStatement statement = conexion.prepareStatement("SELECT id, marca, modelo, anio, color, combustible, detalle FROM taller.arreglados WHERE id = ?");
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
     * Se utilizar?? para cuando est?? seleccionado un panel del menu en el ui principal
     * @param panel Nombre del panel que queramos establecerle el color
     */
    public static void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    
    /**
     * Establece un panel del color rgb que pongamos
     * Se ultilizar?? para cuando se deje de seleccionar un panel del men?? en el ui principal
     * @param panel Nombre del panel que queramos establecerle el color
     */
    public static void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    
    /**
     * Obtiene el id
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el id 
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la marca
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene el modelo
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece el modelo
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene el a??o
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }

    /**
     * Establece el a??o
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * Obtiene el color
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene el combustible
     * @return the combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * Establece el combustible
     * @param combustible the combustible to set
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    /**
     * Obtiene el detalle
     * @return the detalle
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * Establece el detalle
     * @param detalle the detalle to set
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
}
