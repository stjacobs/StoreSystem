import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class AddItemGUI extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	JTextField nameField;
	JTextField balanceField;
	JTextField priceField;
	JTextField barCodeField;
	JPanel namePanel;
	JPanel balancePanel;
	JPanel pricePanel;
	JPanel barCodePanel;
	JPanel mainPanel;
	
	JPanel leftPanel;
	JPanel rightPanel;
	JPanel inputPanel;
	JPanel buttonPanel;
	
	
	JButton okButton;

	JButton cancelButton;
	
	StoreSystem s;
	
	public AddItemGUI(StoreSystem s){
		this.s = s;
		this.setLayout(new GridBagLayout());
		nameField = new JTextField(20);
		balanceField = new JTextField(20);
		priceField = new JTextField(20);
		barCodeField = new JTextField(20);
		
		
		JLabel nameLabel = new JLabel("Namn: ");
		JLabel balanceLabel = new JLabel("Antal: ");
		JLabel priceLabel = new JLabel("Pris: ");
		JLabel barCodeLabel = new JLabel("Streckkod: ");
		
		okButton = new JButton("Lägg till");
		cancelButton = new JButton("Avbryt");
	
		okButton.addActionListener(this);
		cancelButton.addActionListener(this);
		
		namePanel = new JPanel();
		balancePanel  = new JPanel();
		pricePanel = new JPanel();
		barCodePanel = new JPanel();
		
		leftPanel = new JPanel(new GridLayout(4,1));
		rightPanel = new JPanel(new GridLayout(4,1));
		inputPanel = new JPanel(new GridLayout(1,2));
		buttonPanel = new JPanel(new GridBagLayout());
		mainPanel = new JPanel(new GridLayout(2,1));
		
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
		
		mainPanel.add(inputPanel);
		mainPanel.add(buttonPanel);
		
		this.add(mainPanel);
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		if(btn.equals(okButton)){
			String name = nameField.getText();
			int balance = Integer.parseInt(balanceField.getText());
			int price = Integer.parseInt(priceField.getText());
			long barCode = Long.parseLong(barCodeField.getText());
			
			Item i = new Item(name, price, balance, barCode);
			
			s.inventory.add(i);
			ItemsListGUI.dlm.addElement(i);
			
			nameField.setText("");
			balanceField.setText("");
			priceField.setText("");
			barCodeField.setText("");			
		}
		
		else if(btn.equals(cancelButton)){
			nameField.setText("");
			balanceField.setText("");
			priceField.setText("");
			barCodeField.setText("");			
		}
	}
}
