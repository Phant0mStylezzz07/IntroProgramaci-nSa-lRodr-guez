/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;
import javax.swing.JOptionPane;

/**
 *
 * @author GOTEK
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String sLectura;
        String sNombre;
        String sApellido;
        String sFormatoCorrecto;
        int nPosicionEspacio;
        
        sLectura = JOptionPane.showInputDialog("Ingresa tu Nombre en mayúsculas y su Apellido en minúsculas");
        if (sLectura != null && !sLectura.trim().isEmpty()){
            sLectura = sLectura.trim();
            nPosicionEspacio = sLectura.indexOf(" ");
            if (nPosicionEspacio > 0 && nPosicionEspacio < sLectura.length()-1){
                sNombre = sLectura.substring(0, nPosicionEspacio);
                sApellido = sLectura.substring(nPosicionEspacio + 1).trim();
                sFormatoCorrecto = sNombre.toUpperCase() + " " + sApellido.toLowerCase();
                if (sLectura.equals(sFormatoCorrecto)){
                    JOptionPane.showMessageDialog(null, "El Formato es Correcto.");
                }
            }
            
        }
    }
}
