package week3;
import java.util.Scanner;
public class Quiz2 {
	
	private static Scanner helper;

	public static int findNum(int position){
		int i=2;
		int j=2;
		int count=0;
		int primeCount=0;
		
		for(i=2; i>0; i++){
			count = 0;
			for(j=2; j<i; j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==0){
				primeCount++;
				if(primeCount==position){
					break;
				}
			}
		}
		return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요.");
		
		helper = new Scanner(System.in);
		
		int getNum;
		getNum = helper.nextInt();
		
		System.out.print(getNum);
		System.out.print("번째 소수는 ");
		System.out.print(findNum(getNum));
		System.out.println("입니다.");
		
	}

}
