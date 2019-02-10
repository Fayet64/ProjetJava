/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.BufferedReader; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
/**
 *
 * @author Julien Fayet
 */
public class GererFichier {
    
    /*
    
    */
                private static ArrayList<Element> elements =new ArrayList <Element>();
		private static ArrayList<Chaine> chaineProd =new ArrayList <Chaine>();
		//Lecture du fichier cntenant les elements 
		public static void charger(){
		try {
			//ouvert en mode lecture 
			FileReader elem = new FileReader("elements.csv");
			// pour le fichier on va bufferere est un obje qui possede la methode readline qui te permet de lire un fichier ligne par ligne 
			//ouvert en mode parcour buffered
			BufferedReader br = new BufferedReader(elem); 
			//lecture ligne par ligne 
			String line =br.readLine(); 
			// attention saut de la prmiere ligne 
			while ((line=br.readLine()) !=null) {
				// ici tu decoupe avec le split tu les met dans un tableau fields
				String[] fields=line.split(";");
				// stanislas proposer pour regler le souci des na la facon suivante
				for (int i=0;i<fields.length;i++) {
					if(fields[i].equals("NA")) {
						fields[i]= "0";
					}
				}
				// Partie 2 conversion des machin du tableaux en attribut du style int etc
				String code =fields[0];
				String nom=fields[1];
				// ici conversion revoir le cours 
				double quantite =Double.parseDouble(fields[2]);
				String unite = fields[3];
				double achat =Double.parseDouble(fields[4]);
				double vente =Double.parseDouble(fields[5]);
				
				Element el= new Element(code,nom,quantite,unite,achat,vente);
				elements.add(el);
	
			}
			// le dernier a etre ouvert est le premier que tu ferme !!! mais ca depend de lchronologie
			br.close();
			elem.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		try {
			//ouvert en mode lecture 
			FileReader chaine = new FileReader("chaines.csv");
			// pour le fichier on va bufferere est un obje qui possede la methode readline qui te permet de lire un fichier ligne par ligne 
			//ouvert en mode parcour buffered
			BufferedReader bre = new BufferedReader(chaine); 
			//lecture ligne par ligne 
			String line =bre.readLine(); 
			// attention saut de la prmiere ligne 
			while ((line=bre.readLine()) !=null) {
				// ici tu decoupe avec le split tu les met dans un tableau fields
				String[] fields=line.split(";");
				// stanislas proposer pour regler le souci des na la facon suivante
				
				
				// Partie 2 conversion des machin du tableaux en attribut du style int etc
				String code =fields[0];
				String nom=fields[1];
				// ici conversion revoir le cours 
				//Hashmap qui contient les element en entre
				HashMap<Element,Double> entree=new HashMap<Element,Double>();
				// ici on va suprimer les espace et on va separer avec ),( et on le fous dans  le tableau entrers
				String[] entrers =fields[2].replace(" ","").split("\\),\\(");
				for (int i=0;i<entrers.length;i++) {
					String str[]= entrers[i].replace("(","").replace(")","").split(",");
					String codeElem=str[0];
					double quantiteElem=Double.parseDouble(str[1]);
					//pour chaque element de la liste si sont code coreponds au codeelement et bien on va lajouter a la liste des entrer de la chaine de prod
					for (Element elem:elements) {
						if(elem.getCode().equals(codeElem)) {
							entree.put(elem,quantiteElem);
						}
					}
				}
				HashMap<Element,Double> sortie=new HashMap<Element,Double>();
				// ici on va suprimer les espace et on va separer avec ),( et on le fous dans  le tableau entrers
				String[] sortier =fields[3].replace(" ","").split("\\),\\(");
				for (int i=0;i<sortier.length;i++) {
					String str[]= sortier[i].replace("(","").replace(")","").split(",");
					String codeElem=str[0];
					double quantiteElem=Double.parseDouble(str[1]);
					//pour chaque element de la liste si sont code coreponds au codeelement et bie on va lajoouter a la liste des entrer de la chaine de prod
					for (Element elem:elements) {
						if(elem.getCode().equals(codeElem)) {
							sortie.put(elem,quantiteElem);
						}
					}
				}
				
				
				Chaine cp= new Chaine(code,nom,entree,sortie);
				chaineProd.add(cp);


				
			}
			// le dernier a etre ouvert est le premier que tu ferme !!! mais ca depend de lchronologie
			bre.close();
			chaine.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
                //System.out.println(elements.get(0).getCode());
		//System.out.println(Arrays.toString(elements.toArray()));
		//System.out.println(Arrays.toString(chaineProd.toArray()));

		
	}

    public static ArrayList<Element> getElements() {
        return elements;
    }


    public static ArrayList<Chaine> getChaineProd() {
        return chaineProd;
    }
public static void ecrireFichier () throws IOException {
        BufferedWriter fw = new BufferedWriter(new FileWriter("elements.csv"));

    	
    	String ligneTitre= "Code"+";"+"Nom"+";"+"Quantite"+";"+"Unite"+";"+"Achat"+";"+"Vente";
        fw.write(ligneTitre);
        fw.newLine();
    	for(Element e:elements) {
                                 
				 String ligne= e.getCode()+";"+e.getNom()+";"+e.getQuantite()+";"+e.getUnite()+";"+e.getAchat()+";"+e.getVente();
                                 
                                 
                                 fw.write(ligne);
                                fw.newLine();
			}
				fw.close();
    	
    }
                
}

