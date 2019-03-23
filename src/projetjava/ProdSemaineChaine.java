/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 *
 * @author Julien Fayet
 */
public class ProdSemaineChaine {
    private String semaine;
    private String date;
    private Chaine chaine;
    private double quantite;

    public ProdSemaineChaine(String semaine,String date, Chaine chaine, double quantite) {
        this.semaine = semaine;
        this.chaine = chaine;
        this.quantite = quantite;
        this.date=date;
    }
    public ProdSemaineChaine(){
        this.semaine = "";
        this.chaine = null;
        this.quantite = 0;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    

    public String getSemaine() {
        return semaine;
    }

    public void setSemaine(String semaine) {
        this.semaine = semaine;
    }

    public Chaine getChaine() {
        return chaine;
    }

    public void setChaine(Chaine chaine) {
        this.chaine = chaine;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
    
    
}
