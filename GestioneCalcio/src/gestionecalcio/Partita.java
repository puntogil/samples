/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecalcio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Partita {
 
    int idPartita;
    Squadra sqCasa;
    Squadra sqVisitatore;
    int puntiSqCasa;
    int puntSqVisitatore;
    String dataPartita;

    public Partita(int idPartita, Squadra sqCasa, Squadra sqVisitatore, int puntiSqCasa, int puntSqVisitatore, String dataPartita) {
        this.idPartita = idPartita;
        this.sqCasa = sqCasa;
        this.sqVisitatore = sqVisitatore;
        this.puntiSqCasa = puntiSqCasa;
        this.puntSqVisitatore = puntSqVisitatore;
        this.dataPartita = dataPartita;
    }

    public int getIdPartita() {
        return idPartita;
    }

    public Squadra getSqCasa() {
        return sqCasa;
    }

    public Squadra getSqVisitatore() {
        return sqVisitatore;
    }

    public int getPuntiSqCasa() {
        return puntiSqCasa;
    }

    public int getPuntSqVisitatore() {
        return puntSqVisitatore;
    }

    public String getDataPartita() {
        return dataPartita;
    }
    
    
    public String getInfo(){
        
        String ris = idPartita + ";" + sqCasa.getIdSquadra() + ";" + sqVisitatore.getIdSquadra() + ";" + puntiSqCasa + ";" + puntSqVisitatore + ";" + dataPartita + "\n";
        return ris;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.idPartita;
        hash = 79 * hash + Objects.hashCode(this.sqCasa);
        hash = 79 * hash + Objects.hashCode(this.sqVisitatore);
        hash = 79 * hash + this.puntiSqCasa;
        hash = 79 * hash + this.puntSqVisitatore;
        hash = 79 * hash + Objects.hashCode(this.dataPartita);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Partita other = (Partita) obj;
        if (this.idPartita != other.idPartita) {
            return false;
        }
        if (this.puntiSqCasa != other.puntiSqCasa) {
            return false;
        }
        if (this.puntSqVisitatore != other.puntSqVisitatore) {
            return false;
        }
        if (!Objects.equals(this.sqCasa, other.sqCasa)) {
            return false;
        }
        if (!Objects.equals(this.sqVisitatore, other.sqVisitatore)) {
            return false;
        }
        if (!Objects.equals(this.dataPartita, other.dataPartita)) {
            return false;
        }
        return true;
    }
    
    
}
