package eventdriven.lab;

import javax.swing.JOptionPane;

public class Practice2 {

	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("What is your name ?");
		System.out.println(name);
		
		String age=JOptionPane.showInputDialog("What is your age ?");
		int ageValue=Integer.parseInt(age);
		int yearOfBirth=2022-ageValue;
		System.out.println("You were born in "+ yearOfBirth);
		
		JOptionPane.showMessageDialog(null, "You were born in "+ yearOfBirth);

	}

}
