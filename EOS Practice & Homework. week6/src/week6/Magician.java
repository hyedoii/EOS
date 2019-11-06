package week6;

public class Magician extends Character{

	Magician(String name, int stat) {
		super(name, stat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("평타 공격 - " + stat + "damage");
	}

	@Override
	public void passive() {
		// TODO Auto-generated method stub
		System.out.println("마력 업!");
		stat = stat * 3;
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		this.stat = stat * 3;
		System.out.println("파이어 볼!- " + stat + "damage");
		
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		System.out.println("회피 성공!");
	}

}
