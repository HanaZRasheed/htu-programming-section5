package lab9.javaExceptions.unchecked;

import java.util.Scanner;

public class Example1 {

	public static void main(String args[]){  
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter Number 1");
		int num1=sc.nextInt();
		System.out.println("please enter Number 2");
		int num2=sc.nextInt();
		
		int result=num1/num2;
		System.out.println(result);
		
		System.out.println("The end of the code");
	
	}  
}
