package mx.itson.tallerMecanico.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * En esta clase se creará la conexion entre la base de datos y java
 * @author Hector
 */
public class Conexion {
    
    /**
     * Obtiene una conexión hacia la base de datos utilizando los parámetros proporcionados.
     * @return La conexión inicializada hacia la base de datos.
     */
    public static Connection obtener(){
        
        Connection conexion = null;
        
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/taller", "root", "1323");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("Ocurrio un error al conectar a la base de datos: "+e);
        }
        
        return conexion;
    }
}
