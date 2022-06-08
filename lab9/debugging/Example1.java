package lab9.debugging;

import java.util.Scanner;
// (x+y)*z
public class Example1 {

	public static int addTwoNumber(int num1,int num2) {
		return num1+num2;
	}
	
	private static int multiplyTwoNumber(int num1, int num2) {
		int m=num1*num2;
		return m;
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("please enter the second number");
		int num2=sc.nextInt();
		
		int result= addTwoNumber(num1, num2);
		System.out.println(result);
		System.out.println("please enter another number");
		int num3=sc.nextInt();
		
		result=multiplyTwoNumber(num3, result);	
		System.out.println(result);
		
		

	}
	
}
