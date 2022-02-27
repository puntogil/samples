/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss;

import java.util.Objects;

/**
 *
 * @author gil
 */
public class Squadra {
    int idsquadra;
    String nome;
    String sede;

    public Squadra(int idsquadra, String nome, String sede) {
        this.idsquadra = idsquadra;
        this.nome = nome;
        this.sede = sede;
    }

    
    public int getIdSquadra() {
        return idsquadra;
    }
    
    public String getNome() {
        return nome;
    }

    public String getSede() {
        return sede;
    }
    
    public String getInfo(){
        String ris = idsquadra + ";" + nome + ";" + sede + "\n";
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
        final Squadra other = (Squadra) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sede, other.sede)) {
            return false;
        }
        return true;
    }
}
