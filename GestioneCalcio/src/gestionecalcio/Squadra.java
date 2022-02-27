/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecalcio;

import java.util.Objects;

/**
 *
 * @author tss
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
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.sede);
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
