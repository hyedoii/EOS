package amugeo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal sihwan = new Animal(1, 1);
		Animal youngwoo = new Animal(0, 0);
		
		sihwan.setSpeed(11);
		
		System.out.println(sihwan.move(11));
		
		Cat wonkyu = new Cat(0, 1);
		wonkyu.setSpeed(11);
		System.out.println(wonkyu.move(11));
	}

}
