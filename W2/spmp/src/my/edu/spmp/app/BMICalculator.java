package my.edu.spmp.app;

import java.awt.FlowLayout;
import java.lang.foreign.AddressLayout;

import javax.swing.*;

public class BMICalculator  {

	public static JFrame createBMIFrame() {
	JFrame frame = new JFrame();
		
		JTextField heightJTextField = new JTextField(5);
		JTextField ageJTextField = new JTextField(5);
		JTextField weightJTextField = new JTextField(5);
		
		JLabel heightJLabel = new JLabel("Height (m)");
		JLabel ageJLabel = new JLabel("Age");
		JLabel weightJLabel = new JLabel("Weight (kg)");
		
		JButton calculateJButton = new JButton("Calculate BMI");
		JButton resetJButton = new JButton("Reset All");
		
		frame.setSize(350, 200);
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));
		
		panel.add(ageJLabel);
		panel.add(ageJTextField);
		panel.add(heightJLabel);
		panel.add(heightJTextField);
		panel.add(weightJLabel);
		panel.add(weightJTextField);
		panel.add(calculateJButton);
		panel.add(resetJButton);
		frame.add(panel);
		return frame;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JFrame frame = createBMIFrame();
	frame.setVisible(true);
	}
	

}
