import java.util.ArrayList;
import java.util.List;

public class StoreSystem {
	
	public List<Item> inventory = new ArrayList<Item>();
	
	public StoreSystem()
	{
		initiateSystem();
		new MainGUI(this);	
	}
	
	
	private void initiateSystem(){
		for(int i = 0; i < 20; i++){
			String brand = "Prodoktmärke" + i;
			String name = "Produktnamn" + i;
			int balance = (int) (Math.random()*10);
			int price = (int) (Math.random()*20 + 20);
			long barCode = (long) (Math.random()*100000000);
			Item it = new Item(brand, name, balance, price, barCode);
			inventory.add(it);
		}
	}
	
	public static void main(String[] args){
		new StoreSystem();
	}
	
}
