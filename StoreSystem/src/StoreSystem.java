import java.util.ArrayList;
import java.util.List;

public class StoreSystem {
	
	public List<Item> inventory = new ArrayList<Item>();
	
	public StoreSystem()
	{
		new MainGUI(this);
	}
	
	public static void main(String[] args){
		new StoreSystem();
	}
	
}
