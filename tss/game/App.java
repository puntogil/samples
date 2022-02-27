package game;

public class App 
{
    public static void main( String[] args )
    {
        
        boolean continua = false;
        do
        {

            PDado gioco = new PDado();
            gioco.inizioGioco();

            if(Integer.parseInt(Util.getString("Voi continuare ? Se si, premi 1 o 0 per finire")) == 0)
            {
                Util.stampaConsole("Grazie per giocare!!");
            }
            else
            {
                Util.stampaConsole("Informare i nuovi Giocatore");
                continua = true;
            }

        }while(continua == true);
        
    }
}
