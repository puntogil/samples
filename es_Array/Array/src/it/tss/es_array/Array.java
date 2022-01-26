/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.es_array;

import java.util.Random;

/**
 *
 * @author tss
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int [] input = {12,34,56,3,57,3,5,6,67,45};
        int[] input = generaArrayCasuale(50, 1000);
        ArrayTool.stampa(input);
        System.out.println("Valore trovato: " + ArrayTool.ricerca(input, 5));
        System.out.println("Valore massimo: " + ArrayTool.max(input));
        System.out.println("Valore minimo: " + ArrayTool.min(input));
        System.out.println("Valore medio: " + ArrayTool.media(input));
        ArrayTool.ordina(input);
        System.out.println("Array ordinato: ");
        ArrayTool.stampa(input);
    }

    /**
     *
     * @param ncelle Numero celle dell'array
     * @param max massimo valore dell'intero contenuto nell'array
     * @return un'array con un numero celle pradefinito, e contenente valori interi
     */
    private static int[] generaArrayCasuale(int ncelle, int max) {
        int[] ris = new int[ncelle];
        for (int i = 0; i < ris.length; i++) {
            ris[i] = generaNumeroCasuale(max);
        }
        return ris;
    }

    /**
     *
     * @param max numero massimo di numeri interi nell'array
     * @return Valore di un numero intero che verra assegnato all'array
     */
    private static int generaNumeroCasuale(int max) {
        int min_val = 0;
        Random ran = new Random();
        return ran.nextInt(max) + min_val;
    }
}
