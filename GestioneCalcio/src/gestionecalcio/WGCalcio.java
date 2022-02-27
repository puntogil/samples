/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionecalcio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tss
 */
public class WGCalcio extends javax.swing.JFrame {

    static ArrayList<Squadra> listasquadri = new ArrayList<>();
    static ArrayList<Partita> torneo = new ArrayList<>();
    
    
    
    /**
     * Creates new form WGCalcio
     */
    public WGCalcio() {
        initComponents();
        caricaSquadra();
        caricaTorneo();
        refresh();
    }
  
   
    
    public static boolean addSquadra (Squadra _squadra){
        
        for (Squadra squadra : listasquadri) {
            if(squadra.equals(_squadra)){
                return false;
            }
        }
        
        listasquadri.add(_squadra);
        return true;
    }
    
    public static boolean addPartita (Partita _partita){
        
        for (Partita partita : torneo) {
            if(partita.equals(_partita)){
                return false;
            }
        }
        torneo.add(_partita);
        return true;
    }
    
    public static Squadra getSquadra (int id){
        
        Squadra x = null;
        for (Squadra s : listasquadri) {
            if(s.getIdSquadra()==id){
                x = s;
            }
        }
        return x;
    }
    
    public static Squadra getSquadra (String _nome){
        
        Squadra x = null;
        for (Squadra s : listasquadri) {
            if(s.getNome().equalsIgnoreCase(_nome)){
                x = s;
            }
        }
        return x;
    }
    
    public static int getIdSquadra(){
        
        if (listasquadri.size() == 0)
            return 1;
        else 
            return listasquadri.size() + 1;
    }
    
    public static int getIdPartita(){
        if (torneo.size() == 0)
            return 1;
        else 
            return torneo.size() + 1;
    }
    
    public static void salvaSquadraCSV(){
       
        String testoDisplay = "IdSquadra;NomeSquadra;SedeSquadra\n";
        

        for (Squadra squadra : listasquadri) {
            String info = squadra.getInfo();
            testoDisplay += info;
        }

       try {
            //creo file corsi .txt
            
            FileWriter myWriter = new FileWriter("/home/tss/Andre/Java/Lavori/GestioneCalcio/GestioneCalcio/src/gestionecalcio/squadra.csv");
            myWriter.write(testoDisplay);
            myWriter.close();

        } catch (IOException ex) {
            //TODO
        }

        
    }
        
    public static void salvaPartitaCSV(){
       
        String testoDisplay = "IdPartita;idSqdCasa;idSqdVisitarore;PuntiSqdCasa;PuntiSqdVisitarore;DtPartita\n";

        for (Partita partita : torneo) {
            String info = partita.getInfo();
            testoDisplay += info;
        }

       try {
            
            //creo file corsi .txt
            FileWriter myWriter = new FileWriter("/home/tss/Andre/Java/Lavori/GestioneCalcio/GestioneCalcio/src/gestionecalcio/partita.csv");
            //ci scrivo dentro testo display
            myWriter.write(testoDisplay);
            //lo chiudo se no si blocca
            myWriter.close();

        } catch (IOException ex) {
            //lblMsg.setText("errore di scrittura file corsi.csv");
        }

    }
        
    public void caricaSquadra() {
        try {

            //IdSquadra;NomeSquadra;SedeSquadra\n
            File filecsv = new File("/home/tss/Andre/Java/Lavori/GestioneCalcio/GestioneCalcio/src/gestionecalcio/squadra.csv");
            Scanner lettore = new Scanner(filecsv);
            int n = 1;
            while (lettore.hasNextLine()) {
                String riga = lettore.nextLine();
                if (n > 1) {
                    String[] dati = riga.split(";");
                    int id = Integer.parseInt(dati[0]);
                    String nm = dati[1];
                    String sd = dati[2];
                    
                    Squadra newSquadra = new Squadra(id, nm, sd);

                    listasquadri.add(newSquadra);
                }
                n++;
            }
        } catch (Exception e) {
                //Tool.stampaPainel("Erro al leggere il file Anagrafica");
        }
    }
    
