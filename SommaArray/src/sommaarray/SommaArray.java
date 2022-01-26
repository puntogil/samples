/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sommaarray;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class SommaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        boolean readint;
        String numero;
        int numeri[] = new int[10];
        int indice = 0;
        
        do {
            System.out.println("Inserisci un numero: ");
            numero = reader.nextLine();
            numeri[indice]= Integer.parseInt(numero);
            indice = indice + 1;
            readint = numero.equals("0");
        } while(!readint && indice < numeri.length);

        int somma = 0;
        int ind = 0;
        
        while(ind < numeri.length){
            somma = somma + numeri[ind];
            ind = ind + 1;
        } 

        System.out.println("la somma é: " + somma);
        
    }
    
}
