package eventdriven.lab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Practice4 {

	public static void main(String[] args) {
	JFrame frame=new JFrame();
	frame.setSize(300,400);
	
	JLabel lbl1=new JLabel("number 1");
	lbl1.setBounds(50, 30, 150, 20);
	
	JTextField txtField1=new JTextField();
	txtField1.setBounds(50,50,150,20);
	
	
	JLabel lbl2=new JLabel("number 2");
	lbl2.setBounds(50, 80, 150, 20);
	
	JTextField txtField2=new JTextField();
	txtField2.setBounds(50,100,150,20);
	
	
	JLabel lbl3=new JLabel("Result");
	lbl3.setBounds(50,130,150,20);
	
	JTextField txtField3=new JTextField();
	txtField3.setBounds(50,150,150,20);
	txtField3.setEditable(false);
	
	JButton addBtn=new JButton("+");
	addBtn.setBounds(50, 200, 50, 50);
	addBtn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String s1=txtField1.getText();
			String s2=txtField2.getText();
			
			int number1=0;
			int number2=0;
			int result=0;
			if(!s1.equals("")&&!s2.equals("")) {
			 number1=Integer.parseInt(s1);
			 number2=Integer.parseInt(s2);
			System.out.println(number1+number2);
			}
			result=number1+number2;
			
			// 	txtField3.setText(result+"");
			txtField3.setText(String.valueOf(result));
			
		}
	});
	JButton subBtn=new JButton("-");
	subBtn.setBounds(120, 200, 50, 50);
	
	frame.add(lbl1);
	frame.add(txtField1);
	frame.add(lbl2);
	frame.add(txtField2);
	frame.add(lbl3);
	frame.add(txtField3);
	frame.add(addBtn);
	frame.add(subBtn);
	
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	frame.setVisible(true);

	}

}
