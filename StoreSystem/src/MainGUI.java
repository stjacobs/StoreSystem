import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MainGUI implements ChangeListener{
	
	JFrame frame;
	JPanel mainPanel = new JPanel();
	
	JTabbedPane tabs = new JTabbedPane();
	
	StoreSystem s;
	AddItemGUI aig;
	ItemsListGUI ilg;
	
	public MainGUI(StoreSystem s){
		this.s = s;
		
		aig = new AddItemGUI(s);
		ilg = new ItemsListGUI(s);
		
		frame = new JFrame("Store system");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		tabs.add("Sälj", new JPanel());
		tabs.add("Varor", ilg);
		tabs.add("Lägg till", aig);
		tabs.add("Ta bort", new JPanel());
		
		tabs.addChangeListener(this);
		
		frame.add(tabs);
		frame.setSize(1000, 600);	
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		int index = tabs.getSelectedIndex();
		
		if(index == 1){
			ilg.updateGUI();
		}
		
	}
}
