/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;
import javax.swing.JOptionPane;

/**
 *
 * @author GOTEK
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        String sLectura;
        String sNuevoTitulo;
        int nNumero;
        int nContador;
        int nSumatoria;
        
        sLectura = JOptionPane.showInputDialog("Ingresar el titulo de la Noticia");

        if(sLectura.length()>15){
            JOptionPane.showMessageDialog(null, "La Noticia tiene un titulo largo");
            sNuevoTitulo = sLectura.substring( 0, 15);
            JOptionPane.showMessageDialog(null, sNuevoTitulo + "...");
        }else if (sLectura.length()<=15 && sLectura.length()> 5){
            JOptionPane.showMessageDialog(null, "La Noticia tiene un titulo mediano");
            JOptionPane.showMessageDialog(null, sLectura);
        }
        else {
            
            JOptionPane.showMessageDialog(null, "La Noticia tiene un titulo corto");
            JOptionPane.showMessageDialog(null, sLectura);
        
        }
    }
}
