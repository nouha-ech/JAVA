package jframe;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame(){
		this.setSize(600,400);
		this.setTitle("hello jframe");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		ImageIcon snoopy= new ImageIcon("snoopy.jpg");
		this.setIconImage(snoopy.getImage());
		this.getContentPane().setBackground(new Color(150,50,100));;
	}

}
