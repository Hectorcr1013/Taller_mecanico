/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tallerMecanico.entidades;

import java.awt.Color;
import javax.swing.JPanel;

/**
 * En esta clase se crearan los metodos que se utilizaran para el proceso de datos del proyecto
 * @author Hector
 */
public class Logica {
    
    
    
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
