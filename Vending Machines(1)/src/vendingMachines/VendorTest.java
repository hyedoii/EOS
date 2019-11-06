package vendingMachines;

public class VendorTest {

	public static void main(String[] args) {

		CoffeeMachine v1 = new CoffeeMachine("CoffMac0011",0);
		SodaMachine v2 = new SodaMachine("SodaMac0011",70);
		v1.setMoney(1170.0);
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		
		try{ 
			v1.dispense(5);
		}
		catch(Exception e){
			System.out.println(e.getMessage());;
		}
		
		System.out.println();
		System.out.println("Restocking");
		System.out.println(v1.name);
		System.out.println("Money removed : " + v1.restock());
		System.out.println();
		
		try{
			v2.dispense(2,4);
		}
		catch(Exception e){
			System.out.println(e.getMessage());;
		}
		System.out.println();
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());

	}

}
