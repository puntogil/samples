/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moltiplicaconsomma;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class MoltiplicaConSomma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        int numero1 = reader.nextInt();
        System.out.println("Inserisci il secondo numero: ");
        int numero2 = reader.nextInt();
        int indice;
	int prodotto = 0;
        
	for ( indice = 1; indice <= numero1; indice++ ) {
	    prodotto = prodotto + numero2;
	}
        
        System.out.println("Il prodotto " + numero1 + " * " +  numero2 + " = " + prodotto);
    }
    
}
