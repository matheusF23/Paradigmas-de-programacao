package com.paradigmas.lab.interfaces;

import java.awt.FlowLayout;
//import java.awt.GridLayout;

//import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OlaSwing {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		/*JButton btn1 = new JButton("Olá tudo bem ?");
		JButton btn2 = new JButton("Até qualquer dia!!");
		//frame.setLayout(new FlowLayout());
		
		frame.setLayout(new GridLayout(2,2));
		
		frame.add(btn1);
		frame.add(btn2);*/
		
		frame.setLayout(new FlowLayout());
		JPanel pn1Email = new JPanel ();
		pn1Email.setLayout(new FlowLayout());
		frame.add(pn1Email);
	
		
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
