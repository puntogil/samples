/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez02;

import java.util.Scanner;
/**
 *
 * @author gil@tss
 */
public class Lez02Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String [] generi = {"femmina","maschio","neutro","trans","questioning"};
        System.out.println(generi[0]);
        System.out.println(generi[3]);
        generi[3] = "transgender";
        System.out.println(generi.length);
        System.out.println(generi[generi.length - 1]);
        
        for (int i = 0; i < generi.length; i++){
            System.out.println((i + 1) + ". " + generi[i]);
        }*/
        
        //Programma per caricare lelenchi di nomi
        
        String nomi[]; // nomi sara elenco con elenco partecipanti
        int acconti[];
        int quanti; // variabile che conterra la dimensione fornita dall'utente'
        
        Scanner lettoreI = new Scanner(System.in); // creo scanner per fornire imput utente (lunghezza array)
        System.out.println("Quanti nominativi vuoi inserire?");
        quanti = lettoreI.nextInt(); // carico la dimensione fornita dall'utente
        nomi = new String[quanti]; // dimensiono la lista da richiesta precedente
        acconti = new int[quanti];
        
        Scanner lettoreS = new Scanner(System.in); // creo scanner per fornire imput utente (nomi in base alla lunghezza array fornita in prece)
        for (int i = 0; i < nomi.length; i++){
            String nome;
            int acconto;
            System.out.println("Inserisci nome (" + (i + 1) + "/" + nomi.length + ") : " );
            nome = lettoreS.nextLine(); // carico i/l nome/i fornita dall'utente
            nomi[i] = nome;// inserisco il nome fornita dall'utente nell'elenco
            System.out.println("Inserisci acconto di " + nomi[i].toUpperCase() + ": " ); // si rompe qui
            acconto = lettoreI.nextInt();
            acconti[i] = acconto;
        }
        //.toUpperCase()
        for (int i = 0; i < nomi.length; i++){
            System.out.println((i + 1) + ". " + nomi[i] + " acconto: " + acconti[i]); // stampa elenco fornita dall'utente
        }
        
        System.out.println("Inserisci nome da cercare" ); //chiedo nome da cercare
        String cerca = lettoreS.nextLine(); // carico i/l nome/i fornita dall'utente
        
        boolean trovato = false;
      
        int j = 0;
        for (j = 0; j < nomi.length; j++){
            if (cerca.equalsIgnoreCase(nomi[j])) {
                trovato = true;
                break; 
            }// else trovato = false;
        }
        //.toUpperCase()
        if (trovato){
            System.out.println("Trovata corrispondenza " + nomi[j]);
        } else {
            System.out.println("Corrispondenza NON trovata"  + nomi[j]);
        }
        
        int totale = 0;
        for (int i = 0; i < nomi.length; i++){
            totale += acconti[i];
        }
        System.out.println("Totale acconti: " + totale);
        
        // elimino oggetti scanner
        lettoreI.close();
        lettoreS.close();
        
        //System.out.println(nomi[0]);
        /*System.out.println("\n Elenco prezzi");
        String prezzi[];
        int indprez = 12;
        prezzi = new String[indprez];
        prezzi[0] = "Luca";
        System.out.println(prezzi[0]);*/
        
        
    }
    
}
