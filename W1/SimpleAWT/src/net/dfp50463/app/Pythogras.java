package net.dfp50463.app;

import java.awt.*;

public class Pythogras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Frame frame = new Frame("Temperature Converter Display");
	        // Set the size of the frame to 400 pixels wide and 300 pixels high.
	        frame.setSize(400, 300);
	        // Set the layout manager for the frame to GridLayout with 4 rows and 1 column.
	        // This will arrange components in a simple vertical stack.
	        frame.setLayout(new FlowLayout());
	        // Set the frame's visibility to true, making it appear on the screen.
	        frame.setVisible(true);
	        
	        Label fromLabel = new Label("Barisan Pelajar DFP54043:");
	        // Create a Choice component (dropdown menu) for selecting the "from" temperature unit.
	        Choice fromChoice = new Choice();
	        // Add "Celsius" as an option to the dropdown.
	        fromChoice.add("MJ");
	        // Add "Fahrenheit" as an option to the dropdown.
	        fromChoice.add("Vann");
	        // Add "Kelvin" as an option to the dropdown.
	        fromChoice.add("Mary");
	        // Select "Celsius" as the default option.
	        fromChoice.select("Keith");
	        
	        frame.add(fromChoice);
	        
	        Label weightLabel = new Label("a=");
			frame.add(weightLabel);

			TextField weightField = new TextField("0.0", 10);
			frame.add(weightField);

	}

}
