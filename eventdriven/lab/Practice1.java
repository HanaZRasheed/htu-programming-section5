package eventdriven.lab;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class Practice1 {

	public static void main(String[] args) {
	JFrame frame=new JFrame("JButton Demo");
	
	Font font= new Font("Arial", Font.BOLD, 16);
	JButton btn1=new JButton("Button 1");
	btn1.setFont(font);
	btn1.setBackground(Color.DARK_GRAY);
	btn1.setForeground(Color.MAGENTA);
	JButton btn2=new JButton("Button 2");
	btn2.setBackground(Color.DARK_GRAY);
	btn2.setForeground(Color.BLUE);
	btn2.setFont(font);
	JButton btn3=new JButton("Button 3");
	btn3.setBackground(Color.DARK_GRAY);
	btn3.setForeground(Color.GREEN);
	btn3.setFont(font);
	
	frame.add(btn1);
	frame.add(btn2);
	frame.add(btn3);
	
	frame.setSize(500, 500); // pixels
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(new FlowLayout());
	frame.setLocationRelativeTo(null); // in the center of the screen
	frame.setVisible(true);

	}

}
