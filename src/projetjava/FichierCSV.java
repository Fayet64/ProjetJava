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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julien Fayet
 */
public class FichierCSV implements GererFichier{
    
    /*
    
    */
                //private static ArrayList<Element> elements =new ArrayList <Element>();
		//private static ArrayList<Chaine> chaineProd =new ArrayList <Chaine>();
                //private static ArrayList<ProductionSemaine> listeProdSemaine=new ArrayList<ProductionSemaine>();
                private static ArrayList<Achat> listeAchat=new ArrayList <Achat>();
                //private static HashMap<String,Double> listePrixE=new HashMap<String,Double>();
                // String et element 

		//Lecture du fichier cntenant les elements 
		public ArrayList<Element> chargerElements(){
                    
                        ArrayList<Element> elements =new ArrayList <Element>();
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
                
                return elements;
                }
                
                
                public ArrayList<Chaine> chargerChaines(){
                    
                        ArrayList<Element> elements =this.chargerElements();
                        ArrayList<Chaine> chaines =new ArrayList <Chaine>();
		try {
			//ouvert en mode lecture 
			FileReader chaine = new FileReader("chaines.csv");
			// pour le fichier on va bufferere est un objet qui possede la methode readline qui te permet de lire un fichier ligne par ligne 
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
                                        double quantiteElem;
                                        if(str.length<2){
					quantiteElem=0.0;
                                        }
                                        else{
                                        quantiteElem=Double.parseDouble(str[1]);
                                        }
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
				chaines.add(cp);


				
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

		return chaines;
	}
/*
    public void setProdSemaine(ArrayList<ProductionSemaine> obj){
         this.listeProdSemaine =obj ;
    }
    
    public ArrayList<ProductionSemaine> getProdSemaine() {
    return listeProdSemaine;
    }
*/
    public  ArrayList<Achat> getListeAchat() {
        return listeAchat;
    }

    
public  void ecrireElements(Usine usine) throws IOException {
        BufferedWriter fw = new BufferedWriter(new FileWriter("elements.csv"));
        
        String ligneTitre= "Code"+";"+"Nom"+";"+"Quantite"+";"+"Unite"+";"+"Achat"+";"+"Vente"+"Demande";
        
        fw.write(ligneTitre);
        fw.newLine();
       
    	for(Element e:usine.getElements()) {
                                 
				 String ligne= e.getCode()+";"+e.getNom()+";"+e.getQuantite()+";"+e.getUnite()+";"+e.getAchat()+";"+e.getVente()+";"+e.getDemande();
                                fw.write(ligne);
                                 
                                 fw.newLine();
			}
                                fw.close();
    	
    }
    public void ecrireProdSemaine(ArrayList<ProductionSemaine> prodSem) {
        
    BufferedWriter fw = null;
                    try {
                        fw = new BufferedWriter (new FileWriter("ProgrammationSemaines.csv"));
                        String ligneTitre= "Nom"+";"+"Date"+";"+"Production";
                        fw.write(ligneTitre);
                        fw.newLine();
                        System.out.println(" methode"+prodSem);
                        for (ProductionSemaine e:prodSem){
                            String ligne= e.getNomSemaine()+";"+e.getDate()+";";
                            String prod="";
                            System.out.println("Premier for");
                            for (Production p : e.getListeProd()){
                                System.out.println("Deuxieme for");
                                if(prod.equals("")){
                                    prod ="("+ p.getObjElement().getCode()+","+p.getQuantite()+")";
                                }
                                else{
                                    prod=prod+",("+ p.getObjElement().getCode()+","+p.getQuantite()+")";
                                }
                                
                            }
                            ligne=ligne+prod;
                            System.out.println(ligne);
                            fw.write(ligne);
                            System.out.println("frwrite");
                            fw.newLine();
                        }               } catch (IOException ex) {
                        Logger.getLogger(FichierCSV.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {
                            fw.close();
                        } catch (IOException ex) {
                            Logger.getLogger(FichierCSV.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
    
}
    
public ArrayList<ProductionSemaine> chargerProdSemaine () {
    ArrayList<ProductionSemaine> listeProdSemaine=new ArrayList<ProductionSemaine>();
   
    try {
        FileReader fic=new FileReader("ProgrammationSemaines.csv");
        BufferedReader bf = new BufferedReader(fic);
        String chaine;
        chaine = bf.readLine();
        while((chaine = bf.readLine())!= null)
        {
                String tabChaine[] = chaine.split(";");

        // Partie 2 conversion des machin du tableaux en attribut du style int etc
            String nom =tabChaine[0];
            String date=tabChaine[1];                                          
            // ici conversion revoir le cours 
            //Hashmap qui contient les element en entre
            //HashMap<Production,Double>prod=new HashMap<Production,Double>();
            ArrayList<Production> prod=new ArrayList<Production>();
            // ici on va suprimer les espace et on va separer avec ),( et on le fous dans  le tableau entrers
            String[] entrers =tabChaine[2].replace(" ","").split("\\),\\(");
            for (int i=0;i<entrers.length;i++) {
                    String str[]= entrers[i].replace("(","").replace(")","").split(",");
                    String codeElem=str[0];
                    double quantite;
                    if(str.length<2){
                    quantite=0.0;
                    }
                    else{
                    quantite=Double.parseDouble(str[1]);
                    }
                    //pour chaque element de la liste si sont code coreponds au codeelement et bien on va lajouter a la liste des entrer de la chaine de prod
                   
                   for (Element elem:this.chargerElements()) {
                            if(elem.getCode().equals(codeElem)) {
                            prod.add(new Production (elem ,quantite));
                            }
                    }
                   
            }		
        // creer un production semaine et lajouter 
        ProductionSemaine prodSem = new ProductionSemaine( nom,date,prod);
        listeProdSemaine.add(prodSem);
                 
        }
        bf.close();
        fic.close();
           
        } catch (IOException ex) {
        Logger.getLogger(FichierCSV.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
         return listeProdSemaine;
    }

 public void ecrireListeAchat(){
     
       BufferedWriter fy;
                    try {
                        fy = new BufferedWriter(new FileWriter("achats.csv"));
                     
                    
        String lignetitrea= "CodeAchat"+";"+"CodeElement"+";"+"Quantite"+";"+"Date";
        fy.write(lignetitrea);
         fy.newLine();
        for (Achat e:listeAchat){
            String lignea = e.getCodeAchat()+";"+e.getCodeElement()+";"+e.getQuantite()+";"+e.getDateA();
            fy.write(lignea); 
            fy.newLine();
        }
        
				fy.close();
                                
            } catch (IOException ex) {
                        Logger.getLogger(FichierCSV.class.getName()).log(Level.SEVERE, null, ex);

            }
    }
 public HashMap<String,HashMap<String,Double> > chargerListePrix(){
    HashMap<String,HashMap<String,Double>> listePrixE=new HashMap<String,HashMap<String,Double>>();

 try{
    BufferedReader fs =new BufferedReader(new FileReader("listeprix.csv"));
    String chaine;
    double prixAchat;
    
    //le premier cest la date
    //deuxielme = code 
    //3eme cest le prix =double
    
     
    chaine = fs.readLine();
             while((chaine = fs.readLine())!= null)
        {
                String tabChaine[] = chaine.split(";");

        // Partie 2 conversion des machin du tableaux en attribut du style int etc
            String code =tabChaine[0];  
            System.out.println(tabChaine[1]);
            prixAchat =Double.parseDouble(tabChaine[1]);
            String date=tabChaine[2]; 
            if(listePrixE.get(date)!=null){
                listePrixE.get(date).put(code, prixAchat);
            }else{
                HashMap<String,Double> Lamap=new HashMap<String,Double>();
                Lamap.put(code,prixAchat);
                listePrixE.put(date, Lamap);
                }
       
         } 
     try {
         fs.close();
     } catch (IOException ex) {
         Logger.getLogger(FichierCSV.class.getName()).log(Level.SEVERE, null, ex);
     }
}catch (FileNotFoundException e){
     System.out.println("Le fichier est introuable");
}                   catch (IOException ex) {
                        Logger.getLogger(FichierCSV.class.getName()).log(Level.SEVERE, null, ex);
                    }

                 return listePrixE;   
 }

}

    

    
                


