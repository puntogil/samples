/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author gil
 */
public class Partita {
    int idPartita;
    Squadra squadraCasa;
    Squadra squadraOspite;
    int puntiSquadraCasa;
    int puntiSquadraOspite;
    String dataPartita;

    public Partita(int idPartita, Squadra squadraCasa, Squadra squadraOspite, int puntiSquadraCasa, int puntiSquadraOspite, String dataPartita) {
        this.idPartita = idPartita;
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.puntiSquadraCasa = puntiSquadraCasa;
        this.puntiSquadraOspite = puntiSquadraOspite;
        this.dataPartita = dataPartita;
    }

    public int getIdPartita() {
        return idPartita;
    }

    public Squadra getSqCasa() {
        return squadraCasa;
    }

    public Squadra getSqVisitatore() {
        return squadraOspite;
    }

    public int getPuntiSqCasa() {
        return puntiSquadraCasa;
    }

    public int getPuntSqVisitatore() {
        return puntiSquadraOspite;
    }

    public String getDataPartita() {
        return dataPartita;
    }
    
    
    public String getInfo(){
        
        String ris = idPartita + ";" + squadraCasa.getIdSquadra() + ";" + squadraOspite.getIdSquadra() + ";" + puntiSquadraCasa + ";" + puntiSquadraOspite + ";" + dataPartita + "\n";
        return ris;
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
        if (this.puntiSquadraCasa != other.puntiSquadraCasa) {
            return false;
        }
        if (this.puntiSquadraOspite != other.puntiSquadraOspite) {
            return false;
        }
        if (!Objects.equals(this.squadraCasa, other.squadraCasa)) {
            return false;
        }
        if (!Objects.equals(this.squadraOspite, other.squadraOspite)) {
            return false;
        }
        if (!Objects.equals(this.dataPartita, other.dataPartita)) {
            return false;
        }
        return true;
    }
}
