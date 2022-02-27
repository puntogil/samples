package game;

public class Giocatore {

    private String nome;
    private int punteggio;
    private int partitegiocata;
    private int partitevinte;
    private int partiteuguale;
    private int partitepersa;

    
    public Giocatore(String nome) {
        this.nome = nome;
        this.punteggio = 0;
        this.partitegiocata = 0;
        this.partitevinte = 0;
        this.partiteuguale = 0;
        this.partitepersa = 0;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the punteggio
     */
    public int getPunteggio() {
        return punteggio;
    }

    /**
     * @param punteggio the punteggio to set
     */
    public void setPunteggio(int punteggio) {
        this.punteggio += punteggio;
    }

    /**
     * @return int return the partitegiocata
     */
    public int getPartitegiocata() {
        return partitegiocata;
    }

    /**
     * @param partitegiocata the partitegiocata to set
     */
    public void setPartitegiocata(int partitegiocata) {
        this.partitegiocata += partitegiocata;
    }

    /**
     * @return int return the partitevinte
     */
    public int getPartitevinte() {
        return partitevinte;
    }

    /**
     * @param partitevinte the partitevinte to set
     */
    public void setPartitevinte(int partitevinte) {
        this.partitevinte += partitevinte;
    }

    /**
     * @return int return the partiteuguale
     */
    public int getPartiteuguale() {
        return partiteuguale;
    }

    /**
     * @param partiteuguale the partiteuguale to set
     */
    public void setPartiteuguale(int partiteuguale) {
        this.partiteuguale += partiteuguale;
    }

    /**
     * @return int return the partitepersa
     */
    public int getPartitepersa() {
        return partitepersa;
    }

    /**
     * @param partitepersa the partitepersa to set
     */
    public void setPartitepersa(int partitepersa) {
        this.partitepersa += partitepersa;
    }

    public int giocaDado()
    {
        int ris = 0;
        do 
            ris = Util.geraNumeroCasuale(6);
        while (ris == 0);

        return ris;

    }




}