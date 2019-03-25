/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 * <b> Cette classe permet de gerer la production
 * @author bronco
 */
public class Production {
    private Element objElement;
    private double quantite;
    /**
     * premier constucteur
     * @param objElement
     * @param quantite 
     */
    public Production(Element objElement, double quantite) {
        this.objElement = objElement;
        this.quantite = quantite;
    }
    /**
     * deuxième constructeur
     */
    public Production(){
        this.objElement=null;
        this.quantite=0;
    }

    public Element getObjElement() {
        return objElement;
    }

    public void setObjElement(Element objElement) {
        this.objElement = objElement;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
    
    
}
