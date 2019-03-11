package projetjava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class AgentTableModel extends AbstractTableModel {

	private List<Element> list;

	public AgentTableModel(List<Element> list) {
		this.list = new ArrayList<>(list);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return getData(list.get(rowIndex), columnIndex);
	}

	public Object getData(Element elem, int col) {
		switch (col) {
			case 0: {
				return elem.getNom() + " " + elem.getCode();
			}
			case 1: {
				return elem.getQuantite();
			}
			case 2: {
				return elem.getUnite();
			}
		}
		return null;
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0: {
			return "Nom & Code";
		}
		case 1: {
			return "Quantite";
		}
		case 2: {
			return "Unite";
		}
		}
		return "";
	}

	@Override
	public int getRowCount() {
		return list.size(); // le nombre de lignes
	}

	@Override
	public int getColumnCount() {
		return 3; // le nombre de colonnes
	}
	
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
	
	public static void main(String[] args) {
		
		//DefaultTableColumnModel cm = new DefaultTableColumnModel();
		//cm.addColumn(createTableColumn(0,"Nom agent"));
		
		
		List<Element> elems=new ArrayList<Element>();
                FichierCSV objF=new FichierCSV();
                objF.charger();;
		elems=objF.getElements();

		
		final AgentTableModel model=new AgentTableModel(elems);
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
						model.removeAgent(elem);
						button1.setText("Test add");
					}
					else {
						performed=true;
						model.addAgent(elem);
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
						model.removeAgents(elems);
						button2.setText("Test remove multiple");
					}
					else {
						performed=true;
						model.addAgents(elems);
						button2.setText("Test add multiple");
					}
				}
			});
	        panel3.add(button2);
	        
	        frame.setSize(300,200);
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
		        
	}

	
}
