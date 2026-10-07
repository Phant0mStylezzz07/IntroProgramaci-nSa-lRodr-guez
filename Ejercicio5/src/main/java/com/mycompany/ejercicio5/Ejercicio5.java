/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;
import javax.swing.JOptionPane;
/**
 *
 * @author GOTEK
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        String sContraseña;
        sContraseña = JOptionPane.showInputDialog("Crea una contraseña (mínimo 8 caracteres):");
        if (sContraseña != null){
            if (sContraseña.length() >= 8){
                JOptionPane.showMessageDialog(null, "La contraseña pasa la validación.");
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña NO es válida. Debe tener al menos 8 caracteres");
            }
        }
    }
}
