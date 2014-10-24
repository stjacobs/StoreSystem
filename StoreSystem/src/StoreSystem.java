import java.util.ArrayList;

public class StoreSystem {
	
	public ArrayList<Item> inventory = new ArrayList<Item>();
	
	public StoreSystem()
	{
		new MainGUI(this);
	}
	
	public static void main(String[] args){
		new StoreSystem();
	}
	
}
