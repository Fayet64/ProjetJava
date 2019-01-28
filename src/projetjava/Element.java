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
    private String Code;
    private String Nom;
    private int Quantite;
    private String unite;
    private int achat;
    private int vente;
    
    public Element(String code,String nom,String unite){
        this.Code=code;
        this.Nom=nom;
        this.unite=unite;
        this.Quantite=0;
        this.achat=0;
        this.vente=0;
        
    }
}
