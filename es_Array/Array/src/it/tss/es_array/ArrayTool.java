/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.es_array;

/**
 *
 * @author tss
 */
public class ArrayTool {

    static void stampa(int[] numeri) {
        for (int i = 0; i < numeri.length -1; i++) {
            System.out.print(numeri[i] + ", ");
        }
        System.out.println("");
    }
    
    static boolean ricerca(int numeri[], int numero) {
        boolean trovato = false;
        for (int i = 0; i < numeri.length -1; i++) {
            if ( numeri[i] == numero){
                trovato = true;
            }
        }
        return trovato;
    }

    static int max(int numeri[]) {
        int massimo = 0;
        for (int i = 0; i < numeri.length -1; i++) {
            if (numeri[i] > massimo )
                massimo  = numeri[i];
        }
        return massimo;
    }

    static int min(int numeri[]) {
        int minimo = numeri[0];
        for (int i = 0; i < numeri.length -1; i++) {
            if (numeri[i] < minimo )
                minimo = numeri[i];
        }
        //stampa(minimo);
        return minimo;
    }

    static int media(int numeri[]) {
        int somma = 0;
        for (int i = 0; i < numeri.length -1; i++) {
                somma += numeri[i];
        }
        somma = somma/numeri.length;;
        return somma;
    }

    static void ordina(int numeri[]) {
        int temp = 0;
        for (int i = 0; i < numeri.length -1; i++) {
            for (int j = 0; j < numeri.length -1; j++) {
                if (numeri[i] > numeri[j]){
                    temp = numeri[i];
                    numeri[i] = numeri[j];
                    numeri[j] = temp;
                }
            }  
        }
    }
}
