/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Julien Fayet
 */
public interface GererFichier {
    public void charger();
    public ArrayList<Element> getElements();
    public ArrayList<Chaine> getChaineProd();
    public void ecrireFichier () throws IOException;
    public void ecrireProdSemaine();
    public void lireProdSemaine();
    public ArrayList<ProductionSemaine> getProdSemaine();
    public void setProdSemaine(ArrayList<ProductionSemaine>obj );
    public ArrayList<Achat> getListeAchat();
    public void ecrireListeAchat();

    public void lireListePrix();

}
