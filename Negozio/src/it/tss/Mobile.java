/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss;

/**
 *
 * @author puntogil
 */
public class Mobile implements Articolo {
    private String nome;
    private double prezzo;
    private double larghezza;
    private double altezza;
    private double profondita;

    public Mobile(String nome, double prezzo, double larghezza, double altezza, double profondita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getProfondita() {
        return profondita;
    }
    
    public String getNome() {
        return this.nome;
    }

    public double getPrezzo() {
        return this.prezzo;
    }

    public String toString() {
        /*return this.nome + " Prezzo: " + prezzo + " Misure: " + larghezza + " X "
                + altezza + " X " + profondita;*/
        return "Mobile{" + "nome: " + nome + ", prezzo: " + prezzo 
                + ", larghezza: " + larghezza + ", altezza: " 
                + altezza + ", profondita: " + profondita + '}';
    }

}
