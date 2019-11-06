package week1;

import java.util.Scanner;

public class Homework1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("연도를 입력하세요.");
		
		Scanner helper = new Scanner(System.in);
		
		int getNum;
		
		getNum=helper.nextInt();
		
		if(getNum %400==0){
			System.out.println(getNum+"년은 윤년입니다.");
		}else if (getNum%100==0){
			System.out.println(getNum+"년은 윤년이 아닙니다.");
		}else if(getNum%4==0){
			System.out.println(getNum+"년은 윤년입니다.");
		}else{
			System.out.println(getNum+"년은 윤년이 아닙니다.");
		}
		helper.close();
		return;

	}

}
