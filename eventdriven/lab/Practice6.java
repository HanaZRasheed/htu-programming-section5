package eventdriven.lab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Practice6 {

	public static void main(String[] args) {
		JFrame frame=new JFrame(" Fruits game");
		
		String [] message= {"Apple", "Banana","Orange"}; // 3 items 
		
		Random ran=new Random();
		
		JLabel label=new JLabel(message[ran.nextInt(3)]); // 0 1 2 
		Icon icon=new ImageIcon("C:\\Users\\hz-95\\eclipse-workspace-2\\programming5\\src\\eventdriven\\lab\\apple.png");
		JButton button1=new JButton(icon);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			if(label.getText().equalsIgnoreCase("Apple")) {
				JOptionPane.showMessageDialog(null, "Bravoo!!!!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Try again :( ");
			}
				
			}
		});
		
		Icon icon2=new ImageIcon("C:\\Users\\hz-95\\eclipse-workspace-2\\programming5\\src\\eventdriven\\lab\\Banana.png");
		JButton button2=new JButton(icon2);
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(label.getText().equalsIgnoreCase("Banana")) {
					JOptionPane.showMessageDialog(null, "Bravoo!!!!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Try again :( ");
				}
				
			}
		});
		
		Icon icon3=new ImageIcon("C:\\Users\\hz-95\\eclipse-workspace-2\\programming5\\src\\eventdriven\\lab\\Orange.png");
		JButton button3=new JButton(icon3);
		
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(label.getText().equalsIgnoreCase("Orange")) {
					JOptionPane.showMessageDialog(null, "Bravoo!!!!");
				}
				else {
					JOptionPane.showMessageDialog(null, "Try again :( ");
				}
				
			}
		});
		
		JButton button4=new JButton("Play again");
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText(message[ran.nextInt(3)]);
			}
		});
		label.setBounds(30,50,100,50);
		button1.setBounds(80,35,icon.getIconWidth(),icon.getIconHeight());
		
		
		button2.setBounds(200,35,icon2.getIconWidth(),icon2.getIconHeight());
		button3.setBounds(330,35,icon3.getIconWidth(),icon3.getIconHeight());
		button4.setBounds(450,50,100,50);
		frame.add(label);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.setSize(600,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
