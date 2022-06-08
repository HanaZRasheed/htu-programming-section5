package lab9.javaExceptions.handleUnchecked;

import javax.swing.JOptionPane;

public class Example3 {
	public static void main(String[] args) {
		String value=JOptionPane.showInputDialog("please enter your age");
		try {
		System.out.println(Integer.parseInt(value));
		}
		catch(NumberFormatException e) {
			System.err.println(e.getMessage()+" the value can't be converted to numeric value");
		}
		finally {
			 System.out.println("the end of try/catch code");
		}
		System.out.println("the end of code");
	}
}
