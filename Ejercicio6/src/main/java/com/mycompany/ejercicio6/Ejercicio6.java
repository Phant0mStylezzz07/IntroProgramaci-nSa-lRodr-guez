/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;
import javax.swing.JOptionPane;
/**
 *
 * @author GOTEK
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        String sLecturaIngreso;
        String sLecturaMonto;
        double dIngresoMensual;
        double dMontoPrestamo;
        double dTasaIntereses = 0;
        double dInteresCalculado;
        double dMontoTotal;
        sLecturaIngreso = JOptionPane.showInputDialog("Ingrese su ingreso mensual ($):");
        sLecturaMonto = JOptionPane.showInputDialog("Ingrese el monto del préstamo deseado ($):");
        if (sLecturaIngreso != null && sLecturaMonto != null){
            dIngresoMensual = Double.parseDouble(sLecturaMonto);
            dMontoPrestamo = Double.parseDouble(sLecturaMonto);
            if (dIngresoMensual > 3000){
                dTasaIntereses = 0.05;
            } else if (dIngresoMensual > 1500 && dIngresoMensual <= 3000){
                dTasaIntereses = 0.07;
            } else {
                dTasaIntereses = 0;
            }
            
            if (dTasaIntereses > 0){
                dInteresCalculado = dMontoPrestamo * dTasaIntereses;
                dMontoTotal = dMontoPrestamo + dInteresCalculado;
                JOptionPane.showMessageDialog(null, 
                        "--- Préstamo Aprobado ---\n" + 
                        "Tasa de interés aplicada: " + (dTasaIntereses * 100) + "%\n" +
                        "Interés a pagar: $" + dInteresCalculado + "\n" + 
                        "Monto total a pagar: $" + dMontoTotal
                );
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, con un ingreso mensual de $" + dIngresoMensual + " no se ofrece préstamo.");
            }
        }
    }
}
