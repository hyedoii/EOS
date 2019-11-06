package week5;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Input = 1;
		char Select;

		Scanner helper = new Scanner(System.in);
		
		Hero McCree = new AttackType("맥크리");
		Hero Torbjorn = new DefenceType("토르비욘");
		Hero Lucio = new AssaultType("루시우");
		Hero Reinhardt = new SupportType("라인하르트");
		
		Hero[] hero = {McCree, Torbjorn, Lucio, Reinhardt};
		
		System.out.println("훈련장에 오신 것을 환영합니다.");
		
		while(Input != 4){
		
			System.out.println("영웅을 선택해주세요.");
		
			for(int i = 0; i<4 ; i++){
				System.out.println(i+ ". "+ hero[i].name);
			}
			System.out.println("4. 끝내기");
	
			Input = helper.nextInt();
			
			if(Input==4) break;
			
			System.out.println("사용할 스킬을 선택해주세요. (Q/W/E/R)");
			
			Select = helper.next().toLowerCase().charAt(0);
			
			switch(Select){
			case 'q' : 
				hero[Input].Skill1();
				break;
			case 'w' :
				hero[Input].Skill2();
				break;
			case 'e' :
				hero[Input].Skill3();
				break;
			case 'r' :
				hero[Input].Skill4();
				break;
			}
		}
		helper.close();
	}
}
