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
	super();
	this.code = code;
	this.nom = nom;
	this.quantite = quantite;
	this.unite = unite;
	this.achat = achat;
	this.vente = vente;
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

public void verifierPrixAchat(){
    
}

public void verifierPrixVente(){
    
}

public void verifierStock(){
    
}
}
