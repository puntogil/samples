/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez03es2;

/**
 * title green pass
 * @author gil@tss
 */
public class Lez03ES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // data di oggi
        int oggi = 749;
        // dati validita ministero, durata
        int durata_v1 = 30;
        int durata_v2 = 120;
        int durata_v3 = 120;
        int durata_tampone = 2;
        int durata_covid = 180;
        // dati soggetto
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int tampone = 0;
        int covid = 0;
        
        v1 = 700;
        int dv1 = oggi - v1;
        boolean okv1 = (dv1 <= durata_v1);
        
        v2 = 700;
        int dv2 = oggi - v2;
        boolean okv2 = (dv2 <= durata_v2);
        
        v3 = 700;
        int dv3 = oggi - v3;
        boolean okv3 = (dv3 <= durata_v3);
        
        tampone = 700;
        int dtampone = oggi - tampone;
        boolean oktampone = (dtampone <= durata_tampone);
        
        covid = 700;
        int dcovid = oggi - covid;
        boolean okcovid = (dcovid <= durata_covid);
        
        boolean greenpass = okv1 || okv2 || okv3 || oktampone || okcovid;
        
        if (greenpass){
            System.out.println("greenpass valido");
        } else {
            System.out.println("greenpass scaduto");
        }
    }
    
}
