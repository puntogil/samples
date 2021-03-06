/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestionescuola;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DateFormatter;

/**
 *
 * @author tss
 */
public class WinGestione extends javax.swing.JFrame {

    ArrayList<Corso> listacorsi = new ArrayList<Corso>();

    /**
     * Creates new form WinGestione
     */
    public WinGestione() {
        initComponents();
        caricaDatiCorsi();
        showCorsi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitolo = new javax.swing.JLabel();
        txNomeCorso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txDescrizione = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        spDurata = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txDataInizio = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txLink = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCreaCorso = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpDisplay = new javax.swing.JTextPane();
        idCorsoupdate = new javax.swing.JTextField();
        btnSelCorso = new javax.swing.JButton();
        btnUpdateCorso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitolo.setFont(new java.awt.Font("Cantarell", 3, 22)); // NOI18N
        lblTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitolo.setText("Gestione scuola");

        txNomeCorso.setToolTipText("");
        txNomeCorso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txNomeCorsoPropertyChange(evt);
            }
        });
        txNomeCorso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txNomeCorsoKeyPressed(evt);
            }
        });

        jLabel1.setText("nome corso:");

        txDescrizione.setColumns(20);
        txDescrizione.setRows(5);

        jLabel2.setText("Descrizione:");

        spDurata.setModel(new javax.swing.SpinnerNumberModel());
        spDurata.setName(""); // NOI18N

        jLabel3.setText("Durata ore:");

        txDataInizio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel4.setText("Data inizio:");

        txLink.setToolTipText("");

        jLabel5.setText("link corso:");

        btnCreaCorso.setText("crea corso");
        btnCreaCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaCorsoActionPerformed(evt);
            }
        });

        lblMsg.setForeground(java.awt.Color.red);

        jScrollPane1.setViewportView(tpDisplay);

        idCorsoupdate.setText("1");

        btnSelCorso.setText("select corso");
        btnSelCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelCorsoActionPerformed(evt);
            }
        });

        btnUpdateCorso.setText("update corso");
        btnUpdateCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCorsoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitolo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txNomeCorso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(spDurata, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDescrizione, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnSelCorso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnUpdateCorso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idCorsoupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCreaCorso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txNomeCorso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txDescrizione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spDurata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txDataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreaCorso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idCorsoupdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSelCorso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateCorso)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * aggiorna lista corsi in display
     */
    private void showCorsi() {
        // recupero un corso per volta
        // estraggo info tipo string
        // aggiungo info a un testo generico che poi setto in display
        String testoDisplay = "";
        for (int i = 0; i < listacorsi.size(); i++) {
            // recupero un corso per volta
            Corso c = listacorsi.get(i);
            String info = "["+ (i+1) + "] "  + c.getInfo();
            testoDisplay = info + testoDisplay;
        }
        //visualizzo i corsi in display
        tpDisplay.setText(testoDisplay);
    }

    private void salvaCorsi() {
        // recupero un corso per volta
        // estraggo info tipo string
        // aggiungo info a un testo generico che poi setto in display
        String testoDisplay = "";
        for (int i = 0; i < listacorsi.size(); i++) {
            // recupero un corso per volta
            Corso c = listacorsi.get(i);
            String info = c.getInfo();
            testoDisplay = testoDisplay + info;
        }
        try {
            // creo file corsi.txt
            FileWriter myWriter = new FileWriter("/home/puntogil/GIL/corsi.txt");
            //ci scrivo dentro testoDisplay
            myWriter.write(testoDisplay);
            // lo chiude se no si blocca
            myWriter.close();

        } catch (Exception e) {
            lblMsg.setText("errore di scrittura file corsi.txt");
        }
    }

    private void salvaCorsiCSV() {
        // recupero un corso per volta
        // estraggo info tipo string
        // aggiungo info a un testo generico che poi setto in display
        String testoDisplay = "nomecorso;durataore;descrizione;datainizio;link\n";
        for (int i = 0; i < listacorsi.size(); i++) {
            // recupero un corso per volta
            Corso c = listacorsi.get(i);
            String info = c.getCSV();
            testoDisplay = testoDisplay + info;
        }
        try {
            // creo file corsi.txt
            FileWriter myWriter = new FileWriter("/home/puntogil/GIL/corsi.csv");
            //ci scrivo dentro testoDisplay
            myWriter.write(testoDisplay);
            // lo chiude se no si blocca
            myWriter.close();

        } catch (Exception e) {
            lblMsg.setText("errore di scrittura file corsi.csv");
        }
    }

    private void caricaDatiCorsi() {
        try {
            //aprire il file /tss/sScuola/dati.csv
            File filecsv = new File("/home/puntogil/GIL/corsi.csv");
            //creo scanner per lelggere una riga per volta
            Scanner lettore = new Scanner(filecsv);
            //estrarre una riga per volta
            int n = 1;
            while (lettore.hasNextLine()) {
                String riga = lettore.nextLine();
                if (n > 1) {
                    String[] dati=riga.split(";");
                    //dati[0] nomecorso dati[1] durata etc etc
                    String nc = dati[0];
                    int durata= Integer.parseInt(dati[1]);
                    String des= dati[2];
                    String d[] = dati[3].split("-");
                    int y= Integer.parseInt(d[0]);
                    int m= Integer.parseInt(d[1]);
                    int g= Integer.parseInt(d[2]);
                    String link= dati[4]; 
                    Corso c= new Corso(nc, durata, y, m, g);
                    c.setDescrizione(des);
                    c.setLink(link);
                    //il corso e' pronto lo aggiungiamo alla lista
                    listacorsi.add(c);
                }
                n++;
                //la riga la taglio in tanti pezzi col ; in un array
                // elmento per lelemnto dell'array lo imposto ad un corso
                //il corso lo aggiungo alla lista 
            }
            //e cosi' via per le altre righe del file'
            //alla fine chiudo il file se no si blocca

        } catch (Exception e) {

        }

    }

    private void btnCreaCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaCorsoActionPerformed
        // TODO add your handling code here:
        //Recuperiamo i dati da interfaccia
        String nc = txNomeCorso.getText();
        String des = txDescrizione.getText();
        String data = txDataInizio.getText();
        String ardata[] = data.split("/");
        int d = Integer.parseInt(ardata[0]);
        int m = Integer.parseInt(ardata[1]);
        int a = Integer.parseInt(ardata[2]) + 2000;
        String link = txLink.getText();
        int durata = (int) spDurata.getValue();
        Corso newcorso = new Corso(nc, durata, a, m, d);
        newcorso.setDescrizione(des);
        newcorso.setLink(link);
        listacorsi.add(newcorso);
        lblMsg.setText("Corso Creato correttamente!");
        txNomeCorso.setText("");
        txDescrizione.setText("");
        txLink.setText("");
        txDataInizio.setText("");
        spDurata.setValue(0);
        //mostra elenco aggiornato in display di listacorsi
        showCorsi();
        salvaCorsi();
        salvaCorsiCSV();


    }//GEN-LAST:event_btnCreaCorsoActionPerformed

    private void txNomeCorsoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txNomeCorsoPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_txNomeCorsoPropertyChange

    private void txNomeCorsoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNomeCorsoKeyPressed
        // TODO add your handling code here:
        lblMsg.setText("");
    }//GEN-LAST:event_txNomeCorsoKeyPressed

    private void btnUpdateCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCorsoActionPerformed
       
        int id=Integer.parseInt(idCorsoupdate.getText())-1;
        
        if (   !(id<listacorsi.size() && id >=0)  ) 
            return; //esco...
        
        
       String nc = txNomeCorso.getText();
        String des = txDescrizione.getText();
        String data = txDataInizio.getText();
        String ardata[] = data.split("/");
        int d = Integer.parseInt(ardata[0]);
        int m = Integer.parseInt(ardata[1]);
        int a = Integer.parseInt(ardata[2]) + 2000;
        String link = txLink.getText();
        int durata = (int) spDurata.getValue();
        Corso newcorso = new Corso(nc, durata, a, m, d);
        newcorso.setDescrizione(des);
        newcorso.setLink(link); 
        listacorsi.set(id, newcorso);
        showCorsi();
        salvaCorsiCSV();
        
        
        
    }//GEN-LAST:event_btnUpdateCorsoActionPerformed

    private void btnSelCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelCorsoActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(idCorsoupdate.getText())-1;
        
        if (   !(id<listacorsi.size() && id >=0)  ) 
            return; //esco...
        
        Corso c= listacorsi.get(id);
        lblMsg.setText("Corso selezionato correttamente!");
        txNomeCorso.setText(c.getNomecorso());
        txDescrizione.setText(c.getDescrizione());
        txLink.setText(c.getLink());
        //data complicata
        DateTimeFormatter ddmmaa = DateTimeFormatter.ofPattern("dd/MM/yy");
        String dataok =c.getDatainizio().format(ddmmaa);
        
        txDataInizio.setText(dataok);
        spDurata.setValue(c.getDurataore());
        
        
    }//GEN-LAST:event_btnSelCorsoActionPerformed

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
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinGestione.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinGestione().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreaCorso;
    private javax.swing.JButton btnSelCorso;
    private javax.swing.JButton btnUpdateCorso;
    private javax.swing.JTextField idCorsoupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblTitolo;
    private javax.swing.JSpinner spDurata;
    private javax.swing.JTextPane tpDisplay;
    private javax.swing.JFormattedTextField txDataInizio;
    private javax.swing.JTextArea txDescrizione;
    private javax.swing.JTextField txLink;
    private javax.swing.JTextField txNomeCorso;
    // End of variables declaration//GEN-END:variables
}
