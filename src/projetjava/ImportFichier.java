package projetjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ImportFichier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// array liste contenant les element lus depuis le fichier csv
		ArrayList<Element> elements =new ArrayList <Element>();
		ArrayList<Chaine> chaineProd =new ArrayList <Chaine>();
		//Lecture du fichier cntenant les elements 
		
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
				int demande=Integer.parseInt(fields[6]);
				Element el= new Element(code,nom,quantite,unite,achat,vente,demande);
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
                System.out.println(elements.get(0).getCode());
		//System.out.println(Arrays.toString(elements.toArray()));
		//System.out.println(Arrays.toString(chaineProd.toArray()));

		
	}

}
