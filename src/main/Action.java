/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import projetjava.Chaine;
import projetjava.Element;
import projetjava.FichierCSV;
import projetjava.GererFichier;
import projetjava.Test2;

/**
 *
 * @author Julien Fayet
 */
public class Action extends javax.swing.JFrame {
        private ArrayList<Element> elements ;
        private ArrayList<Chaine> chaines ;
    /**
     * Creates new form Action
     */
    public Action() {
        initComponents();
        GererFichier objFichier=new FichierCSV();
        objFichier.charger();
        elements=objFichier.getElements();
        chaines=objFichier.getChaineProd();
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
        btnStock = new javax.swing.JButton();
        btnProduire = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();
        btnProdSemaine = new javax.swing.JButton();
        btnHistorique = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Veuillez choisir l'action que vous désirez effectuez");

        btnStock.setText("Vérifier stock");
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });

        btnProduire.setText("Produire");
        btnProduire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduireActionPerformed(evt);
            }
        });

        btnFermer.setText("Fermer");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        btnProdSemaine.setText("Produire par semaine");
        btnProdSemaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdSemaineActionPerformed(evt);
            }
        });

        btnHistorique.setText("Voir l'historique des productions");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(btnFermer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnStock, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(btnProduire, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnProdSemaine, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHistorique)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProduire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProdSemaine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(btnHistorique)
                .addGap(44, 44, 44)
                .addComponent(btnFermer, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        // TODO add your handling code here:
        maProcedureActionPerformed(evt);
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnProduireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduireActionPerformed
        // TODO add your handling code here:
        maProcedureActionPerformed(evt);
    }//GEN-LAST:event_btnProduireActionPerformed

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
        // TODO add your handling code here:
        maProcedureActionPerformed(evt);
    }//GEN-LAST:event_btnFermerActionPerformed

    private void btnProdSemaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdSemaineActionPerformed
        // TODO add your handling code here:
        maProcedureActionPerformed(evt);
    }//GEN-LAST:event_btnProdSemaineActionPerformed

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
            java.util.logging.Logger.getLogger(Action.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Action.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Action.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Action.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Action().setVisible(true);
            }
        });
    }
    
    private void maProcedureActionPerformed(java.awt.event.ActionEvent evt) {
        Object source = evt.getSource();
        String laChaine = null;
        if(source==btnFermer){
            this.dispose();
        }
        if (source == btnStock) {
            JOptionPane.showMessageDialog(null,"Vous avez ouvert le stock") ; 
            Stock laFenetreAction;
	    laFenetreAction= new Stock(elements);
            laFenetreAction.setVisible(true);
        } 
        if (source == btnProduire) {
            JOptionPane.showMessageDialog(null,"Vous avez ouvert la production") ;     
            ProductionIHM laFenetreProduction;
	    laFenetreProduction= new ProductionIHM(chaines);
            laFenetreProduction.setVisible(true);
        }
        if(source == btnProdSemaine){
            JOptionPane.showMessageDialog(null,"Vous avez ouvert la production par semaine") ;     
            ProduireSemaine laFenetreProd;
	    laFenetreProd= new ProduireSemaine();
            laFenetreProd.setVisible(true);
        }
        

    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnHistorique;
    private javax.swing.JButton btnProdSemaine;
    private javax.swing.JButton btnProduire;
    private javax.swing.JButton btnStock;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
