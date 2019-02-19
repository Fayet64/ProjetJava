/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
*/      /*GererFichier objF=new FichierCSV();
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
         */               
           // Element elem = new Element("CD001","lapin",10,"3",12,14,5);
                   

        // Production lala= new Production (elem , 10);
         
         
         
        // ProductionSemaine lipus = new ProductionSemaine ("semaine1","10/01/2019");
        // lipus.ajouterProd(lala);
        // lipus.ajouterProd(lala);

         
       GererFichier objfichier = new FichierCSV();
       objfichier.charger();
        //ArrayList<ProductionSemaine> listeProdSemaine=new ArrayList<ProductionSemaine>();
        //listeProdSemaine.add(lipus);
        //mettre ajour larraylist 
        //objfichier.setProdSemaine(listeProdSemaine);
        
       // objfichier.ecrireProdSemaine();
       /* objfichier.lireProdSemaine();
        for (ProductionSemaine p : objfichier.getProdSemaine()){
            System.out.println(p.getListeProd()+"nom"+p.getNomSemaine()+" date"+ p.getDate());
            for (Production prod : p.getListeProd()){
                System.out.println(p.getNomSemaine()+" -"+prod.getObjElement().getNom()+"-"+prod.getQuantite());
                System.out.println("teeeeeeeeeeeeeeeeeeeeeeeeeee");
            }
            System.out.println("test");
     
        }*/
        
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    System.out.println(dateFormat.format(date));
        
        
        
                       
                       
                      

    
    
    }
    
    
        
}
