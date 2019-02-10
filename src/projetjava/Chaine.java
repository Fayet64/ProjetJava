/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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


 public void efficacite(Element objElement, int nvx) {
            
            /*  Gestion de l'efficacite 
             * cette methode permet de verifier l'efficacité de la production 
             * Si la production est possible,nous allons verifier sont efficacité en faisaint le calcul suivant
             *  Valeur des ventes de tous les stock dispo)- (le montant total des achat a effectuer)
             */
            
            // il y a encore des imcomprehension dans cette methoode et si il n'y a pas d'achat a effectuer ? 
          
	if (objElement.verifStock(this,nvx)==true) {
		
		double totalAchat=0;
		double totalVente=0;
        Iterator iterator4 = this.entree.entrySet().iterator();
        while (iterator4.hasNext()) {
     
    totalAchat = totalAchat+objElement.getAchat();
    totalVente= totalVente+objElement.getVente();
				
		 }
        double efficacite= totalVente-totalAchat;
        System.out.println("votre efficacite est de "+efficacite);
		}
	}


}



