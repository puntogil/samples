/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.es182;

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
        if (args.length != 1){
            System.out.println("devi passare un numero come parametro");
            System.exit(0);
        }
        
        Scanner nc = new Scanner(System.in);
        System.out.println("Inserisci il numero da analizzare: ");
        
        //int x = nc.nextInt();
        int x = Integer.parseInt(args[0]);
        
        String risultato = analizza(x);
        System.out.println(x + " é " + analizza(x));
    }
    
    public static String analizza(int x) {
        String risultato;
        int n = 1;
        int sommaDivisori = 0;
        while (n < x) {
            if (x % n == 0) {
                sommaDivisori += n;
            }
            n++;
        }

        if (sommaDivisori == x) {
            risultato =" é perfetto";
        } else if (sommaDivisori > x) {
            risultato =" é abbondante";
        } else {
            risultato =" é difettivo";
        }
        
        return risultato;
    }
}
