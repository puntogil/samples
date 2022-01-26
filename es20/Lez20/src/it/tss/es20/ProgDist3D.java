/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.es20;

import javax.swing.JOptionPane;

/**
 *
 * @author gil@tss
 */
public class ProgDist3D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float x,y,z;
        x = Toolz.insNumero("Coordinata x");
        y = Toolz.insNumero("Coordinata y");
        z = Toolz.insNumero("Coordinata z");
        float distanza = Toolz.dist3D(x, y, z);
        System.out.println("Distanza: " + distanza);
        
    }
}
