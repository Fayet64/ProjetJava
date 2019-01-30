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
    private String Code;
    private String Nom;
    private HashMap<String,Integer> Entree;
    private HashMap<String,Integer> Sortie;
    private int NiveauA;
    
    public Chaine(String code,String nom){
        this.Code=code;
        this.Nom=nom;
        this.Entree=new HashMap <String,Integer>();
        this.Sortie=new HashMap <String,Integer>();
        this.NiveauA=0;
    }
}
