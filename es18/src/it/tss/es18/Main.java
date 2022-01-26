/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.es18;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println("Inserisci il numero da analizzare: ");
        int x = nc.nextInt();
        int n = 1;
        
        int sommaDivisori = 0;
        
        while (n < x){
            if (x % n == 0){
                sommaDivisori += n;
            }
            n++;
        }
        
        if (sommaDivisori == x){
            System.out.println("il numero " + x + " é perfetto");
        } else if (sommaDivisori > x) {
            System.out.println("il numero " + x + " é abbondante");
        } else {
            System.out.println("il numero " + x + " é difettivo");
        }
        
        
    }
    
}
