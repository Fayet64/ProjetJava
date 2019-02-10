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
public void produire (int nvx){
    
    /*  Gestion de la production 
     * cette methode nous permet de gerer la production en fonction du niveau d'activité note nvx
     * la première chose est de verifier le niveau d'activité  pour voir si une production peut être faite
     * ensuite nous allons verifier si le stock des elements en entre de la chaine de production sont disponible grace à la methode verifStock
     * si la methode verifstock nous renvoie true nous pouvons alors passé a la production.
     * la quantite des elements utilisés dans la chaine de production seront retiré 
     * la quantite des elements en sorties seront ajouté au stock present 
     * l'achat des elements sera gerer dans la classe achat 
    */
    
    if (nvx<0) {
		System.out.println("Il faut que votre niveau de production soit superieur a zero");
	} 		
		else if(nvx==0) {
				System.out.println("la chaine ne produit rien");
		
	}else{
     GererFichier.getChaineProd().get(1).entree.get(GererFichier.getElements().get(1));
     ArrayList<Element> lesElements=GererFichier.getElements();
     
     boolean achat=true;
     Iterator iterator = this.entree.entrySet().iterator();
        while (iterator.hasNext() && achat==true) {
             Map.Entry me2 = (Map.Entry) iterator.next();
            //System.out.println("Test : Key: "+me2.getKey() + " & Value: " + me2.getValue());
            //System.out.println(lesElements.indexOf(me2.getKey()));
            //System.out.println(this.verifStock(lesElements.indexOf(me2.getKey())));
           // achat=this.verifStock(lesElements.indexOf(me2.getKey()));
            Element objE=(Element) me2.getKey();
            achat=objE.verifStock(this,nvx);
            //System.out.println(achat);
        }
    if(achat!=false){
        
                    // Ajout du produit fabriqué 
                    
        Element objElement=new Element();
        Iterator iterator2 = this.sortie.entrySet().iterator();
        while (iterator2.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator2.next();
            objElement=(Element) me2.getKey();
        }
                double newQuante= this.sortie.get(objElement);
                System.out.println(" Quantite en sortie du produit "+objElement.getNom()+" : "+newQuante);                
                    System.out.println("Quantite du produit "+objElement.getNom()+ " avant "+objElement.getQuantite());
                     objElement.setQuantite(objElement.getQuantite()+(newQuante*nvx)) ;
                     System.out.println("Quantite du produit "+objElement.getNom()+ " après "+objElement.getQuantite());
               
                     
                    // retirer les quantité 
                    
                Element objElement2=new Element();
                Iterator iterator3 = this.entree.entrySet().iterator();
        
                while (iterator3.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator3.next();
            objElement2=(Element) me2.getKey();
            System.out.println("Quantite de matière première "+objElement2.getNom()+" avant: "+objElement2.getQuantite());
            double newQuantite= this.entree.get(me2.getKey());
            objElement2.setQuantite(objElement2.getQuantite()-newQuantite*nvx);
            System.out.println("Quantite de matière première "+objElement2.getNom()+" apres: "+objElement2.getQuantite());
        }
                       
              
    } 
    else{
        System.out.println("Vous ne pouvez pas réaliser ce produit car il manque du stock et il n'y à pas de prix d'achat");
    }
    
                }
}

        public void efficacite() {
            
            /*  Gestion de l'efficacite 
             * cette methode permet de verifier l'efficacité de la production 
             * Si la production est possible,nous allons verifier sont efficacité en faisaint le calcul suivant
             *  Valeur des ventes de tous les stock dispo)- (le montant total des achat a effectuer)
             */
            
            // il y a encore des imcomprehension dans cette methoode et si il n'y a pas d'achat a effectuer ? 
	if (Element.verifStock(this,3)==true) {
		Element objElement3=new Element();
		double totalAchat=0;
		double totalVente=0;
        Iterator iterator4 = this.entree.entrySet().iterator();

        while (iterator4.hasNext()) {
     
    totalAchat = totalAchat+objElement3.getAchat();
    totalVente= totalVente+objElement3.getVente();
				
		 }
        double efficacite= totalVente-totalAchat;
        System.out.println("votre efficacite est de "+efficacite);
		}
	}
/*
public boolean verifStock(int nbElement){
    boolean res=true;
    System.out.println("test verifStock");
    if (this.entree.get(GererFichier.getElements().get(nbElement)) > GererFichier.getElements().get(nbElement).getQuantite()){
        if (GererFichier.getElements().get(nbElement).getAchat()==0){
            System.out.println("Nous ne pouvons pas faire ce produit");
            res=false;
        }
             else {
                 double l = this.entree.get(GererFichier.getElements().get(nbElement)) - GererFichier.getElements().get(nbElement).getQuantite();
                   // Achat.ajoutQ(l);
                System.out.println("le produit a ete commandé");
                    }
    }
    return res;
}
*/



}
