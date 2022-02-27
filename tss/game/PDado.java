package game;


public class PDado {
    
    private int punteggioalvo;

    public PDado() {
       
        this.punteggioalvo = Util.getInteger("Inserire il valore per vincere");
    }

    /**
     * @return int return the valorealvo
     */
    public int getpunteggioalvo() {
        return this.punteggioalvo;
    }

    /**
     * @param valorealvo the valorealvo to set
     */
    public void setValorealvo(int _punteggioalvo) {
        this.punteggioalvo = _punteggioalvo;
    }

    public void inizioGioco()
    {

        
        Giocatore g1 = new Giocatore(Util.getString("Inserire Nome del primo Giocatore"));
        Giocatore g2 = new Giocatore(Util.getString("Inserire Nome del secondo Giocatore"));
        int dadoatuale = 0;
        boolean gioca = false;

        do
        {
            gioca = false;
            Util.stampaConsole("Giocatore in tavolo: " + g1.getNome());
            
            g1.setPunteggio(g1.giocaDado());

            if (g1.getPunteggio()  <= this.punteggioalvo)
            {
                
                Util.stampaConsole("Punteggio attuale:" + String.valueOf(g1.getPunteggio()));
                
                if (Util.getInteger("Informare 0 per fermare o 1 per continuare") == 1)
                    gioca = true;
               
            }
            else
            {
                Util.stampaConsole("Punteggio attuale: " + String.valueOf(g1.getPunteggio() + dadoatuale) + " è supperiore al limite di Gioco. Se " + g2.getNome() + " non superare il limite, avera perso!");
            }

        } while (gioca == true);


        do
        {
            gioca = false;
            Util.stampaConsole("Giocatore in tavolo: " + g2.getNome());
            
            g2.setPunteggio(g2.giocaDado());

            if (g2.getPunteggio()  <= this.punteggioalvo)
            {
                
                Util.stampaConsole("Punteggio attuale:" + String.valueOf(g2.getPunteggio()));
                
                if (Util.getInteger("Informare 0 per fermare o 1 per continuare") == 1)
                    gioca = true;
               
            }
            else
            {
                Util.stampaConsole("Punteggio attuale:" + String.valueOf(g2.getPunteggio() + dadoatuale) + " è supperiore al limite di Gioco. Se" + g1.getNome() + " non superare il limite, avera perso!");
            }

        } while (gioca == true);

        g1.setPartitegiocata(1);
        g2.setPartitegiocata(1);

        if((g1.getPunteggio() <= this.punteggioalvo) && (g2.getPunteggio() <= this.punteggioalvo))
        {
            if(g1.getPunteggio() == g2.getPunteggio())
            {
                Util.stampaConsole("I punti sono uguale, nessuno hai vinto");
                
                g1.setPartiteuguale(1);
                g2.setPartiteuguale(1);

            }
            else
            {
                if (g1.getPunteggio() > g2.getPunteggio())
                {
                    g1.setPartitevinte(1);
                    g2.setPartitepersa(1);

                    Util.stampaConsole("Vincedore è: " + g1.getNome());
    
                }
                else
                {
                    g2.setPartitevinte(1);
                    g1.setPartitepersa(1);

                    Util.stampaConsole("Vincedore è: " + g2.getNome());
                }
            }
        }
        else
        {
            if ((g1.getPunteggio() > this.punteggioalvo) && (g2.getPunteggio() > this.punteggioalvo))
            {
                g1.setPartitepersa(1);
                g2.setPartitepersa(1);

                Util.stampaConsole("No ce ne vincedore");
            }
            else
            {
                if (g1.getPunteggio() <= this.punteggioalvo)
                {
                    g1.setPartitevinte(1);
                    g2.setPartitepersa(1);

                    Util.stampaConsole("Vincedore è: " + g1.getNome());
                }
                else
                {
                    g2.setPartitevinte(1);
                    g1.setPartitepersa(1);

                    Util.stampaConsole("Vincedore è: " + g2.getNome());
                }
            }
        }
        

    }



}