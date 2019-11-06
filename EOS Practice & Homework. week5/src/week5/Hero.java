package week5;

abstract class Hero{
	public String name;
	
	Hero(String name){
		this.name = name;
	}
	
	public abstract void Skill1();
	public abstract void Skill2();
	public abstract void Skill3();
	public abstract void Skill4();
}

class AttackType extends Hero {
	
	AttackType(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Skill1() {
		// TODO Auto-generated method stub
		System.out.println("석양이...진다...");
	}

	@Override
	public void Skill2() {
		// TODO Auto-generated method stub
		System.out.println("앞으로 나오시지.");
	}

	@Override
	public void Skill3() {
		// TODO Auto-generated method stub
		System.out.println("정의는 저절로 실현되지 않아.");
	}

	@Override
	public void Skill4() {
		// TODO Auto-generated method stub
		System.out.println("내 이름은 맥크리.");
	}

}

class DefenceType extends Hero {

	DefenceType(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Skill1() {
		// TODO Auto-generated method stub
		System.out.println("넌 대단한 일을 해낼거란다.");	
	}

	@Override
	public void Skill2() {
		// TODO Auto-generated method stub
		System.out.println("와서 방어구 챙겨.");
	}

	@Override
	public void Skill3() {
		// TODO Auto-generated method stub
		System.out.println("초고열 용광로!");
	}

	@Override
	public void Skill4() {
		// TODO Auto-generated method stub
		System.out.println("많을수록 좋지!");
	}

}

class AssaultType extends Hero {
	
	AssaultType(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Skill1() {
		// TODO Auto-generated method stub
		System.out.println("오우, 제대로 놀아보자!!");
	}

	@Override
	public void Skill2() {
		// TODO Auto-generated method stub
		System.out.println("비트에 몸을 맡겨라!");
	}

	@Override
	public void Skill3() {
		// TODO Auto-generated method stub
		System.out.println("힘내, 우린 할 수 있어!");
	}

	@Override
	public void Skill4() {
		// TODO Auto-generated method stub
		System.out.println("루시우가 여러분을 찾아갑니다!");
	}

}

class SupportType extends Hero {
	
	SupportType(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Skill1() {
		// TODO Auto-generated method stub
		System.out.println("망치 나가신다!!");
	}

	@Override
	public void Skill2() {
		// TODO Auto-generated method stub
		System.out.println("라인하르트 빌헬름");
	}

	@Override
	public void Skill3() {
		// TODO Auto-generated method stub
		System.out.println("정의의 이름으로.");
	}

	@Override
	public void Skill4() {
		// TODO Auto-generated method stub
		System.out.println("라인하르트! 대령했소이다.");
	}

}