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
public class Production {
    private Element objElement;
    private double quantite;

    public Production(Element objElement, double quantite) {
        this.objElement = objElement;
        this.quantite = quantite;
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
