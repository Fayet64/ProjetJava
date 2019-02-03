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
public void produire (int nvx, int n){
    //1erer etape recuperer les produit dont on a besoin pour la chaine choisi en parametre
    GererFichier.getChaineProd().get(n);
    //regarder combien de produit on a besoin en entrée.BOF PAS BESOIN CAR ON CONNAIT DEJA LE CODE DE LA CHAINE 
     GererFichier.getChaineProd().get(n).entree.size();
     GererFichier.getChaineProd().get(1).entree.get(GererFichier.getElements().get(1));
     
         
     // Gestion de la premiere chaine de production 
     
    //2eme etape pour chaque produit verifier que cette matiere premeire ou produit existe (le get(n) cest quel chaine qui va etre choisi 
    if (GererFichier.getChaineProd().get(0).entree.get(GererFichier.getElements().get(3)) > GererFichier.getElements().get(3).getQuantite()){
        if (GererFichier.getElements().get(3).getAchat()==0){
            System.out.println("Nous ne pouvons pas faire ce produit");
        }
             else {
                 double l = GererFichier.getChaineProd().get(0).entree.get(GererFichier.getElements().get(1)) - GererFichier.getElements().get(3).getQuantite();
                   // Achat.ajoutQ(l);
                System.out.println("le produit a ete commandé");
                    }
    }
    if (GererFichier.getChaineProd().get(0).entree.get(GererFichier.getElements().get(1)) < GererFichier.getElements().get(1).getQuantite()){
        // la on rentre sur la deuxieme entree
               if (GererFichier.getChaineProd().get(0).entree.get(GererFichier.getElements().get(1)) > GererFichier.getElements().get(1).getQuantite()){
                    if (GererFichier.getElements().get(1).getAchat()==0)
                    System.out.println("Nous ne pouvons pas faire ce produit");
               }else{ 
                 double l = GererFichier.getChaineProd().get(0).entree.get(GererFichier.getElements().get(1)) - GererFichier.getElements().get(1).getQuantite();
                   // Achat.ajoutQ(l);
                    System.out.println("le produit a ete commandé");
                    } 
    }
    if (GererFichier.getChaineProd().get(0).entree.get(GererFichier.getElements().get(2)) < GererFichier.getElements().get(2).getQuantite()){
                    // la on rentre sur la troisieme  entree
                         if (GererFichier.getChaineProd().get(0).entree.get(GererFichier.getElements().get(2)) > GererFichier.getElements().get(2).getQuantite()){
                             if (GererFichier.getElements().get(1).getAchat()==0)
                                System.out.println("Nous ne pouvons pas faire ce produit");
                         }else{ 
                             double l = GererFichier.getChaineProd().get(0).entree.get(GererFichier.getElements().get(2)) - GererFichier.getElements().get(2).getQuantite();
                              //Achat.ajoutQ(l);
                            System.out.println("le produit a ete commandé");
                             } 
                         
            } else {
                double newQuante= GererFichier.getChaineProd().get(0).sortie.get(GererFichier.getElements().get(1));
                
                // il faut une methode qui prend la quantie de lelement produit et lajouter au elements deja present dans element du coup ça fera un truc du genre pour la chiane de prod 1 
                // quantite du produit e005 + 1
                //en gros ca donne ça
                     GererFichier.getElements().get(6).setQuantite(GererFichier.getElements().get(6).getQuantite()+newQuante*nvx) ;
                     
                // retirer les quantité 
                        double newQuante1= GererFichier.getChaineProd().get(0).entree.get(GererFichier.getElements().get(1));
                        double newQuante2= GererFichier.getChaineProd().get(0).entree.get(GererFichier.getElements().get(2));
                        double newQuante3= GererFichier.getChaineProd().get(0).entree.get(GererFichier.getElements().get(3));
                        
                     GererFichier.getElements().get(6).setQuantite(GererFichier.getElements().get(3).getQuantite()-newQuante1*nvx);
                     GererFichier.getElements().get(6).setQuantite(GererFichier.getElements().get(1).getQuantite()-newQuante2*nvx);
                     GererFichier.getElements().get(6).setQuantite(GererFichier.getElements().get(2).getQuantite()-newQuante3*nvx);
                     
                     // Fin de la premiere chaine de production 
                     
                     
                     
                     
                     
                     
                    }
        
    }




}
