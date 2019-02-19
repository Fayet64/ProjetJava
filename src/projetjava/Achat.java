/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Julien Fayet
 */
public class Achat {
    private int codeAchat;
    private String codeElement;
    private double quantite;
    private double prixA;
    private String dateA;
    
    private static int nbAchat=0;
    
    public Achat(String codeElement,double quantite,double prixA){
        this.codeAchat=nbAchat;
        this.codeElement=codeElement;
        this.quantite=quantite;
        this.prixA=prixA;
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
	Date date = new Date();
	this.dateA=dateFormat.format(date);
        
        
        nbAchat++;
    }
   

    public double getPrixA() {
        return prixA;
    }

    public void setPrixA(double prixA) {
        this.prixA = prixA;
    }

    public String getDateA() {
        return dateA;
    }

    public void setDateA(String dateA) {
        this.dateA = dateA;
    }

    public static int getNbAchat() {
        return nbAchat;
    }

    public static void setNbAchat(int nbAchat) {
        Achat.nbAchat = nbAchat;
    }
    
    public int getCodeAchat() {
        return codeAchat;
    }

    public void setCodeAchat(int codeAchat) {
        this.codeAchat = codeAchat;
    }

    public String getCodeElement() {
        return codeElement;
    }

    public void setCodeElement(String codeElement) {
        this.codeElement = codeElement;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    
    
    
}

