package week3;

public class Practice1 {
			public static int fibonacci(int position){
				int num1=1; int num2=1; int tmp;
				if(position==1||position==2){
					return 1;
				}
				for(int i=0; i<position-2; i++){
					tmp = num2;
					num2 += num1;
					num1 = tmp;
				}
				return num2;
			}
			public static void main(String[] args){
				int result;
				result = fibonacci(6);
				System.out.println(result);
			}
}
