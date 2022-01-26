/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez03;

//import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author gil@tss
 */
public class Lez03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // String dato = JOptionPane.showInputDialog("Messaggio");
        // JOptionPane.showMessageDialog(null, "Il dato inserito é " + dato);
        // String [] scelte = {"Lunedì", "Martedì","Mercoledì","Giovedì", "Venerdì"};
        // Finestra di dialogo di input con una casella combinata 
        // String giorno = (String) JOptionPane.showInputDialog(null, "Scegli un giorno:", "Finestra di dialogo ComboBox", JOptionPane.QUESTION_MESSAGE﻿, null, scelte, scelte[0]);
        // JOptionPane.showMessageDialog(null, "Il giorno selezionato é " + giorno);

        int myvoto = 0;

        String vototx = JOptionPane.showInputDialog("Inserire il voto");
        
        boolean lode = 
                vototx.equalsIgnoreCase("10 e lode")
                ||
                vototx.equalsIgnoreCase("10 con lode")
                ||
                vototx.equalsIgnoreCase("10 lode");

        if (!lode) {
            myvoto = Integer.parseInt(vototx);
        } else {
            myvoto = 10;
        }

        boolean outofrange = (myvoto < 0 || myvoto > 10);
        // Convalido il voto inserito
        if (outofrange) {
            //if (!(myvoto >= 0 && myvoto <= 10)) {
            JOptionPane.showMessageDialog(null, "Il valore del VOTO inserito (" + myvoto + ") del candidato non é valido."
                    + '\n' + "Sono ammessi valori copresi tra 0 - 10");
        } else {
            // Verifico il livello di preparazione
            // Insufficente
            if (myvoto >= 5) {
                JOptionPane.showMessageDialog(null, "Il candidato é stato ammesso");
                // fascia pericolante 5 - 6
                if (myvoto >= 5 && myvoto <= 6) {
                    JOptionPane.showMessageDialog(null, "Pericolante");
                } else {
                    if (myvoto >= 7 && myvoto <= 8) {
                        JOptionPane.showMessageDialog(null, "Discreto");
                    } else {
                        if (lode) {
                            JOptionPane.showMessageDialog(null, "Ottimo con lode");
                        } else {
                            JOptionPane.showMessageDialog(null, "Ottimo");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Il candidato non é stato ammesso");
            }
    }

    }
}
