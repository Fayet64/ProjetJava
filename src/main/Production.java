/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import projetjava.Chaine;
import projetjava.Element;
import projetjava.GererFichier;

/**
 *
 * @author Julien Fayet
 */
public class Production extends javax.swing.JFrame {

    /**
     * Creates new form Production
     */
    public Production(ArrayList<Chaine> listeChaine) {
        initComponents();
        setComponents(listeChaine);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NiveauA = new javax.swing.JLabel();
        txtNiveau = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnEssai = new javax.swing.JButton();
        btnRetour = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        listeChaines = new javax.swing.JComboBox<>();
        btnValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NiveauA.setText("Niveau d'activité : ");

        txtNiveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNiveauActionPerformed(evt);
            }
        });

        jLabel1.setText("Chaine : ");

        btnEssai.setText("Faire un essai");
        btnEssai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEssaiActionPerformed(evt);
            }
        });

        btnRetour.setText("Retour");
        btnRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetourActionPerformed(evt);
            }
        });

        jLabel2.setText("Essai de production");

        listeChaines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeChainesActionPerformed(evt);
            }
        });

        btnValider.setText("Valider");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(btnRetour)
                .addGap(39, 39, 39)
                .addComponent(btnEssai)
                .addGap(38, 38, 38)
                .addComponent(btnValider)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NiveauA)
                            .addComponent(jLabel1))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNiveau, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listeChaines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listeChaines, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NiveauA)
                    .addComponent(txtNiveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEssai)
                    .addComponent(btnRetour)
                    .addComponent(btnValider))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNiveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNiveauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNiveauActionPerformed

    private void btnEssaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEssaiActionPerformed
        // TODO add your handling code here:
        maGestionDeLEvenement(evt);
    }//GEN-LAST:event_btnEssaiActionPerformed

    private void listeChainesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeChainesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listeChainesActionPerformed

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        // TODO add your handling code here:
        maGestionDeLEvenement(evt);
    }//GEN-LAST:event_btnValiderActionPerformed

    private void btnRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetourActionPerformed
        // TODO add your handling code here:
        maGestionDeLEvenement(evt);
    }//GEN-LAST:event_btnRetourActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NiveauA;
    private javax.swing.JButton btnEssai;
    private javax.swing.JButton btnRetour;
    private javax.swing.JButton btnValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> listeChaines;
    private javax.swing.JTextField txtNiveau;
    // End of variables declaration//GEN-END:variables

    private void setComponents(ArrayList<Chaine> listeChaine) {
        for(Chaine c:listeChaine){
            listeChaines.addItem(c.getNom());
        }
    }

    private void maGestionDeLEvenement(ActionEvent evt) {
        JButton source =(JButton) evt.getSource();
        
        if(source == btnEssai){
            
          if(txtNiveau.getText().equals("")){
               JOptionPane.showMessageDialog(null,"Veuillez rentrez un niveau de production") ;
          }
          else{
        int niveau=Integer.parseInt(txtNiveau.getText());
        
        
        ArrayList<Chaine> lesChaines=GererFichier.getChaineProd();
        Chaine laChaine=GererFichier.getChaineProd().get(0);
        for(Chaine c:lesChaines){
            if(c.getNom().equals(listeChaines.getSelectedItem().toString()))
                laChaine=c;
        }
        laChaine.produire(niveau);
        
        Element objElement=new Element();
        Iterator iterator2 = laChaine.getSortie().entrySet().iterator();
        while (iterator2.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator2.next();
            objElement=(Element) me2.getKey();
        }
        ProduitFini laFenetreProduitFini;
            laFenetreProduitFini= new ProduitFini(objElement);
            laFenetreProduitFini.setVisible(true);
        
        }
        }
        if(source==btnValider){
            JOptionPane.showMessageDialog(null,"Vous avez validez la production et donc modifier le fichier element.csv") ; 
        }
        if(source==btnRetour){
            this.dispose();
        }
    }
        
    }

