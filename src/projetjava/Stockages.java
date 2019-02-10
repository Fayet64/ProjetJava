/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 *
 * @author MamadouMbodouKokia
 */
public class Stockages {
    private String code; 
    private String nom; 
    private int capacite; 
    private int qteDispo; 
    
    public Stockages(String code, String nom, int capacite, int qteDispo){
        this.code = code; 
        this.nom = nom; 
        this.capacite = capacite; 
        this.qteDispo = qteDispo;
    }

    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public int getQteDispo() {
        return qteDispo;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setQteDispo(int qteDispo) {
        this.qteDispo = qteDispo;
    }
    
}
