/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author gil
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Catalogo<Prodotto> catalogoP = new Catalogo<Prodotto>();

        Prodotto a = new Prodotto("Telefono", 500.00);
        Prodotto b = new Prodotto("Pc", 800.00);
        Prodotto c = new Prodotto("Tastiera", 20.00);

        catalogoP.aggiungiArticolo(a);
        catalogoP.aggiungiArticolo(b);
        catalogoP.aggiungiArticolo(c);

        System.out.println(catalogoP.getArticoliSottoPrezzo(100).toString());
        
        Catalogo<Mobile> catalogoM = new Catalogo<Mobile>();
        
        ProvaMobile mobile = new ProvaMobile();

        Mobile d = new Mobile("scrivania", 120.00, 50.00, 45.00, 60.00);
        Mobile e = new Mobile("mobile antico", 1200.00, 20.00, 30.00, 45.00);
        Mobile f = new Mobile("tavolo", 95.00, 70.00, 60.00, 45.00);

        catalogoM.aggiungiArticolo(d);
        catalogoM.aggiungiArticolo(e);
        catalogoM.aggiungiArticolo(f);

        mobile.scegliMobile(catalogoM.catalogo, 100.00, 10.00, 100.00, 200.00);
        
        System.out.println(catalogoM.catalogo.toString());
    }
}
