import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainGUI implements ActionListener{
	
	JFrame frame;
	JPanel mainPanel = new JPanel(new BorderLayout());
	JPanel buttonPanel = new JPanel(new GridLayout(3, 1));
	
	JTabbedPane tabs = new JTabbedPane();
	
	StoreSystem s;
	AddItemGUI g = new AddItemGUI(s);
	
	public MainGUI(StoreSystem s){
		this.s = s;
		frame = new JFrame("Store system");
		frame.setSize(1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		tabs.add("Sälj", new JPanel());
		tabs.add("Varor", new ItemsListGUI(s));
		tabs.add("Lägg till",new AddItemGUI(s));
		tabs.add("Ta bort", new JPanel());
		
		frame.add(tabs);
		
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		//Object o = ae.getSource();

	}
}
