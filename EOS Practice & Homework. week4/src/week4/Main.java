package week4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		String name;
		int age, sexual;
		PhoneBook Man = null;
		
		System.out.println("학생 정보를 입력합니다.");
		System.out.println("커맨드를 입력하세요.(1-이름 / 2-이름,나이 / 3-이름,나이,성별)");
		
		Scanner helper = new Scanner(System.in);
		
		int getNum = helper.nextInt();
		
		if(getNum==1){
			System.out.println("이름을 입력하세요.");
			name = helper.next();
			
			Man = new PhoneBook(name);
			
			System.out.println("이름 : " + Man.name);
		}
		else if(getNum==2){
			System.out.println("이름을 입력하세요.");
			name = helper.next();
			
			System.out.println("나이를 입력하세요.");
			age = helper.nextInt();
			
			Man = new PhoneBook(name, age);
			
			System.out.println("이름 : " + Man.name);
			System.out.println("나이 : " + Man.age);
			
		}
		else if(getNum==3){
			System.out.println("이름을 입력하세요.");
			name = helper.next();
			
			System.out.println("나이를 입력하세요.");
			age = helper.nextInt();
			
			System.out.println("성별을 입력하세요.(0-남자, 1-여자)");
			sexual = helper.nextInt();
			
			Man = new PhoneBook(name, age, sexual);
			
			System.out.println("이름 : " + Man.name);
			System.out.println("나이 : " + Man.age);
			if(Man.sexual==0){
				System.out.println("성별 : 남자 ");
			}
			else if(Man.sexual==1){
				System.out.println("성별 : 여자 ");
			}
			
		}
		else{
			System.out.println("없는 커멘드입니다.");
		}
		
		
		for(;;) {
			System.out.println("정보를 변경합니다. (0-이름, 1-나이, 2-성별, 3-전체출력, 4-종료)");
		
			int getNum2 = helper.nextInt();
		
			if(getNum2==4)
				break;
			
			if(getNum2==0){//이름변경 
				System.out.println("변경할 이름을 입력하세요.");
				
				String reName = helper.next();
			
				Man.name = reName;
				System.out.println("변경된 이름 : " + Man.name);
				
				}
			else if(getNum2==1){//나이변경 
				System.out.println("변경할 나이를 입력하세요.");
			
				int reAge = helper.nextInt();
			
				Man.age = reAge;
			
			System.out.println("변경된 나이 : " + Man.age);			 
			}
			else if(getNum2==2){//성별 변경 
				System.out.println("변경할 성별을 입력하세요. (0-남자, 1-여자)");
			
				int reSexual = helper.nextInt();
			
				Man.sexual = reSexual;
			
				if(Man.sexual==0){
					System.out.println("변경된 성별 : 남자 ");
				}
				else if(Man.sexual==1){
					System.out.println("변경된 성별 : 여자 ");
				}
			
			}
			else if(getNum2==3){//전체출력
				System.out.println("이름 : " + Man.name);
				System.out.println("나이 : " + Man.age);
				if(Man.sexual==0){
					System.out.println("성별 : 남자 " );
				
				}
				else if(Man.sexual==1){
					System.out.println("성별 : 여자 ");
				}
			}
		}
		helper.close();
	}
}

