/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somma;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Somma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        boolean readint;
        int somma = 0;
        String numero;
        
        do {
            System.out.println("Inserisci un numero: ");
            numero = reader.nextLine();
            somma = somma + Integer.parseInt(numero);
            readint = numero.equals("0");
        } while(!readint);

        System.out.println("la somma é: " + somma);
        
    }
    
}
