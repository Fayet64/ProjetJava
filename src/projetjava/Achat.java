/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.ArrayList;

/**
 *
 * @author Julien Fayet
 */
public class Achat {
    private double codeAchat;
    private String codeElement;
    private double quantite;
    
    private static double nbAchat=0;
    private static ArrayList<Achat> listeAchat=new ArrayList <Achat>();
    
    public Achat(String codeElement,double quantite){
        this.codeAchat=nbAchat;
        this.codeElement=codeElement;
        this.quantite=quantite;
        nbAchat++;
    }
    
    public static void ajouterAchat(Achat objAchat){
        listeAchat.add(objAchat);
    }
    
    public static ArrayList<Achat> getListeAchat() {
        return listeAchat;
    }
    
    public double getCodeAchat() {
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

