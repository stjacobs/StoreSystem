
public class Item {
	
	long barCode;
	int price;
	int balance;
	String name;
	String brand;
	
	public Item(String brand, String name, int price, int balance, long barCode){
		this.barCode = barCode;
		this.price = price;
		this.balance = balance;
		this.name = name;
		this.brand = brand;
	}
	
	public int getBalance(){
		return balance;
	}

	public void removeBalance(int n){
		balance = balance - n;
	}
	
	public Object[] toObject(){
		Object[] o = {brand, name, price, balance, barCode};
		return o;
	}
	
	public String toString(){
		return brand + " " +  name + " " + price + " " + balance + " " + barCode;
	}
}
