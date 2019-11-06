package amugeo;


// 기존 자료형 : int, double, char 등등의 형식과 저장할 수 있는 값, 저장 공간 크기가 정해져 있는 것들.
//	- 장점 : 이해하기 쉽다. 사용이 간단하다.
//	- 단점 : 너무 간단해서 정리가 힘들다. 보기가 힘들다.

// 변수 : ex) int a; (자료형) (변수명) a=4;		-> a를 조작? 함수가 필요.

// 그래서 나온 게 클래스와 같은 그룹화 형식의 자료형.
// 클래스의 정의 : 변수들과 메소드들의 집합체, 자료형.
// 멤버 변수 혹은 멤버 함수(==메소드)
// Java는 모든 변수들, 함수들이 클래스에 감싸져 있다. 즉, 글로벌 함수는 존재하지 않고, 메소드들만 존재한다.

// 참조 변수와 일반 변수의 차이:
// 일반 변수의 경우, int, double, char로 선언된다.
// 참조 변수의 경우, class 타입으로 선언된다.


public class Animal {
	private int mSpeed; //동물의 이동 속
	private int mEnergy; // 동물의 에너지 (에너지가 있어야 올바른 이동속도를 낼 수 있습니다.)
	// 참고 : member의 m
	
	//생성자 : 객체를 생성할 때 필요한 특수한 메소드
	//참고 : 메소드란 멤버 함수를 뜻한다.
	Animal(int speed, int energy){
		this.mSpeed = speed;	//this란 현재 클래스의 '참조 변수'
		this.mEnergy = energy;
	}
	
	// input(인자 값) : 움직인 시간.
	// output(반환 값) : 움직인 거리를 반환.
	int move(int second){
		int distance = mSpeed*second; // second 시간동안 움직인 거리 
		return distance;
	}
	
	public void setSpeed(int speed){
		if(speed < 0)
			this.mSpeed = 0;
		this.mSpeed = speed;
	}
	
	
	public void setEnergy(int energy){
		if(energy < 0)
			this.mEnergy = 0;
		this.mEnergy = energy;
	}
	
	public int getSpeed(){
		return this.mSpeed;
	}
}
