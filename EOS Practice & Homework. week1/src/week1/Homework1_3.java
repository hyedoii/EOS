package week1;

import java.util.Scanner;

public class Homework1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("첫번째 숫자를 입력하세요.");
		
		Scanner helper = new Scanner(System.in);
		
		double getNum1;
		getNum1 = helper.nextDouble();
		
		System.out.println("두번째 숫자를 입력하세요.");
		
		double getNum2;
		getNum2 = helper.nextDouble();
		
		System.out.println("커맨드를 입력하세요.");
		
		double getNum3;
		getNum3 = helper.nextDouble();
		
		helper.close();
		
		if(getNum2==0){
			System.out.println("0으로는 나눌 수 없습니다.");
			return ;
		}
		if(getNum3==0){
			System.out.print(getNum1+getNum2);
		}else if(getNum3==1){
			System.out.println(getNum1-getNum2);
		}else if(getNum3==2){
			System.out.println(getNum1*getNum2);
		}else if(getNum3==3){
			System.out.println(getNum1/getNum2);
		}else{
			System.out.println("없는 커맨드입니다. 종료합니다.");
		}
		return ;

	}

}
