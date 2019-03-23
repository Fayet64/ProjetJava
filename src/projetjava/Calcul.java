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
import projetjava.Element; 

/**
 *
 * @author MamadouMbodouKokia
 */
public class Calcul {
 
    public Calcul(){
        
    }

/*  Gestion de la production 
* cette methode nous permet de gerer la production en fonction du niveau d'activité note nvx
* la première chose est de verifier le niveau d'activité  pour voir si une production peut être faite
* ensuite nous allons verifier si le stock des elements en entre de la chaine de production sont disponible grace à la methode verifStock
* si la methode verifstock nous renvoie true nous pouvons alors passé a la production.
* la quantite des elements utilisés dans la chaine de production seront retiré 
* la quantite des elements en sorties seront ajouté au stock present 
* l'achat des elements sera gerer dans la classe achat 
*/
   
   
   public Production creerProd (Chaine laChaine,int nvx){
       
                    GererFichier objFichier=new FichierCSV();
    if (nvx<0) {
		System.out.println("Il faut que votre niveau de production soit superieur a zero");
	} 		
		else if(nvx==0) {
				System.out.println("la chaine ne produit rien");
		
	}else
     objFichier.chargerChaines().get(1).getEntree().get(objFichier.chargerElements().get(1));
     ArrayList<Element> lesElements=objFichier.chargerElements();
     
     boolean achat=true;
     
     Iterator iterator = laChaine.getEntree().entrySet().iterator();
        while (iterator.hasNext() && achat==true) {
             Map.Entry me2 = (Map.Entry) iterator.next();
            //System.out.println("Test : Key: "+me2.getKey() + " & Value: " + me2.getValue());
            //System.out.println(lesElements.indexOf(me2.getKey()));
            //System.out.println(this.verifStock(lesElements.indexOf(me2.getKey())));
           // achat=this.verifStock(lesElements.indexOf(me2.getKey()));
            Element objE=(Element) me2.getKey();
            achat=objE.verifStock(laChaine,nvx);
            
            //System.out.println(achat);
        }
    if(achat!=false){
        
                    // Ajout du produit fabriqué 
                    
        Element objElement=new Element();
        Iterator iterator2 = laChaine.getSortie().entrySet().iterator();
        while (iterator2.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator2.next();
            objElement=(Element) me2.getKey();
        }
                double newQuante= laChaine.getSortie().get(objElement);
         Production prod= new Production(objElement, newQuante);
     return prod;      
    }
   return null;
   }   
    
    public void produire (Chaine laChaine,int nvx){
        
                    GererFichier objFichier=new FichierCSV();
    if (nvx<0) {
		System.out.println("Il faut que votre niveau de production soit superieur a zero");
	} 		
		else if(nvx==0) {
				System.out.println("la chaine ne produit rien");
		
	}else
     objFichier.chargerChaines().get(1).getEntree().get(objFichier.chargerElements().get(1));
     ArrayList<Element> lesElements=objFichier.chargerElements();
     
     boolean achat=true;
     
     Iterator iterator = laChaine.getEntree().entrySet().iterator();
        while (iterator.hasNext() && achat==true) {
             Map.Entry me2 = (Map.Entry) iterator.next();
            //System.out.println("Test : Key: "+me2.getKey() + " & Value: " + me2.getValue());
            //System.out.println(lesElements.indexOf(me2.getKey()));
            //System.out.println(this.verifStock(lesElements.indexOf(me2.getKey())));
           // achat=this.verifStock(lesElements.indexOf(me2.getKey()));
            Element objE=(Element) me2.getKey();
            achat=objE.verifStock(laChaine,nvx);
            
            //System.out.println(achat);
        }
    if(achat!=false){
        
                    // Ajout du produit fabriqué 
                    
        Element objElement=new Element();
        Iterator iterator2 = laChaine.getSortie().entrySet().iterator();
        while (iterator2.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator2.next();
            objElement=(Element) me2.getKey();
        }
                double newQuante= laChaine.getSortie().get(objElement);
                System.out.println(" Quantite en sortie du produit "+objElement.getNom()+" : "+newQuante);                
                    System.out.println("Quantite du produit "+objElement.getNom()+ " avant "+objElement.getQuantite());
                     objElement.setQuantite(objElement.getQuantite()+(newQuante*nvx)) ;
                     System.out.println("Quantite du produit "+objElement.getNom()+ " après "+objElement.getQuantite());
               
                     
                    // retirer les quantité 
                    
                Element objElement2=new Element();
                Iterator iterator3 = laChaine.getEntree().entrySet().iterator();
        
                while (iterator3.hasNext()) {
             Map.Entry me2 = (Map.Entry) iterator3.next();
            objElement2=(Element) me2.getKey();
            System.out.println("Quantite de matière première "+objElement2.getNom()+" avant: "+objElement2.getQuantite());
            double newQuantite= laChaine.getEntree().get(me2.getKey());
            objElement2.setQuantite(objElement2.getQuantite()-newQuantite*nvx);
            System.out.println("Quantite de matière première "+objElement2.getNom()+" apres: "+objElement2.getQuantite());
        }
                       
              
    } 
    else{
        System.out.println("Vous ne pouvez pas réaliser ce produit car il manque du stock et il n'y à pas de prix d'achat");
    }
    
         }
    
    public double satisfaction(double quantite,int demande){
        if(demande>0){
        return (double)(quantite/demande)*100;
        }
        else{
            return 0;
        }
    }
    
  
  
    }
    

