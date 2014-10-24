import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MainGUI implements ActionListener{
	
	JFrame frame;
	JPanel panel = new JPanel(new GridLayout(2,1));
	JButton b = new JButton("OK");
	StoreSystem s;
	
	public MainGUI(StoreSystem s){
		this.s = s;
		frame = new JFrame("Store system");
		frame.setSize(1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		b.addActionListener(this);
		panel.add(b);
		frame.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae) {
		new AddItemGUI(s);
	}
}
