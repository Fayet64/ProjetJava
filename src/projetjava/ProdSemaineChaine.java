/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 * <b> Cette classe permet de créer des productions/ semaines de chaque chaine 
 * @author bronco
 */
public class ProdSemaineChaine {
    private String semaine;
    private String date;
    private Chaine chaine;
    private double quantite;
    /**
     * Premier constructeur
     * @param semaine
     * @param date
     * @param chaine
     * @param quantite 
     */
    public ProdSemaineChaine(String semaine,String date, Chaine chaine, double quantite) {
        this.semaine = semaine;
        this.chaine = chaine;
        this.quantite = quantite;
        this.date=date;
    }
    /**
     * Deuxième Constructeur
     */
    public ProdSemaineChaine(){
        this.semaine = "";
        this.chaine = null;
        this.quantite = 0;
    }
    /**
     * methode pour recuperer la date
     * @return date
     */
    public String getDate() {
        return date;
    }
    /**
     * methode pour modifier la date
     * @param date 
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    
    /**
     * methode pour recuperer la semaine 
     * @return semaine
     */
    public String getSemaine() {
        return semaine;
    }
    /**
     * methode pour modifier la semaine
     * @param semaine 
     */
    public void setSemaine(String semaine) {
        this.semaine = semaine;
    }
    /**
     * methode pour recuperer la chaine de production
     * @return chaine
     */
    public Chaine getChaine() {
        return chaine;
    }
    /**
     * methode pour modifier la chaine de production
     * @param chaine 
     */
    public void setChaine(Chaine chaine) {
        this.chaine = chaine;
    }
    /**
     * methode pour recuperer la quantite à produire 
     * @return quantite
     */
    public double getQuantite() {
        return quantite;
    }
    /**
     * methode pour modifier la quantite
     * @param quantite 
     */
    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
    
    
}
