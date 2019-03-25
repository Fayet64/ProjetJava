/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projetjava.Calcul;
import projetjava.Element;
import projetjava.FichierCSV;
import projetjava.GererFichier;
import projetjava.Usine;

/**
 *
 * @author Julien Fayet
 */
public class ProduitFini extends javax.swing.JFrame {
    private Usine usine;
    /**
     * Creates new form ProduitFini
     */
    public ProduitFini(Element lElement,Usine usine) {
        initComponents();
        this.usine=usine;
        setComponents(lElement);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUnite = new javax.swing.JTextField();
        btnRetour = new javax.swing.JButton();
        Unite = new javax.swing.JLabel();
        txtQuantite = new javax.swing.JTextField();
        Quantite = new javax.swing.JLabel();
        Nom = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        Code = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        btnVerifStock = new javax.swing.JButton();
        btnValider = new javax.swing.JButton();
        txtPourcentage = new javax.swing.JTextField();
        etatDemande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUnite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniteActionPerformed(evt);
            }
        });

        btnRetour.setText("Retour");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
            }
        });

        Unite.setText("Unite : ");

        txtQuantite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantiteActionPerformed(evt);
            }
        });

        Quantite.setText("Quantite : ");

        Nom.setText("Nom : ");

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        Code.setText("Code :");

        jLabel1.setText("Stock du produit");

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        btnVerifStock.setText("Vérifier stock");
        btnVerifStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifStockActionPerformed(evt);
            }
        });

        btnValider.setText("Valider");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        txtPourcentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPourcentageActionPerformed(evt);
            }
        });

        etatDemande.setText("Etat demande");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnRetour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addComponent(btnVerifStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnValider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Unite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(19, 19, 19))
                            .addComponent(Quantite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(Code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(Nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(22, 22, 22)))
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etatDemande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(125, 125, 125)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUnite)
                    .addComponent(txtQuantite, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNom, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCode, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPourcentage))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCode)
                            .addComponent(Code, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantite)
                            .addComponent(Quantite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Unite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUnite))
                        .addGap(18, 18, 18)
                        .addComponent(txtPourcentage, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(etatDemande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerifStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnValider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        try {
            // TODO add your handling code here:
            maGestionDeLevenement(evt);
        } catch (IOException ex) {
            Logger.getLogger(ProduitFini.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnValiderActionPerformed

    private void btnVerifStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifStockActionPerformed
        try {
            // TODO add your handling code here
            maGestionDeLevenement(evt);
        } catch (IOException ex) {
            Logger.getLogger(ProduitFini.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVerifStockActionPerformed

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        try {
            // TODO add your handling code here:
            maGestionDeLevenement(evt);
        } catch (IOException ex) {
            Logger.getLogger(ProduitFini.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRetourActionPerformed

    private void txtUniteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniteActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtPourcentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPourcentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPourcentageActionPerformed

    private void txtQuantiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantiteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Code;
    private javax.swing.JLabel Nom;
    private javax.swing.JLabel Quantite;
    private javax.swing.JLabel Unite;
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnValider;
    private javax.swing.JButton btnVerifStock;
    private javax.swing.JLabel etatDemande;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPourcentage;
    private javax.swing.JTextField txtQuantite;
    private javax.swing.JTextField txtUnite;
    // End of variables declaration//GEN-END:variables

    private void maGestionDeLevenement(ActionEvent evt) throws IOException {
        Object source = evt.getSource();
        GererFichier objFichier=new FichierCSV();
        
        if(source==btnRetour){
            this.dispose();
        }
        if (source == btnVerifStock) {
            JOptionPane.showMessageDialog(null,"Vous avez ouvert le stock") ; 
            Stock laFenetreAction;
	    laFenetreAction= new Stock(usine);
            laFenetreAction.setVisible(true);
        }
        if(source==btnValider){
            JOptionPane.showMessageDialog(null,"Vous avez validez la production et donc modifier le fichier element.csv") ; 
            objFichier.ecrireElements(usine);
            this.dispose();
        }
        
    }

    private void setComponents(Element lElement) {
        txtCode.setText(lElement.getCode());
        txtNom.setText(lElement.getNom());
        txtQuantite.setText(String.valueOf(lElement.getQuantite()));
        txtUnite.setText(lElement.getUnite());
        double quantite=lElement.getQuantite();
        int demande=lElement.getDemande();
        
        if(demande==0){
            etatDemande.setText("Il n'y a pas de demande");
            txtPourcentage.setText("0%");
        }
        else{
        Calcul c=new Calcul(usine);
        double satisf=c.satisfaction(quantite,demande);
        txtPourcentage.setText(String.valueOf(satisf)+"%");    
        if(satisf<100){
            etatDemande.setText("Demande non satisfaite");
        }
        else{
            etatDemande.setText("Demande satisfaite");
        }
        }
       
    }
}