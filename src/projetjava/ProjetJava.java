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
 * @author fayet64
 */
public class ProjetJava {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //fayet
        //test2kokia
        /*
        soustractionStockElement(10); 
        if(this.niveau==0){
            Syst
        }
*/      GererFichier objF=new FichierCSV();
        objF.charger();
        Chaine objChaine=objF.getChaineProd().get(0);
                
        ArrayList<Element> lesElements=objF.getElements();
        //System.out.println(lesElements);
        Calcul objCalcul=new Calcul();
        objCalcul.produire(objChaine,50);
        ArrayList<Element> lesElements2=objF.getElements();
        //System.out.println(lesElements2);
        //System.out.println(objChaine.getSortie().get(lesElements.get(5)));
        //objF.ecrireFichier();
    }
    
    
        
}
