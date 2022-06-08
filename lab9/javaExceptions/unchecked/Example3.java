package lab9.javaExceptions.unchecked;

import javax.swing.JOptionPane;

public class Example3 {
	public static void main(String[] args) {
		String value = JOptionPane.showInputDialog("please enter your age");
		System.out.println(Integer.parseInt(value));
		System.out.println("code completion");
	}
}
