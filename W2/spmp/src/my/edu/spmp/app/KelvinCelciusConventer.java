package my.edu.spmp.app;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KelvinCelciusConventer extends JFrame {

	public KelvinCelciusConventer() {
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		JTextField kelvinJTextField = new JTextField(5);
		JButton calculateJButton = new JButton("Calculate BMI");
		JButton resetJButton = new JButton("Reset All");
		panel.add(kelvinJTextField);
		panel.add(calculateJButton);
		panel.add(resetJButton);
		this.add(panel); 
	    
	    // Basic setup to make the window visible
	    this.setSize(300, 200);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KelvinCelciusConventer frame = new KelvinCelciusConventer();
		frame.setVisible(true);
	}

}
