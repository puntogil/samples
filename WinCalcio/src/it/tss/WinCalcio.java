/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it.tss;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gil
 */
public class WinCalcio extends javax.swing.JFrame {
   
    static ArrayList<Squadra> listasquadre = new ArrayList<>();
    static ArrayList<Partita> torneo = new ArrayList<>();
 
    /**
     * Creates new form WinCalcio
     */
    public WinCalcio() {
        initComponents();
        caricaSquadra();
        caricaTorneo();
        refresh();
    }
    public static boolean addSquadra (Squadra _squadra){
        
        for (Squadra squadra : listasquadre) {
            if(squadra.equals(_squadra)){
                return false;
            }
        }
        
        listasquadre.add(_squadra);
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
        for (Squadra s : listasquadre) {
            if(s.getIdSquadra()==id){
                x = s;
            }
        }
        return x;
    }
    
    public static Squadra getSquadra (String _nome){
        
        Squadra x = null;
        for (Squadra s : listasquadre) {
            if(s.getNome().equalsIgnoreCase(_nome)){
                x = s;
            }
        }
        return x;
    }
    
    public static int getIdSquadra(){
        
        if (listasquadre.size() == 0)
            return 1;
        else 
            return listasquadre.size() + 1;
    }
    
    public static int getIdPartita(){
        if (torneo.size() == 0)
            return 1;
        else 
            return torneo.size() + 1;
    }

    public static void salvaSquadraCSV(){
       
        String testoDisplay = "IdSquadra;NomeSquadra;SedeSquadra\n";

        for (Squadra squadra : listasquadre) {
            String info = squadra.getInfo();
            testoDisplay += info;
        }

       try {
            // genera file csv delle squadre
            //File file = new File("squadra.csv");
            //FileWriter myWriter = new FileWriter(file.getPath());
            FileWriter myWriter = new FileWriter("/home/puntogil/GIL/samples/WinCalcio/src/it/tss/squadra.csv");
            myWriter.write(testoDisplay);
            myWriter.close();
        } catch (IOException ex) {

        }

        
    }
        
    public static void salvaPartitaCSV(){
       
        String testoDisplay = "IDPartita;IDSquadraCasa;IDSquadraVisitarore;PuntiSquadraCasa;PuntiSquadraOspite;DatiPartita\n";

        for (Partita partita : torneo) {
            String info = partita.getInfo();
            testoDisplay += info;
        }

       try {
            // genera file csv delle partite
            FileWriter myWriter = new FileWriter("/home/puntogil/GIL/samples/WinCalcio/src/it/tss/partita.csv");
            //File file = new File("partita.csv");
            //FileWriter myWriter = new FileWriter(file.getPath());
            myWriter.write(testoDisplay);
            myWriter.close();

        } catch (IOException ex) {
        }

    }
        
    public void caricaSquadra() {
        try {

            //IdSquadra;NomeSquadra;SedeSquadra\n
            //File filecsv = new File("squadra.csv");
            Scanner lettore = new Scanner("/home/puntogil/GIL/samples/WinCalcio/src/it/tss/squadra.csv");
            int n = 1;
            while (lettore.hasNextLine()) {
                String riga = lettore.nextLine();
                if (n > 1) {
                    String[] dati = riga.split(";");
                    int id = Integer.parseInt(dati[0]);
                    String nm = dati[1];
                    String sd = dati[2];
                    
                    Squadra newSquadra = new Squadra(id, nm, sd);

                    listasquadre.add(newSquadra);
                }
                n++;
            }
        } catch (Exception e) {
                
        }
    }
    
    public void caricaTorneo() {
        try {

            //File filecsv = new File("partita.csv");
            Scanner lettore = new Scanner("/home/puntogil/GIL/samples/WinCalcio/src/it/tss/partita.csv");
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

        }
    }
    
    private void refresh(){
        
        DefaultTableModel modeltable = (DefaultTableModel)tblTorneo.getModel();
        
        modeltable.setRowCount(0);
        
        int punti = 0;
        int fatti = 0;
        int subiti = 0;
        
        Object[] rowData = new Object[4];
        
        for (Squadra s : listasquadre) {
        
            punti = 0;
            fatti = 0;
            subiti = 0;
            
            for (Partita p : torneo) 
            {
                if(p.squadraCasa.getIdSquadra() == s.getIdSquadra())
                {
                    fatti += p.getPuntiSqCasa();
                    subiti += p.getPuntSqVisitatore();
                    if(p.getPuntiSqCasa() > p.getPuntSqVisitatore()) {
                        punti = punti +3;
                    } else {
                        if(p.getPuntiSqCasa() == p.getPuntSqVisitatore()) {
                            
                            punti = punti +1;
                        }
                    }
                }
                if(p.squadraOspite.getIdSquadra() == s.getIdSquadra()){
                    fatti += p.getPuntSqVisitatore();
                    subiti += p.getPuntiSqCasa();
                    
                    if(p.getPuntiSqCasa() < p.getPuntSqVisitatore()) {
                        punti = punti +3;
                    } else {
                        if(p.getPuntiSqCasa() == p.getPuntSqVisitatore()) {
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
        
        tblTorneo.getRowSorter().toggleSortOrder(1);
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSquadra = new javax.swing.JButton();
        btnTorneo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTorneo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frame1"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Torneo di calcio");

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

        tblTorneo.setAutoCreateRowSorter(true);
        tblTorneo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Squadra", "Punti", "Goal fatti", "Goal Subiti"
            }
        ));
        jScrollPane1.setViewportView(tblTorneo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnSquadra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSquadra)
                    .addComponent(btnTorneo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSquadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquadraActionPerformed
        new WinSquadra(this, true).setVisible(true);
    }//GEN-LAST:event_btnSquadraActionPerformed

    private void btnTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTorneoActionPerformed
        new WinPartita(this, true).setVisible(true);
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
            java.util.logging.Logger.getLogger(WinCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinCalcio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSquadra;
    private javax.swing.JButton btnTorneo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTorneo;
    // End of variables declaration//GEN-END:variables
}
