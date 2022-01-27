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
        //float x,y,z;
        //x = Toolz.insNumero("Coordinata x");
        //y = Toolz.insNumero("Coordinata y");
        //z = Toolz.insNumero("Coordinata z");
        //float distanza = Toolz.dist3D(x, y, z);
        //System.out.println("Distanza: " + distanza);
        
        int dim1 = (int)Toolz.insNumero("dimensione array 1");
        int dim2 = (int)Toolz.insNumero("dimensione array 2");
        
        //int [] ar1 = new int [dim1];
        int [] ar1 = new int [2000];
        int [] ar2 = new int [dim2];
        int [] arok = new int [dim1 + dim2];
        
        //ar1 = Toolz.loadDataInt(ar1, 10);
        ar1 = Toolz.loadDataInt(ar1, 500);
        Toolz.stampa("array 1 :", ar1);
        ar2 = Toolz.loadDataInt(ar2, 5);
        Toolz.stampa("array 2 : ",ar2);
        arok = Toolz.concatArray(ar1, ar2);
        Toolz.stampa("array uniti : ",arok);
        //System.out.println("primo elemento ar1: " + ar1[0]);
        //boolean virus = Toolz.cercaVirus(ar1, ar2);
        
        int [] file = {123,234,345,234,123,234};
        file = Toolz.concatArray(ar1, file);
        int [] virus = {345,234,123};
        int posvirus = Toolz.cercaVirus(file, virus);
        System.out.println("Posizione virus : " + posvirus);
    }
}
