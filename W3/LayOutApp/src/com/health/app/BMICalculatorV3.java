package com.health.app;
import java.awt.*;
import javax.swing.*;
public class BMICalculatorV3 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("BMI Calculator 2.2 - BorderLayout");
		frame.setLayout(new BorderLayout());

		JPanel inputJPanel = new JPanel(new GridLayout(2,2));
			
		JLabel weightLabel = new JLabel("Weight (kg)");
		inputJPanel.add(weightLabel);

		JTextField weightBox = new JTextField(10);
		inputJPanel.add(weightBox);

		JLabel heightLabel = new JLabel("Height (m)");
		inputJPanel.add(heightLabel);

		JTextField heightBox = new JTextField(10);
		inputJPanel.add(heightBox);
		
		frame.add(inputJPanel,BorderLayout.NORTH);

		JButton button = new JButton("Calculate");
		frame.add(button,BorderLayout.CENTER);

		JPanel resultJPanel = new JPanel(new GridLayout(1,2));

		JLabel resultLabel = new JLabel("Your BMI Result: ");
		resultJPanel.add(resultLabel);

				
		JTextField resultBox = new JTextField(10);
		resultJPanel.add(resultBox);


		frame.add(resultJPanel,BorderLayout.SOUTH);
		
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
