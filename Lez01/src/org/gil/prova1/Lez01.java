/*
 * Copyright 2021 gil

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package org.gil.prova1;

/**
 *
 * @author gil@tss
 */

import java.util.Scanner;

public class Lez01 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //String msg = "buondi";
        //int numero_msg = 4515 ;
        /*int addendo1 = 0 ;
        int addendo2 = 0 ;
        int somma = 0 ;
        
        //float temperature = 12.5f;
       // String numero_msg = "buondi";
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Inserire primo addendo: ");
        addendo1 = reader.nextInt();
        System.out.println("Inserire secondo addendo: ");
        addendo2 = reader.nextInt();
        reader.close();
        
        /*txt = reader.nextLine();*/
        
        /*somma = addendo1 + addendo2;*/
        
        //numero_msg = "La somma di " + addendo1 + " + " +addendo2 + " é: ";
        /*System.out.println("La somma di " + addendo1 + " + " +addendo2 + " é: " + somma);*/
        
        //System.out.println(numero_msg  + somma);
        
        // TODO code application logic here
        /*System.out.println(msg + " - " + numero_msg +
                '\n' + temperature +
                '\n' + "ciao" +
                '\n' + txt);*/
        //System.out.println(num_msg);
        
        int prezzo1 = 0;
        int prezzo2 = 0;
        int saldo = 0;
        //int quantita = 0;

        Scanner reader = new Scanner(System.in);
        
        System.out.println("Dimmi il primo prezzo: ");
        prezzo1 = reader.nextInt();
        
        System.out.println("Dimmi il secondo prezzo: ");
        prezzo2 = reader.nextInt();
        
        System.out.println("Dimmi il tuo saldo: ");
        saldo = reader.nextInt();
        
        reader.close();
        
        System.out.println("I costi dei singoli articoli sono: " + prezzo1 + ", " + prezzo2);
        
        int somma = 0 ;
        somma = prezzo1 + prezzo2 ;
        
        String compra_msg = "";
        
        if (saldo >= somma) {
            compra_msg = "Compra";
            int resto = 0;
            resto = saldo - somma;
            compra_msg = compra_msg + '\n';
            compra_msg = compra_msg + "ti rimangono ~: ";
            compra_msg = compra_msg + resto;
            compra_msg = compra_msg + " €";
            System.out.println(compra_msg);
        } else {
            compra_msg = "Non puoi comprare";
            int mancano = 0;
            mancano = somma - saldo;
            compra_msg = compra_msg + '\n';
            compra_msg = compra_msg + "ti mancano ~: ";
            compra_msg = compra_msg + mancano;
            compra_msg = compra_msg + " €";
            System.out.println(compra_msg);
        }
    }
    
}
