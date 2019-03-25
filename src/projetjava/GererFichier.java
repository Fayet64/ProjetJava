/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * C'est une interface qui possède les methodes suivantes
 */
public interface GererFichier {
    public ArrayList<Element> chargerElements();
    public ArrayList<Chaine> chargerChaines();
    public ArrayList<ProductionSemaine> chargerProdSemaine();
    public HashMap<String,HashMap<String,Double>> chargerListePrix();
    public void ecrireElements (Usine usine) throws IOException;
    public ArrayList<Achat> getListeAchat();
    public void ecrireListeAchat();
    public void ecrireProdSemaine(ArrayList<ProductionSemaine> prodSem);
    

}