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
public class Element {
    private String code ;
private String nom;
private double quantite;
private String unite;
private double achat;
private double vente;
public Element(String code, String nom, double quantite, String unite, double achat, double vente) {
	this.code = code;
	this.nom = nom;
	this.quantite = quantite;
	this.unite = unite;
	this.achat = achat;
	this.vente = vente;
}

    public Element() {
        this.code = "";
	this.nom = "";
	this.quantite = 0;
	this.unite = "";
	this.achat = 0;
	this.vente = 0;
    }

public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public double getQuantite() {
	return quantite;
}
public void setQuantite(double quantite) {
	this.quantite = quantite;
}
public String getUnite() {
	return unite;
}
public void setUnite(String unite) {
	this.unite = unite;
}
public double getAchat() {
	return achat;
}
public void setAchat(double achat) {
	this.achat = achat;
}
public double getVente() {
	return vente;
}
public void setVente(double vente) {
	this.vente = vente;
}
@Override
public String toString() {
	return "Element [code=" + code + ", nom=" + nom + ", quantite=" + quantite + ", unite=" + unite + ", achat=" + achat
			+ ", vente=" + vente + "]";
}

public void soustractionStockElement(int soustra){
    
    this.quantite = this.quantite - soustra; 
    
}

public void ajoutStockElemProduit(int ajoute){
    this.quantite = this.quantite + ajoute; 
}

public int verifierPrixAchat(){
     if(this.achat<=0){
        System.out.println("Desole production impossible"); 
    }
    else {
        if(this.achat>=0){
            this.quantite = this. 
        }   
     }
   return 0; 
}

public void verifierPrixVente(){
    
}

public boolean verifStock(Chaine laChaine){
    boolean res=true;
    if (laChaine.getEntree().get(this) > this.getQuantite()){
        if (this.getAchat()==0){
            System.out.println("Nous ne pouvons pas faire ce produit");
            res=false;
        }
             else {
                 double l = laChaine.getEntree().get(this) - this.getQuantite();
                   // Achat.ajoutQ(l);
                System.out.println("le produit a ete commandé");
                    }
    }
    return res;
}
}
