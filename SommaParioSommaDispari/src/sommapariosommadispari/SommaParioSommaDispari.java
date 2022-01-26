/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sommapariosommadispari;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class SommaParioSommaDispari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        boolean readint;
        int sommad = 0;
        int sommap = 0;
        int indiced = 0;
        int indicep = 0;
        String numero;
        
        do {
            System.out.println("Inserisci un numero: ");
            numero = reader.nextLine();
            if (Integer.parseInt(numero) % 2 == 0){
                sommap = sommap + Integer.parseInt(numero);
                indicep = indicep + 1;
            } else {
                sommad = sommad + Integer.parseInt(numero);
                indiced = indiced + 1;
            }
            readint = numero.equals("0");
        } while(!readint);
        
        int mediad = 0;
        int mediap = 0;
        
        if (indicep > 0)
            mediap = sommap / 2;
      
        if (indiced > 0)
            mediad = sommad / 2;
        
        System.out.println("la media dei numeri pari é: " + mediap 
                + '\n' + "la media dei numeri dispari é: " + mediad);
        
        if (mediap > mediad){
            System.out.println("La media dei numeri pari é maggiore" + '\n' 
                    + "della media dei numeri dispari");
        } else if (mediad > mediap) {
            System.out.println("La media dei numeri dispari é maggiore" + '\n' 
                    + "della media dei numeri pari");
        } else {
            System.out.println("La media dei numeri pari é uguale" + '\n' 
                    + "alla media dei numeri dispari");
        }
        
    }
}
