package week3;
import java.util.Scanner;
public class Quiz1 {
	public static void func(int a, int b){
		int i=0;
		
		for(i=b;i>0;i--){
			if(a % i == 0 && b % i == 0){
				System.out.println("최대공약수 : " + i);
				System.out.println("최소공배수 : " + a*b/i);
                
				
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner helper = new Scanner(System.in);
		
		int getNum1;
		int getNum2;
		
		getNum1 = helper.nextInt();
		getNum2 = helper.nextInt();
		
		
		if(getNum1 >= getNum2){
			func(getNum1,getNum2);
		}
		else{
			func(getNum2,getNum1);
		}
		helper.close();

	}

}
