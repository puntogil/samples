/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it.tss;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gil
 */
public class WinPartita  extends javax.swing.JDialog {

    /**
     * Creates new form WinPartita
     */
    public WinPartita(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        clear();
        caricaDati();
    }
    
    
    private void clear() {
        cmbxSquadraCasa.setSelectedItem(-1);
        cmbxSquadraOspite.setSelectedItem(-1);
        txtPuntiCasa.setText("");
        txtPuntiOpsite.setText("");

        caricaDati();
    }

    public void refresh(){
        DefaultTableModel modeltable = (DefaultTableModel)tblPartita.getModel();
        
        modeltable.setRowCount(0);
        
        Object[] rowData = new Object[5];
        
        for (Partita s : WinCalcio.torneo) {
            rowData[0] = s.getDataPartita();
            rowData[1] = s.getSqCasa().getNome();
            rowData[2] = s.getSqVisitatore().getNome();
            rowData[3] = s.getPuntiSqCasa();
            rowData[4] = s.getPuntSqVisitatore();
            modeltable.addRow(rowData);
        }
    }
    
    private void caricaDati(){
        
        String nc= "";
        
        for (Squadra s : WinCalcio.listasquadre) {
            nc += s.getNome() + "," ;
        }
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(nc.split(","));
        DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>(nc.split(","));
        cmbxSquadraCasa.setModel(model);
        cmbxSquadraOspite.setModel(model1);
        DateTimeFormatter ddmmaa = DateTimeFormatter.ofPattern("dd/MM/yy");
        ftxtDataPartita.setText(LocalDate.now().format(ddmmaa));
      
        refresh();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        llblCasa = new javax.swing.JLabel();
        llblOspite = new javax.swing.JLabel();
        llblTorneoSquadre = new javax.swing.JLabel();
        cmbxSquadraCasa = new javax.swing.JComboBox<>();
        cmbxSquadraOspite = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        ftxtDataPartita = new javax.swing.JFormattedTextField();
        txtPuntiCasa = new javax.swing.JTextField();
        txtPuntiOpsite = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSalva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPartita = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        llblCasa.setText("Squadra ospitante");

        llblOspite.setText("Squadra ospite");

        llblTorneoSquadre.setText("Torneo a squadre");
        llblTorneoSquadre.setToolTipText("");

        cmbxSquadraCasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbxSquadraOspite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Data Partita:");

        jLabel2.setText("Goals");

        jLabel3.setText("--");

        btnSalva.setText("SALVA");
        btnSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaActionPerformed(evt);
            }
        });

        tblPartita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data", "Casa", "Ospite", "Goal Casa", "Goal Ospite"
            }
        ));
        jScrollPane1.setViewportView(tblPartita);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(txtPuntiOpsite, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(137, 137, 137)
                                        .addComponent(txtPuntiCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(llblCasa, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cmbxSquadraCasa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbxSquadraOspite, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(llblOspite)
                                            .addComponent(ftxtDataPartita, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(llblTorneoSquadre))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(btnSalva)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(llblTorneoSquadre)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(llblOspite)
                    .addComponent(llblCasa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxSquadraOspite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbxSquadraCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ftxtDataPartita, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPuntiOpsite, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPuntiCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(btnSalva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaActionPerformed
        if(cmbxSquadraCasa.getSelectedItem().toString().equalsIgnoreCase(cmbxSquadraOspite.getSelectedItem().toString()))
        {
            JOptionPane.showMessageDialog(null, "Non puoi selezionare la stessa squadra");
            return;
        }
        
        
        Partita p = new Partita(WinCalcio.getIdPartita(), 
                                WinCalcio.getSquadra(cmbxSquadraCasa.getSelectedItem().toString()), 
                                WinCalcio.getSquadra(cmbxSquadraOspite.getSelectedItem().toString()), 
                                Integer.parseInt(txtPuntiCasa.getText()),
                                Integer.parseInt(txtPuntiOpsite.getText()),
                                ftxtDataPartita.getText()
                                );
       
        if(WinCalcio.addPartita(p)){
            WinCalcio.salvaPartitaCSV();
            JOptionPane.showMessageDialog(null, "Partita Inserita");
            clear();
            refresh();
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Partita Inserita");
        }
    }//GEN-LAST:event_btnSalvaActionPerformed

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
            java.util.logging.Logger.getLogger(WinPartita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinPartita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinPartita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinPartita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WinPartita dialog = new WinPartita(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalva;
    private javax.swing.JComboBox<String> cmbxSquadraCasa;
    private javax.swing.JComboBox<String> cmbxSquadraOspite;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JFormattedTextField ftxtDataPartita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel llblCasa;
    private javax.swing.JLabel llblOspite;
    private javax.swing.JLabel llblTorneoSquadre;
    private javax.swing.JTable tblPartita;
    private javax.swing.JTextField txtPuntiCasa;
    private javax.swing.JTextField txtPuntiOpsite;
    // End of variables declaration//GEN-END:variables
}
