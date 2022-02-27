package app220203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileManager {

    public static void stampaFile(String _file) {
        String path = "/home/tss/Andre/Java/Lavori/220203/app/src/main/java/app220203/Data_Utente/" + _file + ".txt";
        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(path));
            String linea = "";
            String auxlinea = "";
            while (true) 
            {
                if (linea == null) 
                {
                    break;
                }
                else
                {
                    auxlinea = buffRead.readLine();
                    try
                    {
                        if (!auxlinea.equalsIgnoreCase("null") )
                        {
                            linea = auxlinea;
                            Util.stampaConsole(linea);
                        }
                    }
                    catch (Exception e) {
                        Util.stampaConsole("Final do arquivo");
                        break;
                    }
                }
              
            }
            buffRead.close();    
        } catch (Exception e) {
            Util.stampaConsole(e.getMessage());
         
        }
        
	}

    public static String writerFile(String _file, String messagio) {

        String path = "/home/tss/Andre/Java/Lavori/220203/app/src/main/java/app220203/Data_Utente/" + _file + ".txt";

        String linea = "";
        String auxlinea = "";
        boolean controllofile = true;
        
        try {
        
            BufferedReader buffRead = new BufferedReader(new FileReader(path));

            do
            {
                if (linea == null) 
                {
                    controllofile  = false;
                }
                else
                {
                    auxlinea = buffRead.readLine();
                    try
                    {
                        if (!auxlinea.equalsIgnoreCase("null") )
                        {
                            linea += auxlinea + "\n"; //letto e accumulato

                            /*
                            per inserire qualcosa in mezzo del arquivo, implementare qui
                            if (auxlinea.equalsIgnoreCase("Teste3"))
                            {
                                linea += "Teste3.1" + "\n"; //letto e accumulato
                            }
                            */
                           
                            //Util.stampaConsole(linea); //mete in console quello che già sia su linea
                        }
                    }
                    catch (Exception e) {
                        // Util.stampaConsole("Finale del arquivo");
                        /*
                            Arrivato alla fine dell arquivo: Adesso se hai fatto modifica o deve incluire una o piu linea alla fine,
                            deve implemetare cosa voi accumulare a linea e doppo essequire buffWrite
                        */
                       
                        try {
                            
                            //se voi inserie qualcosa alla fine del arquivo, implementare qui
                            if (messagio.length() > 0)
                            { 
                                linea += messagio;
                            }

                            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
                            buffWrite.append(linea + "\n"); //grava il file con tutto che ce ne in linea
                            buffWrite.close();   
               
                            } catch (Exception e1) {
                                Util.stampaConsole("Non è possibilie inserire una linea nuova");
                        }

                        controllofile = false;
                    }
                }
              
            }while(controllofile == true);

            buffRead.close();     //fechando o arquivo no final

        } catch (Exception e) 
        {
            Util.stampaConsole(e.getMessage());
        }
        
        return linea;
	}

    static void createFileMessagio(String _file, String _contenuto) {
        String path = "/home/tss/Andre/Java/Lavori/220203/app/src/main/java/app220203/Data_Utente/" + _file + ".txt";
        try {
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

            String linea = _contenuto;
            buffWrite.append(linea + "\n");
            
            buffWrite.close();    

        } catch (Exception e) {
            Util.stampaConsole(e.getMessage());
        }
	}

    static boolean createFileVouto(String _nomefile){
        //throw new UnsupportedOperationException("Non ancora implementato!!");

        String path = "/home/tss/Andre/Java/Lavori/220201/app/src/main/java/appscuola/Data_Utente/" + _nomefile + ".txt";

        try {
    
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
            buffWrite.close();
            return true;

        } catch (IOException e) {
            Util.stampaConsole(e.getMessage());
            return false;
        }

    }

    static void getDataFile(String _nomefile)
    {
        //throw new UnsupportedOperationException("Non ancora implementato!!");

        String path = "/home/tss/Andre/Java/Lavori/220201/app/src/main/java/appscuola/Data_Utente/" + _nomefile + ".txt";

        try {
            BufferedReader buffRead = new BufferedReader(new FileReader(path));
		    String linha = "";
            while (true) {
                if (linha != null) {
                    System.out.println(linha);

                } else
                    break;
                linha = buffRead.readLine();
            }
            buffRead.close();
        } catch (Exception e) {
            //TODO: handle exception
        }

    }

    static boolean existFile(String _nomefile)
    {
        //throw new UnsupportedOperationException("Non ancora implementato!!");

        String path = "/home/tss/Andre/Java/Lavori/220201/app/src/main/java/appscuola/Data_Utente/" + _nomefile + ".txt";

        try {
    
            File tmpDir = new File(path);
            boolean exists = tmpDir.exists();
            
            if (exists) 
            {
                System.out.println(path);
            }  
            
            if (tmpDir.isDirectory()) 
            {
                System.out.println(path + "is a directory");
            }

            // verifica se file essiste
            File file = new File(path);
            
            exists = file.exists();
            if (file.exists() && file.isFile())
            {
                //System.out.println("file exists, and it is a file");
                return true;
            }
            else
            {
                //file non essiste
                return true;
            }

        } catch (Exception e) {
            return false;
        }



    }
    
}