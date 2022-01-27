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
        if (numeri == null || numeri.length == 0){
            throw new IllegalArgumentException("Impossibile eseguire la stamèa,"
                    + " array nullo o vuoto");
        }
        int i = 0;
        while (i < numeri.length) {
            System.out.print(numeri[i] + ", ");
            i++;
        }
        System.out.println("");
    }

    static boolean ricerca(int numeri[], int numero) {
        if (numeri == null || numeri.length == 0){
            throw new IllegalArgumentException("Impossibile eseguire la ricerca,"
                    + " array nullo o vuoto");
        }
        boolean trovato = false;
        int i = 0;
        while (i < numeri.length && !trovato) {
            if (numeri[i] == numero) {
                trovato = true;
            }
            i++;
        }
        return trovato;
    }

    static int max(int numeri[]) {
        if (numeri == null || numeri.length == 0){
            throw new IllegalArgumentException("Impossibile calcolare il massimo,"
                    + " array nullo o vuoto");
        }
        int massimo = numeri[0];
        int i = 1;
        while (i < numeri.length) {
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }
            i++;
        }
        return massimo;
    }

    static int min(int numeri[]) {
        if (numeri == null || numeri.length == 0){
            throw new IllegalArgumentException("Impossibile calcolare il minimo,"
                    + " array nullo o vuoto");
        }
            
        int minimo = numeri[0];
        int i = 1;
        while (i < numeri.length) {
            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
            i++;
        }
        return minimo;
    }

    static double media(int numeri[]) {
        if (numeri == null || numeri.length == 0){
            throw new IllegalArgumentException("Impossibile eseguirere la media,"
                    + " array nullo o vuoto");
        }
        return (double) somma(numeri) / numeri.length;
    }

    static int somma(int numeri[]){
        if (numeri == null || numeri.length == 0){
            throw new IllegalArgumentException("Impossibile calcolare la somma,"
                    + " array nullo o vuoto");
        }
   
        int s = 0;
        int i = 0;
        while (i < numeri.length) {
            s += numeri[i];
            i++;
        }
        return s;
    }
    
    /**
     * ritorna una copia dell'array numeri
     *
     * @param numeri
     * @return
     */
    static int[] copia(int[] numeri) {
        if (numeri == null || numeri.length == 0){
            throw new IllegalArgumentException("Impossibile ordinare l'array,"
                    + " array nullo o vuoto");
        }
        int i = 0;
        int [] copy = new int[numeri.length];
        while (i < copy.length) {
            copy[i] = numeri[i];
            i++;
        }
        return copy;
    }

    /**
     * ritorna un array contenente l'unione di numeri1 e numeri2
     *
     * @param numeri1
     * @param numeri2
     * @return
     */
    static int[] unisci(int[] numeri1, int[] numeri2) {
        if (numeri1 == null || numeri1.length == 0 || numeri2 == null || numeri2.length == 0) {
            throw new IllegalArgumentException("Impossibile ordinare l'array,"
                    + " array nullo o vuoto");
        }

        int i = 0;
        int[] uniti = new int[(numeri1.length + numeri2.length)];
        while (i < numeri1.length) {
            uniti[i] = numeri1[i];
            i++;
        }

        int idx1 = numeri1.length;
        int idx2 = 0;
        while (idx1 < uniti.length) {
            uniti[idx2 + numeri1.length] = numeri2[idx2];
            idx1++;
            idx2++;
        }
        return uniti;
    }

    /**
     * ritorna true se numeri1 contiene numeri2 nella sequenza corretta
     *
     * @param numeri1
     * @param numeri2
     * @return
     */
    static boolean contieneSequenza(int[] numeri1, int[] numeri2) {
        if (numeri1 == null || numeri1.length == 0 || numeri2 == null || numeri2.length == 0){
            throw new IllegalArgumentException("Impossibile ordinare l'array,"
                    + " array nullo o vuoto");
        }
        boolean contienevalori = false;
        for (int i = 0; i < numeri1.length; i++) {
            contienevalori = ricerca(numeri2, numeri1[i]);
            if (contienevalori == false) break;
        }
        return contienevalori;
    }

    /**
     * ritorna true se numeri1 contiene tutti i valori di numeri2 in qualunque
     * sequenza
     *
     * @param numeri1
     * @param numeri2
     * @return
     */
    static boolean contieneValori(int[] numeri1, int[] numeri2) {
        if (numeri1 == null || numeri1.length == 0 || numeri2 == null || numeri2.length == 0){
            throw new IllegalArgumentException("Impossibile ordinare l'array,"
                    + " array nullo o vuoto");
        }
        boolean contienevalori = false;
        for (int i = 0; i < numeri1.length; i++) {
            contienevalori = ricerca(numeri2, numeri1[i]);
            if (contienevalori == false) break;
        }
        return contienevalori;
    }

    /**
     * ritorna un array con solo i valori contenuti in entrambi gli array
     * sequenza
     *
     * @param numeri1
     * @param numeri2
     * @return
     */
    static boolean intersezione(int[] numeri1, int[] numeri2) {
        if (numeri1 == null || numeri1.length == 0 || numeri2 == null || numeri2.length == 0){
            throw new IllegalArgumentException("Impossibile ordinare l'array,"
                    + " array nullo o vuoto");
        }
        boolean contienevalori = false;
        int[] temp = new int[numeri1.length];
        for (int i = 0; i < numeri1.length; i++) {
            contienevalori = ricerca(numeri2, numeri1[i]);
            if (contienevalori == true){
                temp[i] = numeri1[i];
            }
        }
        return true;
    } 
    
    static void ordinaBubble(int[] numeri) {
        boolean ordinato;
        do {
            ordinato = true;
            int indice = 0;
            while (indice < numeri.length - 1) {
                if (numeri[indice] > numeri[indice + 1]) {
                    int tmp = numeri[indice];
                    numeri[indice] = numeri[indice + 1];
                    numeri[indice + 1] = tmp;
                    ordinato = false;
                }
                indice = indice + 1;
            }
        } while (!ordinato);
    }
    
    static void ordina(int numeri[]) {
        if (numeri == null || numeri.length == 0){
            throw new IllegalArgumentException("Impossibile ordinare l'array,"
                    + " array nullo o vuoto");
        }
        int temp = 0;
        for (int i = 1; i < numeri.length; i++) {
            for (int j = 0; j < numeri.length; j++) {
                if (numeri[i] > numeri[j]) {
                    temp = numeri[i];
                    numeri[i] = numeri[j];
                    numeri[j] = temp;
                }
            }
        }
    }
}
