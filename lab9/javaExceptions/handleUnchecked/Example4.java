package lab9.javaExceptions.handleUnchecked;

public class Example4 {

	public static void main(String[] args) {
		 String message= "Hello Everone"; // 13
		 try { 
         char c = message.charAt(13);
         // accessing 13th element
         System.out.println(c);
		 }
		 catch(StringIndexOutOfBoundsException e) {
			 System.err.println(e);
		 }
		 finally {
			 System.out.println("the end of try/catch code");
		 }
		 System.out.println("the rest of code");
        

	}

}
