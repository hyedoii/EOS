package vendingMachines;

public class VendorTest {

	public static void main(String[] args) {

		CoffeeMachine v1 = new CoffeeMachine("CoffMac0011",0);
		SodaMachine v2 = new SodaMachine("SodaMac0011",70);
		VendingMachine v3 = new VendingMachine("CoffMac0011",0,1170.0){	
			@Override
			public double dispense(double money) throws Exception {
				System.out.println("$"+String.format("%.2f", money)+", Purchasing a cup of coffee from \n"+name);
				if(numItems < 1)
					throw new Exception("No coffee is available...");
				if(money < 2)
					throw new Exception("Not enough money was inserted...");
				numItems--;
				this.money+=2;
				System.out.println("Change Returned:" + (money-2));
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
		};
		VendingMachine v4 = new VendingMachine("SodaMac0011",70,100){
			@Override
			double dispense(double money) throws Exception {
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
			@Override
			double restock() {
				numItems = 200;
				double tmp = money;
				this.money= 100;
				if(tmp > 950.00)
					tmp = tmp - 100;
				return tmp;
			}			
		};
		v1.setMoney(1170.0);
		
		System.out.println(v3.toString());
		System.out.println(v4.toString());
		
		try{ 
			v3.dispense(5);
		}
		catch(Exception e){
			System.out.println(e.getMessage());;
		}
		
		System.out.println();
		System.out.println("Restocking");
		System.out.println(v3.name);
		System.out.println("Money removed : " + v3.restock());
		System.out.println();
		
		try{
			v2.dispense(2,4);
			/* VendingMachine class에는 dispense(int numItems, double money){}가 없기 때문에 오류가 발생한다.*/
		}
		catch(Exception e){
			System.out.println(e.getMessage());;
		}
		System.out.println();
		
		System.out.println(v3.toString());
		System.out.println(v4.toString());

	}

}
