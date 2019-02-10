package projetjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Cette fait l'ouverture, lecture du fichier, remplace les espace par des parenthèses ();
 * array liste contenant les elements lus depuis le fichier csv, 
 * buffere est un objet est objet qui possède la méthode readline et permet de lire un fichier ligne  par ligne 
 * après ouverture du fichier l'on fait lecture ligne par lgne (attention au saut de la première ligne);
 * Le split permet de le découper et mettre dans un tableau fields 
 * La deuxième partie fait la conversions des attributs du tableau en attribut int etc... 
 * Ensuite les espace sont remplacé par des ), ( qui seront introduit dans le tableau 
 * et pour chaque element de la liste si sont code coreponds au codeelement, on va l'ajouter a la liste des entrer de la chaine de production;
 */
public class ImportFichier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// array liste contenant les element lus depuis le fichier csv
		ArrayList<Element> elements =new ArrayList <Element>();
		ArrayList<Chaine> chaineProd =new ArrayList <Chaine>();
		//Lecture du fichier cntenant les elements 
		
		try {
			
			FileReader elem = new FileReader("elements.csv");
			
			BufferedReader br = new BufferedReader(elem); 
			
			String line =br.readLine(); 
			
			while ((line=br.readLine()) !=null) {
				
				String[] fields=line.split(";");
				
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
			
			FileReader chaine = new FileReader("chaines.csv");
			BufferedReader bre = new BufferedReader(chaine); 
			String line =bre.readLine();  
			while ((line=bre.readLine()) !=null) {
				String[] fields=line.split(";");			
				String code =fields[0];
				String nom=fields[1];
				HashMap<Element,Double> entree=new HashMap<Element,Double>();
				String[] entrers =fields[2].replace(" ","").split("\\),\\(");
				for (int i=0;i<entrers.length;i++) {
					String str[]= entrers[i].replace("(","").replace(")","").split(",");
					String codeElem=str[0];
					double quantiteElem=Double.parseDouble(str[1]);
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
					for (Element elem:elements) {
						if(elem.getCode().equals(codeElem)) {
							sortie.put(elem,quantiteElem);
						}
					}
				}
				
				
				Chaine cp= new Chaine(code,nom,entree,sortie);
				chaineProd.add(cp);


				
			}
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
