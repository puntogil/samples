/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.es20;

import javax.swing.JOptionPane;
// java.lang.Math;
/**
 *
 * @author gil@tss
 */
public class Toolz {
    
    static float insNumero() {
        float ris = 0;
        
        String txtnumero = JOptionPane.showInputDialog("Inserisci numero ");
        
        txtnumero = txtnumero.replaceAll(",",".");
        
        try {
            ris = Float.parseFloat(txtnumero);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRORE assegnato 0\n" + e.getMessage());
        }
        return ris;
    }
    
    static float insNumero(String messaggio) {
        float ris = 0;
        boolean ok = false;
        
        while (!ok){
            String txtnumero = JOptionPane.showInputDialog(messaggio);
            txtnumero = txtnumero.replaceAll(",", ".");

            try {
                ris = Float.parseFloat(txtnumero);
                ok = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRORE assegnato 0\n" + e.getMessage());
            }
        }
        
        /*do {
            String txtnumero = JOptionPane.showInputDialog(messaggio);
            txtnumero = txtnumero.replaceAll(",", ".");

            try {
                ris = Float.parseFloat(txtnumero);
                ok = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRORE assegnato 0\n" + e.getMessage());
                ok = false;
            }
        } while (!ok);*/
        return ris;
    }
    
    static float insNumero(String messaggio, int numero_decimale) {
        float ris = 0;
        
        String txtnumero = JOptionPane.showInputDialog(messaggio);
        txtnumero = txtnumero.replaceAll(",",".");

        try {
            ris = Float.parseFloat(txtnumero);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRORE assegnato 0\n" + e.getMessage());
        }
        // arrotondare a numero decimale
        // 0 -> 1; 1 -> 10 ; 2 -> 100 ; 3 -> 1000
        float potenza = (float) Math.pow(10, numero_decimale);
        ris = Math.round(ris*potenza)/potenza;
        return ris;
    }

    /**
     * Metodo per richiedere tramite messaggio
     * un numero che verra arrotondato
     * alla seconda cifra decimale
     * @param messaggio
     * @return 
     */
    static float insValuta(String messaggio) {
        return insNumero(messaggio, 2);
    }
    
    static float dist3D(float x,float y, float z) {
        float ris = 0;
        double calcolo = (x*x + y*y + z*z);
        calcolo = Math.sqrt(calcolo);
        ris = (float) calcolo;
        // ris = (float) Math.sqrt(x*x + y*y + z*z);
        return ris;
    }
    
    static String giornoSettimana(int day) {
        String giorno;
        switch (day) {
            case 1:
                giorno = "Monday";
                break;
            case 2:
                giorno = "Tuesday";
                break;
            case 3:
                giorno = "Wednesday";
                break;
            case 4:
                giorno = "Thursday";
                break;
            case 5:
                giorno = "Friday";
                break;
            case 6:
                giorno = "Saturday";
                break;
            case 7:
                giorno = "Sunday";
                break;
            default:
                giorno = "Sconosciuto";
        }
        return giorno;
    }

}
