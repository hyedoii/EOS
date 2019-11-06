package Practice;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("숫자를 입력하세요.");
		
		Scanner helper = new Scanner(System.in);
		
		int getNum;
		getNum = helper.nextInt();
		
		System.out.println("메뉴 번호를 입력하세요.(1~5)");
		
		int getNum2;
		getNum2 = helper.nextInt();
		
		helper.close();
		
		if(getNum2==1){
			for(int a=1; a<=getNum; a++){
				for(int b=0; b<a; b++){
					System.out.print("*");
				}
				System.out.println("");
			}
			return;
		
		}else if(getNum2==2){
			for(int a=0; a<=getNum; a++){
				for(int b=getNum; b>a; b--){
					System.out.print("*");
				}
				System.out.println("");
			}
			return;
		
		}else if(getNum2==3){
			for(int a=1; a<=getNum; a++){
				for(int b=0; b<a; b++){
					System.out.print("*");
				}
				System.out.println("");
			}
			for(int a=1; a<=getNum; a++){
				for(int b=getNum; b>a; b--){
					System.out.print("*");
				}
				System.out.println("");
			}
			return;
		
		}else if(getNum2==4){
			for(int a=0; a<getNum; a++){
				int b;
				for(b=4-a; b>0; b--){
					System.out.print(" ");
				}
				for(int c=0; c<2*a+1; c++){
					System.out.print("*");
				}
				System.out.println();
			}
			for(int a=0; a<getNum; a++){
				for(int b=4-a; b<getNum; b++){
					System.out.print(" ");
				}
				for(int c=a+2; c<2*getNum-a-1; c++){
					System.out.print("*");
				}
				System.out.println();
			}
			return;
			
		}else{
			System.out.println("실행할 수 없습니다.");
		}

	}

}
