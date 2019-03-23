package projetjava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class AgentTableModel extends AbstractTableModel {

        private ArrayList<ProdSemaineChaine> listHistoProd;
        private Usine usine;

	public AgentTableModel(Usine usine) {
                this.usine=usine;
                boolean res=false;
                ProdSemaineChaine objPsc=new ProdSemaineChaine();
                ProdSemaineChaine objP=null;
                this.listHistoProd=new ArrayList<ProdSemaineChaine> ();
                
                //On parcours chaque semaine de production
                for(ProductionSemaine s:usine.getListeProdSemaine()){
                    
                    res=false;
                    //Pour chacune de ses semaines on récupère les productions 
                    for(Production p:s.getListeProd()){
                        //System.out.println(p.getObjElement());
                        
                        //On test si la liste des production par semaine et par chaine est vide
                        if(listHistoProd.isEmpty()){
                            Chaine objChaine=null;
                            
                            //Si elle est vide on parcours toute les chaine 
                            for(Chaine c:usine.getChaineProd()){
                                //On parcours les éléments en sortie de ses chaine
                                for(Element e:c.getSortie().keySet()){
                                    //Si l'élément en sortie correspond à la production alors on récupère la chaine
                                    if(e.getCode().equals(p.getObjElement().getCode())){
                                    objChaine=c;
                                    }
                                }
                            }
                            
                            System.out.println(objChaine.getCode()+"objChaine vide");
                            //On crée une production par semaine par chaine avec la chaine obtenu et on ajoute la quantité produite par la production sur laquelle on se trouve
                            objP=new ProdSemaineChaine(s.getNomSemaine(),s.getDate(),objChaine,p.getQuantite());
                            //System.out.println("ProdSemaine"+objP.getSemaine());
                            this.listHistoProd.add(objP);
                        }
                        else{
                        //Si la liste des prod par semaine par chaine n'est pas vide on la parcours
                        for(ProdSemaineChaine ps:listHistoProd){
                            //res=false;
                            //System.out.println(ps.getChaine()+" prodSemaineChaine");
                            //Pour chaque objet on récupère les éléments en sortie de cette chaine 
                            for(Element e:ps.getChaine().getSortie().keySet()){
                                //Si l'élément en sortie correspond à la production alors on récupère la prodSemaineChaine et on met un booléen à true
                                System.out.println(ps.getChaine().getCode()+" if "+p.getObjElement().getCode()+" "+e.getCode().equals(p.getObjElement().getCode()) );
                                if(e.getCode().equals(p.getObjElement().getCode()) && ps.getSemaine().equals(s.getNomSemaine())){
                                    res=true;
                                    objPsc=ps;
                                    System.out.println("Test entrer");
                            }
                            }
                        }
                            System.out.println(res);
                        //Si booléan a true alors on incrémente la quantité de la prodSemaineChaine avec la quantité de la production actuelle
                        if(res==true){
                            System.out.println("Entrer true");
                            objPsc.setQuantite(objPsc.getQuantite()+p.getQuantite());
                        }
                        else{
                            //Si boolean a false on récupère a nouveau la chaine qui correspond avec l'élément en production et on crée la ProdSemaineChaine
                            Chaine objChaine=null;
                            for(Chaine c:usine.getChaineProd()){
                                for(Element e:c.getSortie().keySet()){
                                    if(e.getCode().equals(p.getObjElement().getCode())){
                                    objChaine=c;
                                    }
                                }
                            }
                            System.out.println(objChaine.getCode()+"objChaine pas vide");
                            objP=new ProdSemaineChaine(s.getNomSemaine(),s.getDate(),objChaine,p.getQuantite());
                            this.listHistoProd.add(objP);
                            
                        }
                        res=false;
                        } 
                    }
                    
                }
                for(ProdSemaineChaine psce:listHistoProd){
                                System.out.println("Chaine: "+psce.getChaine().getCode());
                                System.out.println(psce.getQuantite());
                            }
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return getData(listHistoProd.get(rowIndex), columnIndex);
	}

	public Object getData(ProdSemaineChaine ch, int col) {
		switch (col) {
			case 0: {
				return ch.getSemaine();
			}
			case 1: {
				return ch.getChaine().getCode();
			}
			case 2: {
				return ch.getQuantite();
			}
                        case 3:{
                                return ch.getDate();
                        }
                        
		}
		return null;
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0: {
			return "Semaine";
		}
		case 1: {
			return "Chaine";
		}
		case 2: {
			return "Quantité produite";
		}
                case 3:{
                        return "Date de production";
                }
                
		}
		return "";
	}

	@Override
	public int getRowCount() {
		return listHistoProd.size(); // le nombre de lignes
	}

	@Override
	public int getColumnCount() {
		return 4; // le nombre de colonnes
	}
	/*
	public void addAgent(Element elem) {
		int rowIndex=list.size();
		list.add(elem);
		fireTableRowsInserted(rowIndex, rowIndex);
	}

	public void addAgents(List<Element> elems) {
		int rowIndex=list.size();
		list.addAll(elems);
		fireTableRowsDeleted(rowIndex, rowIndex+elems.size()-1);
	}

	public void removeAgent(Element elem) {
		int rowIndex=list.indexOf(elem);
		if ( rowIndex>=0 ) {
			list.remove(elem);
			fireTableRowsInserted(rowIndex, rowIndex);
		}
	}

	public void removeAgents(List<Element> elems) {
		
		int rowIndex=0;
		int firstIndex=rowIndex;
		
		while(rowIndex<list.size()) {
			while ( rowIndex<list.size() && elems.contains(list.get(rowIndex)) ) {
				rowIndex++;
			}
			if ( rowIndex>firstIndex ) {
			   for(int index=firstIndex; index<rowIndex; index++ ) {
				   list.remove(firstIndex);
			   }
			   rowIndex=firstIndex;
			   fireTableRowsDeleted(firstIndex, rowIndex);
			}
			while ( rowIndex<list.size() && !elems.contains(list.get(rowIndex)) ) {
				rowIndex++;
			}
			firstIndex=rowIndex;
		}
		
	}
	
	public void updateAgent(Element elem, int columnIndex) {
		int rowIndex=list.indexOf(elem);
		while ( rowIndex>=0 ) {
			fireTableCellUpdated(rowIndex, columnIndex);
			rowIndex=list.subList(rowIndex+1, list.size()).indexOf(elem);
		}
	}

	public Element getAgent(int rowIndex) {
		return list.get(rowIndex);
	}
        */
	/*
	public static void main(String[] args) {
		
		//DefaultTableColumnModel cm = new DefaultTableColumnModel();
		//cm.addColumn(createTableColumn(0,"Nom agent"));
		
		
                FichierCSV objFichier=new FichierCSV();
                Usine usine=new Usine();
                usine.setChaineProd(objFichier.chargerChaines());
                usine.setElements(objFichier.chargerElements());
                usine.setListeProdSemaine(objFichier.chargerProdSemaine());
                usine.setListePrixE(objFichier.chargerListePrix());

		
		final AgentTableModel model=new AgentTableModel(usine);
		final JTable table = new JTable(model);
		
	        JFrame frame=new JFrame();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        
	        JPanel panel=new JPanel();

	        frame.getContentPane().add(panel);
	        
	        panel.setLayout(new BorderLayout());
	        
	        JPanel panel2=new JPanel();
	        panel2.setLayout(new BorderLayout());
	        panel2.add(table.getTableHeader(), BorderLayout.NORTH);
	        panel2.add(new JScrollPane(table), BorderLayout.CENTER);
	        panel.add(panel2, BorderLayout.CENTER);
	        
	        JPanel panel3=new JPanel();
	        panel.add(panel3, BorderLayout.SOUTH);
	        panel3.setLayout(new FlowLayout());
	        
	        final JButton button1 = new JButton("Test add");
	        button1.addActionListener(new ActionListener() {
				
	        	boolean performed=false;
	        	Element elem = new Element();
				@Override
				public void actionPerformed(ActionEvent e) {
					if( performed ) {
						performed=false;
						//model.removeAgent(elem);
						button1.setText("Test add");
					}
					else {
						performed=true;
						//model.addAgent(elem);
						button1.setText("Test remove");
					}
				}
			});
	        panel3.add(button1);
	        
	        final JButton button2 = new JButton("Test add multiple");
	        button2.addActionListener(new ActionListener() {

	        	boolean performed=false;
				List<Element> elems=new ArrayList<>();
	        	{
					elems.add(new Element());
					elems.add(new Element());
					elems.add(new Element());
	        	}
	        	
				@Override
				public void actionPerformed(ActionEvent e) {
					if( performed ) {
						performed=false;
						//model.removeAgents(elems);
						button2.setText("Test remove multiple");
					}
					else {
						performed=true;
						//model.addAgents(elems);
						button2.setText("Test add multiple");
					}
				}
			});
	        panel3.add(button2);
	        
	        frame.setSize(300,200);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
		        
	}
*/
	
}
