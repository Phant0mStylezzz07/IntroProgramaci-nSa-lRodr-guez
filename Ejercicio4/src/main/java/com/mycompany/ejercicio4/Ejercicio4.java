/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;
import javax.swing.JOptionPane;
/**
 *
 * @author GOTEK
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        String sPlatillo;
        sPlatillo = JOptionPane.showInputDialog("Ingrese el nombre del platillo:");
        if (sPlatillo != null && !sPlatillo.trim().isEmpty()){
            if (sPlatillo.toLowerCase().contains("vegetariano")){
                JOptionPane.showMessageDialog(null, "El platillo '" + sPlatillo + "' es vegetariano.");
            } else {
                JOptionPane.showMessageDialog(null, "El platillo '" + sPlatillo + "' NO es vegetariano.");
            }
        }
    }
}
