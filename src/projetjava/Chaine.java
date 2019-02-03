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
    //1erer etape recuperer les produit dont on a besoin pour la chaine choisi en parametre
   // Chaine laChaine =GererFichier.getChaineProd().get(nbChaine);
    //regarder combien de produit on a besoin en entrée.BOF PAS BESOIN CAR ON CONNAIT DEJA LE CODE DE LA CHAINE 
    // GererFichier.getChaineProd().get(n).entree.size();
    
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
            achat=objE.verifStock(this);
            //System.out.println(achat);
        }
     
         
  
    if(achat!=false){
        Element objElement=new Element();
        Iterator iterator2 = this.sortie.entrySet().iterator();
        while (iterator2.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator2.next();
            objElement=(Element) me2.getKey();
        }
                double newQuante= this.sortie.get(objElement);
                System.out.println(" Quantite en sortie du produit "+objElement.getNom()+" : "+newQuante);
                // il faut une methode qui prend la quantie de lelement produit et lajouter au elements deja present dans element du coup ça fera un truc du genre pour la chiane de prod 1 
                // quantite du produit e005 + 1
                //en gros ca donne ça
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
                       
                     // Fin de la premiere chaine de production 
    } 
    else{
        System.out.println("Vous ne pouvez pas réaliser ce produit car il manque du stock et il n'y à pas de prix d'achat");
    }
    
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
