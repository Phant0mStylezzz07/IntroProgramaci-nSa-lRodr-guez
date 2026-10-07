/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;
import javax.swing.JOptionPane;
/**
 *
 * @author GOTEK
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int nRolValido;
        int nEstaSancionado;
        int nCorreoConfirmado;
        
        nRolValido = JOptionPane.showConfirmDialog(
            null, 
            "¿Es usted un Profesor/Estudiante registrado?", 
            "Verificación de Rol", 
            JOptionPane.YES_NO_OPTION
        );
        
        nEstaSancionado = JOptionPane.showConfirmDialog(
                null, 
                "¿Has sido sancionado?", 
                "Estado de Sanción", 
                JOptionPane.YES_NO_OPTION
        );
        
        nCorreoConfirmado = JOptionPane.showConfirmDialog(
            null, 
            "¿Has confirmado su correo electrónico?", 
            "Verificación de Correo", 
            JOptionPane.YES_NO_OPTION
        );
        
        if (nRolValido != JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "ACCESO DENEGADO: Solo se permite el acceso a profesores o estudiantes registrados.");
        } else if (nEstaSancionado == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "ACCESO DENEGADO: El usuario ha sido sancionado y no podrá continuar");
        } else if (nCorreoConfirmado != JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "ACCESO DENEGADO: El correo electrónico no ha sido confirmado.");
        } else {
            JOptionPane.showMessageDialog(null, "ACCESO CONCEDIDO: Bienvenido a la plataforma.");
        }
    }
}
