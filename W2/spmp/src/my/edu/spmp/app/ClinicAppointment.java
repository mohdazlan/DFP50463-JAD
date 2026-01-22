package my.edu.spmp.app;

import java.awt.GridLayout;

import javax.swing.*;

public class ClinicAppointment extends JFrame {

	public ClinicAppointment() {
		// TODO Auto-generated constructor stub
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,2));
		JLabel patientBookingJLabel = new JLabel("Patient Booking");
		JTextField patientJTextField = new JTextField(5);
		JTextField bookingNumberJTextField = new JTextField(5);
		JButton bookingJButton = new JButton("Book Appointment");
		 
		
	
		String[] options = { "Appoinment", "Walkin", "Referred" };
		JComboBox<String> patientChoices = new JComboBox<>(options);
		
		panel.add(patientBookingJLabel);
		panel.add(patientJTextField);
		panel.add(bookingNumberJTextField);
		panel.add(bookingJButton);
		panel.add(patientChoices);
		
		this.add(panel); 
	    
	    // Basic setup to make the window visible
	    this.setSize(300, 200);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClinicAppointment frame = new ClinicAppointment();
		frame.setVisible(true);
	}

}
