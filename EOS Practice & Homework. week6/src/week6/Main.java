package week6;
import java.util.Scanner;

public class Main {
	
	public static void List(){
		String[] List = {"공격", "패시브 발동","스킬 사용", "방어", "그만하기"};
		for(int i = 1; i < 6; i++){
			System.out.println(i + ". "+ List[i-1]);
		}
	}
	
	public static void main(String[] args) {
		Scanner helper = new Scanner(System.in);
		
		String nameInput;
		int statInput;
		int commendInput = 0;
		int select;
		
		System.out.println("========캐릭터만들기========");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
			
		select = helper.nextInt();
			
		System.out.println("캐릭터 이름을 입력해주세요.");
			
		nameInput = helper.next();
			
		System.out.println("스탯을 입력해주세요. (1~100)");
			
		statInput = helper.nextInt();
		
		Character Hero = null;
		switch(select){
		case 1 :
			Hero = new Warrior(nameInput, statInput);
			break;
		case 2 :
			Hero = new Magician(nameInput, statInput);
			break;
				
		}
		
		while(commendInput != 5){
			
			System.out.println("커맨드를 입력해주세요.");
			List();
			
			commendInput = helper.nextInt();
			
			switch(commendInput){
			case 1 :
				Hero.attack();
				if(select ==2){
					Hero.stat = statInput;
				}
				break;
			case 2 :
				Hero.passive();
				break;
			case 3 :
				Hero.skill();
				if(select ==2){
					Hero.stat = statInput;
				}
				break;
			case 4 :
				Hero.defence();
				break;
			}			
		}
		
		helper.close();
	}

}
