/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author gil
 */
public class ProvaMobile {
   public List<Mobile> scegliMobile(List<Mobile> catalogo, double prezzo,
            double larghezza, double altezza, double profondita) {
    /*public static <T extends Mobile> List<T> scegliMobile(Catalogo<T> catalogo, double prezzo,
            double larghezza, double altezza, double profondita) {
        
        List<T> selezionati = new ArrayList<T>();
        List<T> selezionatiPerPrezzo
                = catalogo.getArticoliSottoPrezzo(prezzo);
        Iterator<T> it = selezionatiPerPrezzo.iterator();
        while (it.hasNext()) {
            T el = it.next();
            if (el.getLarghezza() < larghezza && el.getAltezza() < altezza
                    && el.getProfondita() < profondita) {
                selezionati.add(el);
            }
        }
        return selezionati;*/

        return catalogo.stream()
                .filter(v -> v.getPrezzo() < prezzo)
                .filter(v -> v.getLarghezza() < larghezza)
                .filter(v -> v.getAltezza() < altezza)
                .filter(v -> v.getProfondita() < profondita)
                .collect(Collectors.toList());
    }
}
