/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;
import javax.swing.JOptionPane;
/**
 *
 * @author GOTEK
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        String sLecturaOpcion;
        int nOpcion;
        String sEntrenamiento = "";
        
        String sMenu = "--- Clasificación de Nadadores ---\n"
                     + "Seleccione una categoría:\n"
                     + "1. Principiante\n"
                     + "2. Intermedio\n"
                     + "3. Avanzado\n\n"
                     + "Ingrese el número de la opciones disponibles:";
        sLecturaOpcion = JOptionPane.showInputDialog(sMenu);
        
        if (sLecturaOpcion != null){
            nOpcion = Integer.parseInt(sLecturaOpcion);
            switch (nOpcion){
                case 1:
                    sEntrenamiento = "Categoría: PRINCIPIANTE\n\n"
                                   + "Entrenamientos sugeridos:\n"
                                   + "• Calentamiento básico.\n"
                                   + "• Ejercicios de flotación.\n"
                                   + "• Estilo libre suave.";
                    break;
                    
                case 2:
                    sEntrenamiento = "Categoría: INTERMEDIO\n\n"
                                   + "Entrenamientos sugeridos:\n"
                                   + "• Calentamiento avanzado.\n"
                                   + "• Técnica de espalda.\n"
                                   + "• Ejercicios de resistencia.";
                    break;
                
                case 3:
                    sEntrenamiento = "Categoría: AVANZADO\n\n"
                                   + "Entrenamientos sugeridos:\n"
                                   + "• Calentamiento intensivo.\n"
                                   + "• Técnica de mariposa.\n"
                                   + "• Nado de velocidad.\n"
                                   + "• Ejercicios de alta resistencia.";
                    break;
                    
                default:
                    sEntrenamiento = "OPCIÓN INVÁLIDA. Por favor de ingresar un número del 1 al 3 para continuar.";
                    break;
            }
            
            JOptionPane.showMessageDialog(null, sEntrenamiento);
        }
    }
}
