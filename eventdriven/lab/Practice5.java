package eventdriven.lab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Practice5 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("words and charcters counter");
	
		JLabel label1=new JLabel("words : ");
		label1.setBounds(60,25,100,30);
		
		JLabel label2=new JLabel("characters : ");
		label2.setBounds(200,25,100,30);
		
		
		JTextArea area=new JTextArea();
		area.setBounds(20, 75, 350, 200);
		
		JButton btn=new JButton("count words and charcters");
		btn.setBounds(100, 300, 200, 30);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String content=area.getText();
				String [] words=content.split(" ");
				
				/*
				 * for(String word:words) { System.out.println(word); }
				 */
				
				//System.out.println(words.length);
				
				label1.setText("words : "+ words.length);
				
				String contentWithoutSpaces=content.replace(" ", "");
				label2.setText("characters : "+ contentWithoutSpaces.length());
				
				
			}
		});
		
		frame.add(label1);
		frame.add(label2);
		frame.add(area);
		frame.add(btn);
		
		//frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(400,400);
		frame.setVisible(true);

	}

}
