/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisione;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Divisione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        int numero1 = reader.nextInt();
        System.out.println("Inserisci il secondo numero: ");
        int numero2 = reader.nextInt();
        
	int counter = 0;
        int indice = numero1;

	while ( indice >= numero2 ) {
	    indice = indice - numero2;
	    counter++;
        }
        
        int resto = numero1 % numero2;
        System.out.println("La divisione " + numero1 + " / " +  numero2 + " = " + counter);
        if (resto != 0) System.out.println("Con resto = " + resto);
    }
    
}
