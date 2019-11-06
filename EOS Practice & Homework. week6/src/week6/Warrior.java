package week6;

public class Warrior extends Character {

	Warrior(String name, int stat) {
		super(name, stat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("평타 공격 - " + this.stat + "damage");
	}

	@Override
	public void passive() {
		// TODO Auto-generated method stub
		System.out.println("파워 업!");
		this.stat *= 2;
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		this.stat = stat * 2;
		System.out.println("파워 스트라이크! - " + stat + "damage");
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		System.out.println("방어 성공!");
	}

}
