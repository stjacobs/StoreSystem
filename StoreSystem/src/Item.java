
public class Item {
	
	int barCode;
	int price;
	int balance;
	String name;
	
	public Item(String name, int price, int balance, int barCode){
		this.barCode = barCode;
		this.price = price;
		this.balance = balance;
		this.name = name;
	}
	
	public int getBalance(){
		return balance;
	}

	public void removeBalance(int n){
		balance = balance - n;
	}
	
	public String toString(){
		return name + " " + price + " " + balance + " " + barCode;
	}
}
