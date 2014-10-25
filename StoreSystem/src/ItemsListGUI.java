import java.awt.GridLayout;

import javax.swing.*;

public class ItemsListGUI extends JPanel {

	private static final long serialVersionUID = 1L;
	
	StoreSystem s;
	
	static DefaultListModel<Item> dlm;
	
	public ItemsListGUI(StoreSystem s){
		this.s = s;
		dlm = new DefaultListModel<Item>();
		JList<Item> list = new JList<Item>(dlm);		
		
		this.setLayout(new GridLayout());
		this.add(list);
	}
	
}
