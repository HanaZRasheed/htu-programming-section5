package lab9.javaExceptions.handleUnchecked;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		String name = null;
		try {

			System.out.println(name.charAt(0));
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.err.println("The string is null");
		}

		catch (StringIndexOutOfBoundsException e) {
			System.err.println("no such index for null string");
		} finally {
			System.out.println("the rest of code");
		}

	}
}
