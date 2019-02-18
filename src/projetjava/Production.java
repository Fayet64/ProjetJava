/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Aissatou Diop
 */
public class Production {
    private Element objE;
    private double quantite;

    public Production(Element objE, double quantite) {
        this.objE = objE;
        this.quantite = quantite;
    }

    public Element getObjE() {
        return objE;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setObjE(Element objE) {
        this.objE = objE;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
   

    
}
