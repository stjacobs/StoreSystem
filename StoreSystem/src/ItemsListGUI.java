import java.awt.BorderLayout;



import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ItemsListGUI extends JPanel {

	private static final long serialVersionUID = 1L;
	
	StoreSystem s;

	String[] columnNames = {"Märke",
            "Namn",
            "Antal",
            "Pris",
            "Streckkod"};
	
	DefaultTableModel dtm;
	JTable tab;
	
	public ItemsListGUI(StoreSystem s){
		this.s = s;
		
		dtm = new DefaultTableModel(columnNames, 0);
		tab = new JTable(dtm);
		
		setLayout(new BorderLayout());
		add(new JPanel(), "West");
		add(new JPanel(), "East");
		add(new JPanel(), "South");
		add(new JPanel(), "North");
		add(new JScrollPane(tab), "Center");
	}

	public void updateGUI(){		
		for(int i = dtm.getRowCount(); i < s.inventory.size(); i++){
			dtm.addRow(s.inventory.get(i).toObject());
		}
	}	
	
}
