/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;
import javax.swing.JOptionPane;

/**
 *
 * @author GOTEK
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String sTitulo;
        String sPrimeraLetra;
        String sRestoTexto;
        String sTituloCorrecto;
        sTitulo = JOptionPane.showInputDialog("Ingrese su Titulo de tu Libro:");
        if (sTitulo != null && !sTitulo.trim().isEmpty()){
            sTitulo = sTitulo.trim();
            if (sTitulo.equals(sTitulo.toUpperCase()) || sTitulo.equals(sTitulo.toLowerCase())){
                sPrimeraLetra = sTitulo.substring(0, 1).toUpperCase();
                sRestoTexto = sTitulo.substring(1).toLowerCase();
                sTituloCorrecto = sPrimeraLetra + sRestoTexto;
                JOptionPane.showMessageDialog(null, "Título Corregido: " + sTituloCorrecto);
                
        } else {
                JOptionPane.showMessageDialog(null, "Título original: " + sTitulo);
            }
            
        }
    }
}
