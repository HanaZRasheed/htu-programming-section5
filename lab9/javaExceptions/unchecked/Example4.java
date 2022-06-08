package lab9.javaExceptions.unchecked;

public class Example4 {

	public static void main(String[] args) {
		 String message= "Hello Everone"; // 13
		 System.out.println(message.length());
         char c = message.charAt(14); // accessing 13th element
         System.out.println(c);
	}

}
