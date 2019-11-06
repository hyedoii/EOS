package vendingMachines;

public class SodaMachine extends VendingMachine{

	public SodaMachine(String name, int numItems) {
		this.name = name;
		this.numItems = numItems;
		this.money = 100.0;
	}
	
	@Override
	public String toString(){
		return "Soda Machine Name : "+name+"\nItems in stock : "+numItems+"\nCash avail : $"+String.format("%.1f", money)+"\n";
	}

	
	@Override
	public double dispense(double money) throws Exception {
		System.out.println("$"+String.format("%.2f", money) + ", Purchasing a soda from \n"+name);
		if(numItems < 1)
			throw new Exception("No soda is available...");
		if(money < 1.50)
			throw new Exception("Not enough money was inserted...");
		numItems--;
		this.money += 1.50;
		System.out.println("Change Returned:" + (money - 1.50));
		return money - 1.50;
	}
	
	public double dispense(int numItems, double money) throws Exception {
		System.out.println("$"+String.format("%.2f", money) + ", Purchasing a soda from \n"+name);
		if(this.numItems < numItems)
			throw new Exception("There is not enough soda in the machine..."); 
		if(this.numItems < 1)
			throw new Exception("No soda is available...");
		if(money < 1.50*numItems)
			throw new Exception("Not enough money was inserted...");
		this.numItems -= numItems;
		this.money += 1.50*numItems;
		System.out.println("Change Returned:" + (money - 1.50*numItems));
		return money - 1.50*numItems;
	}

	@Override
	public double restock() {
		numItems = 200;
		double tmp = money;
		this.money= 100;
		if(tmp > 950.00)
			tmp = tmp - 100;
		return tmp;
	}
}
