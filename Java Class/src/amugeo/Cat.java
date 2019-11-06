package amugeo;

// *** 클래스 이름 반드시 앞에를 대문자로!

// Overload와 Override
// Overload:
// 		a(int arg){}
// 		a(ont arg1, arg2){}
//
// Override:
//		상속 했을 떼,
// 부모  : Animal, 자식 : Cat 이라고 할 때,
// Animal 의 move 를 """재정의""" 해주려 할 때,
//



public class Cat extends Animal {
	int mNail;
	
	Cat(int speed, int energy){
		super(speed, energy);
		mNail = 3;
	}
	
	Cat(int speed, int energy, int nail){
		super(speed, energy);
		this.mNail = nail;
	}
	
	//input(인자 값) : void
	//output(반환 값) : 데미지 
	int scratch(){
		return mNail * 10;
	}
	
	@Override
	int move(int second) {
		int distance = super.move(second) + mNail * second;
		return distance;
	}
	
}
