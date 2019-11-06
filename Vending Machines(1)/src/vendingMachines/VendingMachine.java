package vendingMachines;

public abstract class VendingMachine {

		String name;
		int numItems;
		double money;
		
		//constructor
		VendingMachine(){
			
		}
		
		VendingMachine(String name, int numItems, double money) {
			this.name = name;
			this.numItems = numItems;
			this.money= money;
		}
		
		//accessor
		String getName() {
			return name;
		}
		int getNumItems(){
			return numItems;
		}
		double getMoney(){
			return money;	
		}
		
		//mutator
		void setNumItems(int numItems){
			this.numItems = numItems;
		}
		void setMoney(double money){
			this.money = money;
		}
		
		//method
		public String toString(){
			return "Coffee Machine Name : "+name+"\nItems in stock : "+numItems+"\nCash avail : $"+String.format("%.1f", money)+"\n";
		}

		abstract double dispense(double money) throws Exception;
		abstract double restock();
}
