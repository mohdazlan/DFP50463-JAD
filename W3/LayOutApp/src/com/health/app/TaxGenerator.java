package com.health.app;

import javax.swing.*;
import java.awt.*;

public class TaxGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 JFrame frame = new JFrame("Invoice Tool (FlowLayout)");

	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	     frame.setSize(300, 500);

	     // Setting the FlowLayout with alignment and gaps

	     frame.setLayout(new BorderLayout());

	     JPanel inputJPanel = new JPanel(new GridLayout(2,3));
	     // 1. Client Inputs

	     inputJPanel.add(new JLabel("Client Name:     "));
	     inputJPanel.add(new JLabel("Hourly Rate ($): "));
	     inputJPanel.add(new JLabel("Hours Worked:    "));
	     JTextField txtClient = new JTextField(15); // '15' sets preferred width

	     inputJPanel.add(txtClient);

	

	     JTextField txtRate = new JTextField(15);

	     inputJPanel.add(txtRate);

	     JTextField txtHoursField = new JTextField(15);

	     inputJPanel.add(txtHoursField);


	     frame.add(inputJPanel,BorderLayout.NORTH);
	    

//	     JSpinner spinHours = new JSpinner(new SpinnerNumberModel(10, 5, 100, 5));
//
//	     spinHours.setPreferredSize(new Dimension(165, 25)); // Manually sizing for alignment
//
//	     frame.add(spinHours);
//
//	     // 2. The Text Area (Invoice Preview)
//
//	     JTextArea areaPreview = new JTextArea(12, 22); // 12 rows, 22 columns
//
//	     areaPreview.setText("Invoice Details...");
//
//	     JScrollPane scroll = new JScrollPane(areaPreview);
//
//	     frame.add(scroll);
//
//	     // 3. Action Buttons
//
//	     JButton btnClear = new JButton("Clear");
//
//	     JButton btnExport = new JButton("Export PDF");
//
//	     frame.add(btnClear);
//
//	     frame.add(btnExport);
	     
	     frame.setVisible(true);
	}

}
