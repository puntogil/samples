/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.es14;

import java.util.Scanner;

/**
 *
 * @author gil@tss
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserire un numero da elevare a potenza");
        int base = scanner.nextInt();
        System.out.println("inserire la potenza");
        int esponente = scanner.nextInt();
        
        int potenza = 1;
        int index = 1;
	while ( index <= esponente ) {
	    potenza *= base;
	    index++;
	}
        
        System.out.println("il numero " + base + " elevato a " + esponente + " da:  " + potenza);
    }
}
