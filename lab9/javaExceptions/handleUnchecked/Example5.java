package lab9.javaExceptions.handleUnchecked;

public class Example5 {
	public static void main(String[] args) {
		int[] a = new int[5];

		try {
			for (int i = 0; i <= 5; i++) {
				a[i] = i;
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("you are trying to reach an element out of the bound ");
		} finally {
			System.out.println("end of try/ catch statement");
		}

		System.out.println("end of code");
	}
}
