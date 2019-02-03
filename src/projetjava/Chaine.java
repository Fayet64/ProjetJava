/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.HashMap;

/**
 *
 * @author Julien Fayet
 */

public class Chaine {
    private String code;
    private String nom;
    private HashMap<Element,Double> entree;
    private HashMap<Element,Double> sortie;
    
    public Chaine(String code,String nom){
        this.code=code;
        this.nom=nom;
        this.entree=new HashMap <Element,Double>();
        this.sortie=new HashMap <Element,Double>();
    }
    public Chaine(String code, String nom, HashMap<Element, Double> entree, HashMap<Element, Double> sortie) {
	super();
	this.code = code;
	this.nom = nom;
	this.entree = entree;
	this.sortie = sortie;
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
public HashMap<Element, Double> getEntree() {
	return entree;
}
public void setEntree(HashMap<Element, Double> entree) {
	this.entree = entree;
}
public HashMap<Element, Double> getSortie() {
	return sortie;
}
public void setSortie(HashMap<Element, Double> sortie) {
	this.sortie = sortie;
}
@Override
public String toString() {
	return "ChaineDeProduction [code=" + code + ", nom=" + nom + ", entree=" + entree + ", sortie=" + sortie + "]\n";
}
}
