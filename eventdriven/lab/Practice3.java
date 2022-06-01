package eventdriven.lab;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Practice3 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Login");
		frame.setSize(300,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		// Components 
		JLabel userLabel=new JLabel("username");
		JTextField usernameField=new JTextField(20);
		
		JLabel pswLabel=new JLabel("password");
		JPasswordField passwordField=new JPasswordField(20);
		
		JButton btn=new JButton("login");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username=usernameField.getText();
				String password=new String(passwordField.getPassword());
				System.out.println(username);
				System.out.println(password);
				
				if(username.equalsIgnoreCase("admin")&& password.equals("123")) {
					JOptionPane.showMessageDialog(null, "You're welcome");
				}else {
					JOptionPane.showMessageDialog(null, "Invalid input");
				}
				
			}
		});
		
		
		
		frame.add(userLabel);
		frame.add(usernameField);
		frame.add(pswLabel);
		frame.add(passwordField);
		frame.add(btn);
		
		frame.setVisible(true);

	}

}
