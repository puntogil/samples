/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.es20;

import java.util.Random;
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
    /**
     * carica dati casuali nell'array
     * @param ar array da caricare
     * @param range valore massimo del dato es. 1 ...
     * @return array di interi caricato casualmente con range da 1 a ..
     */
    static int[] loadDataInt(int [] ar, int range){
        for (int i = 0; i < ar.length; i++) {
            double caso = Math.random(); 
            caso = caso*range;
            int valore = (int) caso;
            valore = valore + 1;
            ar[i] = valore; 
        }
        return ar;
    }

    static int[] concatArray(int[] ar1, int[] ar2) {
        if (ar1 == null || ar1.length == 0 || ar2 == null || ar2.length == 0) {
            throw new IllegalArgumentException("Impossibile ordinare l'array,"
                    + " array nullo o vuoto");
        }
        int dim1 = ar1.length;
        int dim2 = ar2.length;
        int dimok = dim1 + dim2;

        int[] arok = new int[dimok];
        int i = 0;
        while (i < dim1) {
            arok[i] = ar1[i];
            i++;
        }

        int idx1 = dim1;
        int idx2 = 0;
        while (idx1 < dimok) {
            arok[idx1] = ar2[idx2];
            idx1++;
            idx2++;
        }
        return arok;
    }
    //static boolean cercaVirus(int[] ar, int[] virus) {
    static int cercaVirus(int[] ar, int[] virus) {
        // boolean ris = false;
        int pos = - 1;
        
        // Controllo il virus sulla prima posizione
        // eseguo n controlli quanto é lungo il virus
        int vlen = virus.length;
        int numerocontrolli = ar.length - vlen;

        for (int k = 0; k < numerocontrolli; k++) {
            // Ciclo controllo sequenza
            boolean ok = true;
            for (int i = 0; i < vlen; i++) {
                if (virus[i] != ar[i + k]) {
                    ok = false;
                    break;
                }
            } // Fine controllo virus in posizione
            
            if (ok) { // Trova virus  
                //ris = true;
                pos = k;
                break;
            } // Ripasso al prossimo controllo
        }

        //return ris;
        return pos;
    }
    
    /**
     *
     * @param max numero massimo di numeri interi nell'array
     * @return Valore di un numero intero
     * che verra assegnato all'array
     */
    private static int generaNumeroCasuale(int max) {
        int min_val = 0;
        Random ran = new Random();
        return ran.nextInt(max) + min_val;
    }
    
    /**
     *
     * @param ncelle Numero celle dell'array
     * @param max massimo valore dell'intero contenuto nell'array
     * @return un'array con un numero celle pradefinito e
     * contenente valori interi
     */
    private static int[] generaArrayCasuale(int ncelle, int max) {
        int[] ris = new int[ncelle];
        for (int i = 0; i < ris.length; i++) {
            ris[i] = generaNumeroCasuale(max);
        }
        return ris;
    }

    static void stampa(String messaggio, int[] arok) {
        if (arok == null || arok.length == 0){
            throw new IllegalArgumentException("Impossibile eseguire la stamèa,"
                    + " array nullo o vuoto");
        }
        int i = 0;
        System.out.println(messaggio);
        while (i < arok.length) {
            System.out.print(arok[i] + ", ");
            i++;
        }
        System.out.println("");
    }
}
