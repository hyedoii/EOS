package vendingMachines;

public class CoffeeMachine extends VendingMachine {

	public CoffeeMachine(String name, int numItems) {
		this.name = name;
		this.numItems = numItems;
		this.money = 100.0;
	}
	
	@Override
	public String toString() {
			return "Coffee Machine Name : "+name+"\nItems in stock : "+numItems+"\nCash avail : $"+String.format("%.1f", money)+"\n";
		}

	
	@Override
	public double dispense(double money) throws Exception {
		System.out.println("$"+String.format("%.2f", money)+", Purchasing a cup of coffee from \n"+name);
		if(numItems < 1)
			throw new Exception("No coffee is available...");
		if(money < 2)
			throw new Exception("Not enough money was inserted...");
		numItems--;
		this.money+=2;
		System.out.println("Change Returned:" +(money-2));
		return money - 2;
	}

	@Override
	public double restock() {
		numItems = 150;
		double tmp = money;
		this.money= 100;
		if(tmp >1000)
			tmp = tmp - 100;
		return tmp;
	}
}
