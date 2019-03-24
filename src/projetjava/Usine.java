/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Julien Fayet
 */
public class Usine {
    
                private  ArrayList<Element> elements =new ArrayList <Element>();
		private  ArrayList<Chaine> chaineProd =new ArrayList <Chaine>();
                private  ArrayList<ProductionSemaine> listeProdSemaine=new ArrayList<ProductionSemaine>();
                private  ArrayList<Achat> listeAchat=new ArrayList <Achat>();
                private  HashMap<String,HashMap<String,Double> > listePrixE=new HashMap<String,HashMap<String,Double> >();

    public Usine() {
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public ArrayList<Chaine> getChaineProd() {
        return chaineProd;
    }

    public void setChaineProd(ArrayList<Chaine> chaineProd) {
        this.chaineProd = chaineProd;
    }

    public ArrayList<ProductionSemaine> getListeProdSemaine() {
        return listeProdSemaine;
    }

    public void setListeProdSemaine(ArrayList<ProductionSemaine> listeProdSemaine) {
        this.listeProdSemaine = listeProdSemaine;
    }

    public ArrayList<Achat> getListeAchat() {
        return listeAchat;
    }

    public void setListeAchat(ArrayList<Achat> listeAchat) {
        this.listeAchat = listeAchat;
    }

    public HashMap<String, HashMap<String,Double> > getListePrixE() {
        return listePrixE;
    }

    public void setListePrixE(HashMap<String, HashMap<String,Double>> listePrixE) {
        this.listePrixE = listePrixE;
    }
    
    
}
