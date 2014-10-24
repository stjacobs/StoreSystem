import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class AddItemGUI implements ActionListener{
	
	JFrame frame;
	JTextField nameField;
	JTextField balanceField;
	JTextField priceField;
	JTextField barCodeField;
	JPanel namePanel;
	JPanel balancePanel;
	JPanel pricePanel;
	JPanel barCodePanel;
	
	JPanel leftPanel;
	JPanel rightPanel;
	JPanel inputPanel;
	JPanel buttonPanel;
	JPanel mainPanel;
	
	
	JButton okButton;
	JButton doneButton;
	JButton cancelButton;
	
	StoreSystem s;
	
	public AddItemGUI(StoreSystem s){
		this.s = s;
		
		frame = new JFrame("Lägg till vara");
		nameField = new JTextField(20);
		balanceField = new JTextField(20);
		priceField = new JTextField(20);
		barCodeField = new JTextField(20);
		
		
		JLabel nameLabel = new JLabel("Namn: ");
		JLabel balanceLabel = new JLabel("Antal: ");
		JLabel priceLabel = new JLabel("Pris: ");
		JLabel barCodeLabel = new JLabel("Streckkod: ");
		
		okButton = new JButton("Lägg till");
		doneButton = new JButton("Klar");
		cancelButton = new JButton("Avbryt");
	
		okButton.addActionListener(this);
		doneButton.addActionListener(this);
		cancelButton.addActionListener(this);
		
		namePanel = new JPanel();
		balancePanel  = new JPanel();
		pricePanel = new JPanel();
		barCodePanel = new JPanel();
		
		leftPanel = new JPanel(new GridLayout(4,1));
		rightPanel = new JPanel(new GridLayout(4,1));
		inputPanel = new JPanel(new GridLayout(1,2));
		buttonPanel = new JPanel(new GridBagLayout());
		mainPanel = new JPanel(new GridLayout(2, 1));
		
		leftPanel.add(nameLabel);
		rightPanel.add(nameField);
		leftPanel.add(balanceLabel);
		rightPanel.add(balanceField);
		leftPanel.add(priceLabel);
		rightPanel.add(priceField);
		leftPanel.add(barCodeLabel);
		rightPanel.add(barCodeField);
		
		inputPanel.add(leftPanel);
		inputPanel.add(rightPanel);
		
		buttonPanel.add(okButton);
		buttonPanel.add(cancelButton);
		buttonPanel.add(doneButton);
		
		mainPanel.add(inputPanel);
		mainPanel.add(buttonPanel);
		
		frame.add(mainPanel);
		
		frame.setSize(400, 200);
		
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		if(btn.equals(okButton)){
			String name = nameField.getText();
			int balance = Integer.parseInt(balanceField.getText());
			int price = Integer.parseInt(priceField.getText());
			int barCode = Integer.parseInt(barCodeField.getText());
			
			s.inventory.add(new Item(name, price, balance, barCode));
		}
		
		else if(btn.equals(cancelButton)){
			System.out.println("cancel");
		}

		else if(btn.equals(doneButton)){
			for(int i = 0; i < s.inventory.size(); i++)
				System.out.println(s.inventory.get(i));
			
			frame.setVisible(false);
		}
		
	}
	
}
