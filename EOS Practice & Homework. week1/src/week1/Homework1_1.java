package week1;

import java.util.Scanner;

public class Homework1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("숫자를 입력하세요.");
		
		Scanner helper=new Scanner(System.in);
		
		int getNum;
		
		getNum=helper.nextInt();
		
		if(getNum==0){
			System.out.println("777");
		}else if(getNum>0){
			System.out.println(getNum*getNum);
		}else{
			System.out.println((-1)*getNum*getNum);
		}
		helper.close();
		return;
		
		

	}

}
