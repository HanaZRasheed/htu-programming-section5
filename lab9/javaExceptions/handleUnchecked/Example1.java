package lab9.javaExceptions.handleUnchecked;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter Number 1");
		int num1 = sc.nextInt();
		System.out.println("please enter Number 2");
		int num2 = sc.nextInt();
		try {
			int result = num1 / num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("the end of try/catch code");
		}

		System.out.println("The end of the code");

	}

}
