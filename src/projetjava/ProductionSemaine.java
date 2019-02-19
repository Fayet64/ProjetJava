/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Julien Fayet
 */
public class ProductionSemaine {
    
    
    private String nomSemaine;
    private String date;
    private ArrayList<Production> listeProd;
    /// ici il faut ajouter une array liste mais moi je vais mettr une hasmap on verra mdr quoique nom
    public ProductionSemaine(String nomSemaine, String date,ArrayList<Production> listeProd) {
        this.nomSemaine = nomSemaine;
        this.date = date;
        this.listeProd = listeProd;
    }

    public ProductionSemaine(String nomSemaine, String date) {
        this.nomSemaine = nomSemaine;
        this.date = date;
        this.listeProd = listeProd;
    }
    
    public ProductionSemaine(){
        this.nomSemaine="";
        this.date="";
        this.listeProd=new ArrayList<Production>();
    }

    public String getNomSemaine() {
        return nomSemaine;
    }

    public void setNomSemaine(String nomSemaine) {
        this.nomSemaine = nomSemaine;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Production> getListeProd() {
        return listeProd;
    }

    public void setListeProd(ArrayList<Production> listeProd) {
        this.listeProd = listeProd;
    }
    
    public void ajouterProd(Production objProd){
        listeProd.add(objProd);
    }
    
    public void retirerProd(Production objProd){
        listeProd.remove(objProd);
    }
    
    
}
