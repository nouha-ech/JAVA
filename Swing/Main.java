package jframe;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main {

	public static void main(String[] args) {
		JLabel label = new JLabel();
		
		
		label.setText("hello swing");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.white);
		MyFrame myframe = new MyFrame();
		myframe.add(label);
		ImageIcon snoopy= new ImageIcon("snoopy.jpg");
		label.setIcon(snoopy);

	}

}
