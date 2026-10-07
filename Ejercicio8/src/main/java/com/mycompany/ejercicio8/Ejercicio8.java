/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;
import javax.swing.JOptionPane;
/**
 *
 * @author GOTEK
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        String sLecturaArticulo;
        String sLecturaMonto;
        
        int nCantidadArticulo;
        double dMontoGastado;
        double dPorcentajeDescuento = 0;
        double dMontoDescuento;
        double dTotalPagar;
        
        sLecturaArticulo = JOptionPane.showInputDialog("Ingrese la cantidad de artículos comprados:");
        sLecturaMonto = JOptionPane.showInputDialog("Ingrese el monto total gastado (&):");
        
        if (sLecturaArticulo != null && sLecturaMonto != null){
            nCantidadArticulo = Integer.parseInt(sLecturaArticulo);
            dMontoGastado = Double.parseDouble(sLecturaMonto);
            
            if (nCantidadArticulo > 5 && dMontoGastado > 100){
                dPorcentajeDescuento = 0.10;
            } else if (nCantidadArticulo > 3 || dMontoGastado > 50){
                dPorcentajeDescuento = 0.05;
            } else {
                dPorcentajeDescuento = 0.0;
            }
            
            dMontoDescuento = dMontoGastado * dPorcentajeDescuento;
            dTotalPagar = dMontoGastado - dMontoDescuento;
            
            if (dPorcentajeDescuento > 0){
                JOptionPane.showMessageDialog(null, 
                    "--- Resumen de Compra ---\n" +
                    "Monto original: $" + dMontoGastado + "\n" +
                    "Descuento aplicado: " + (dPorcentajeDescuento * 100) + "%\n" +
                    "Ahorro total: $" + dMontoDescuento + "\n" +
                    "Total a pagar: $" + dTotalPagar
                );  
            } else {
                JOptionPane.showMessageDialog(null, 
                        "--- Resumen de Compra ---\n" +
                        "Monto total a pagar $" + dMontoGastado + "\n" +
                        "No aplica para ningún descuento."
                );
            }
        }
    }
}
