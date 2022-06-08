package lab9.debugging;

import java.util.Scanner;

public class After {

	public static void main(String[] args) {
		Scanner keyBoard = new Scanner(System.in);
		// alt+ shift +R

		System.out.println("Shape Area Calculator");

		while (true) {

			System.out.println();
			System.out.println("-=-=-=-=-=-=-=-=-=-");
			System.out.println();
			System.out.println("1) Triangle");
			System.out.println("2) Rectangle");
			System.out.println("3) Circle");
			System.out.println("4) Quit");
			System.out.println();

			System.out.print("Which shape: ");

			int shape = keyBoard.nextInt();
			System.out.println();

			if (shape == 1) {
				area_triangle();
			} else if (shape == 2) {
				area_rectangle();
			} else if (shape == 3) {
				area_circle();
			} else if (shape == 4) {
				quit();
				break;
			}
			
		}
		

	}

	public static double area_triangle() {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Base: ");
		double base = keyboard.nextDouble();

		System.out.print("Height: ");
		double height = keyboard.nextDouble();

		System.out.println();

		
		double A = (base/2) * height;
		

		System.out.println("The area is " + A + ".");
		keyboard.close();
		return A;

	}

	public static double area_rectangle() {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Length: ");
		double length = keyboard.nextDouble();

		System.out.print("Width: ");
		double width = keyboard.nextDouble();

		System.out.println();

		double A = length * width;

		System.out.println("The area is " + A + ".");
		keyboard.close();
		return A;
	}

	public static double area_circle() {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Radius: ");
		double radius = keyboard.nextDouble();

		System.out.println();

		double A = Math.PI * Math.pow(radius, 2);
		System.out.println(Math.PI);
		//radius * radius;

		System.out.println("The area is " + A + ".");
		keyboard.close();
		return A;

	}

	public static void quit() {

		System.out.println("GoodBye");
		

	}

}
