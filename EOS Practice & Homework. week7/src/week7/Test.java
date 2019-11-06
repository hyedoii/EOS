package week7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
    	try{
    		
	        PrintWriter output = new PrintWriter(new FileOutputStream("test.txt"));
	        String data = "박혜정";
	        output.println(data);
	        output.close();
	        
    		Scanner scanner = new Scanner(new FileInputStream("test.txt"));
	        String tmp = scanner.next();
	        System.out.println(tmp);
	        
    	}
    	catch(Exception e){
    		
    	}
    }
}