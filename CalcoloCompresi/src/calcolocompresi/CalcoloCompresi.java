/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolocompresi;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class CalcoloCompresi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         System.out.println("Inserisci il primo numero: ");
         int x = reader.nextInt();
         System.out.println("Inserisci il secondo numero: ");
         int y = reader.nextInt();
         int somma = 0;
         int z = 0;
         int i = 0;
         
         if (x > y){
             // scambio in modo che y > x
             z = x;
             x = y;
             y = z;
         }
         
         for(i = x;i <= y;i++) {
             somma = somma + i;   
         }
         
         System.out.println("La somma dei numeri compresi tra " + x + " e " +  y + " é: " + somma);
    }
    
}