    public void caricaTorneo() {
        try {

            File filecsv = new File("/home/tss/Andre/Java/Lavori/GestioneCalcio/GestioneCalcio/src/gestionecalcio/partita.csv");
            Scanner lettore = new Scanner(filecsv);
            int n = 1;
            while (lettore.hasNextLine()) {
                String riga = lettore.nextLine();
                if (n > 1) {
                    String[] dati = riga.split(";");
                    int idt = Integer.parseInt(dati[0]);
                    int idsc = Integer.parseInt(dati[1]);
                    int idsv = Integer.parseInt(dati[2]);
                    int psc = Integer.parseInt(dati[3]);
                    int psv = Integer.parseInt(dati[4]);
                    String dp = dati[5];
                    Partita newPartita = new Partita(idt, getSquadra(idsc), getSquadra(idsv), psc,psv, dp);

                    torneo.add(newPartita);
                }
                n++;
            }
        } catch (Exception e) {
                //Tool.stampaPainel("Erro al leggere il file Anagrafica");
        }
    }
    
    private void refresh(){
        
        DefaultTableModel modeltable = (DefaultTableModel)tblClassifica.getModel();
        
        modeltable.setRowCount(0);
        
        int punti = 0;
        int fatti = 0;
        int subiti = 0;
        
        Object[] rowData = new Object[4];
        
        for (Squadra s : listasquadri) 
        {
        
            punti = 0;
            fatti = 0;
            subiti = 0;
            
            for (Partita p : torneo) 
            {
                if(p.sqCasa.getIdSquadra() == s.getIdSquadra())
                {
                    fatti += p.getPuntiSqCasa();
                    subiti += p.getPuntSqVisitatore();
                       
                    if(p.getPuntiSqCasa() > p.getPuntSqVisitatore())
                    {
                        punti = punti +3;
                    }
                    else
                    {
                        if(p.getPuntiSqCasa() == p.getPuntSqVisitatore())
                        {
                            
                            punti = punti +1;
                        }
                    }
                }
            
                if(p.sqVisitatore.getIdSquadra() == s.getIdSquadra()){
                    fatti += p.getPuntSqVisitatore();
                    subiti += p.getPuntiSqCasa();
                    
                    if(p.getPuntiSqCasa() < p.getPuntSqVisitatore())
                    {
                        punti = punti +3;
                    }
                    else
                    {
                        if(p.getPuntiSqCasa() == p.getPuntSqVisitatore())
                        {
                            
                            punti = punti +1;
                        }
                    }
                            
                }
            }
                
            rowData[0] = s.getNome();
            rowData[1] = punti;
            rowData[2] = fatti;
            rowData[3] = subiti;
            modeltable.addRow(rowData);
        }
        
        tblClassifica.getRowSorter().toggleSortOrder(1);
        
        
    }
    
   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSquadra = new javax.swing.JButton();
        btnTorneo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClassifica = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btnSquadra.setText("Squadra");
        btnSquadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquadraActionPerformed(evt);
            }
        });

        btnTorneo.setText("Torneo");
        btnTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTorneoActionPerformed(evt);
            }
        });

        tblClassifica.setAutoCreateRowSorter(true);
        tblClassifica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Squadra", "Punti", "Fatti", "Subiti"
            }
        ));
        jScrollPane1.setViewportView(tblClassifica);

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Torneo di Calcio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnSquadra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTorneo)
                    .addComponent(btnSquadra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSquadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquadraActionPerformed
        new WDSquadra(this, true).setVisible(true);
    }//GEN-LAST:event_btnSquadraActionPerformed

    private void btnTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorneoActionPerformed
        new WDPartita(this, true).setVisible(true);
    }//GEN-LAST:event_btnTorneoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        refresh();
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WGCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WGCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WGCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WGCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WGCalcio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSquadra;
    private javax.swing.JButton btnTorneo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClassifica;
    // End of variables declaration//GEN-END:variables
}
