package net.dfp50463.app;
import java.awt.*;
public class TemperatireConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new Frame, which is the top-level window of our GUI application.
        Frame frame = new Frame("Temperature Converter Display");
        // Set the size of the frame to 400 pixels wide and 300 pixels high.
        frame.setSize(400, 300);
        // Set the layout manager for the frame to GridLayout with 4 rows and 1 column.
        // This will arrange components in a simple vertical stack.
        frame.setLayout(new GridLayout(4, 1));
        // Set the frame's visibility to true, making it appear on the screen.
        frame.setVisible(true);

        // --- Row 1: Input Panel ---
        // Create a Panel to group the input label and text field.
        Panel inputPanel = new Panel();
        // Set the layout of the inputPanel to FlowLayout, which arranges components in a row.
        inputPanel.setLayout(new FlowLayout());

        // Create a Label for the input temperature field.
        Label inputLabel = new Label("Temperature:");
        // Create a TextField for users to enter the temperature value.
        TextField inputField = new TextField(10); // 10 columns wide
        // Add the inputLabel to the inputPanel.
        inputPanel.add(inputLabel);
        // Add the inputField to the inputPanel.
        inputPanel.add(inputField);
        // Add the inputPanel to the main frame.
        frame.add(inputPanel);

        // --- Row 2: From Unit Selection Panel ---
        // Create a Panel to group the "from" unit label and choice component.
        Panel fromUnitPanel = new Panel();
        // Set the layout of the fromUnitPanel to FlowLayout.
        fromUnitPanel.setLayout(new FlowLayout());

        // Create a Label for the "from" unit selection.
        Label fromLabel = new Label("From Unit:");
        // Create a Choice component (dropdown menu) for selecting the "from" temperature unit.
        Choice fromChoice = new Choice();
        // Add "Celsius" as an option to the dropdown.
        fromChoice.add("Celsius");
        // Add "Fahrenheit" as an option to the dropdown.
        fromChoice.add("Fahrenheit");
        // Add "Kelvin" as an option to the dropdown.
        fromChoice.add("Kelvin");
        // Select "Celsius" as the default option.
        fromChoice.select("Celsius");
        // Add the fromLabel to the fromUnitPanel.
        fromUnitPanel.add(fromLabel);
        // Add the fromChoice (dropdown) to the fromUnitPanel.
        fromUnitPanel.add(fromChoice);
        // Add the fromUnitPanel to the main frame.
        frame.add(fromUnitPanel);

        // --- Row 3: To Unit Selection Panel ---
        // Create a Panel to group the "to" unit label and choice component.
        Panel toUnitPanel = new Panel();
        // Set the layout of the toUnitPanel to FlowLayout.
        toUnitPanel.setLayout(new FlowLayout());

        // Create a Label for the "to" unit selection.
        Label toLabel = new Label("To Unit:");
        // Create a Choice component (dropdown menu) for selecting the "to" temperature unit.
        Choice toChoice = new Choice();
        // Add "Celsius" as an option to the dropdown.
        toChoice.add("Celsius");
        // Add "Fahrenheit" as an option to the dropdown.
        toChoice.add("Fahrenheit");
        // Add "Kelvin" as an option to the dropdown.
        toChoice.add("Kelvin");
        // Select "Fahrenheit" as the default option.
        toChoice.select("Fahrenheit");
        // Add the toLabel to the toUnitPanel.
        toUnitPanel.add(toLabel);
        // Add the toChoice (dropdown) to the toUnitPanel.
        toUnitPanel.add(toChoice);
        // Add the toUnitPanel to the main frame.
        frame.add(toUnitPanel);

        // --- Row 4: Result Display Panel ---
        // Create a Panel to group the result label.
        Panel resultPanel = new Panel();
        // Set the layout of the resultPanel to FlowLayout.
        resultPanel.setLayout(new FlowLayout());

        // Create a Label to display the conversion result.
        Label resultDisplayLabel = new Label("Result: --");
        // Create a new Font object for customizing the result display.
        // Set font family to "Serif", style to BOLD, and size to 20 points.
        Font resultFont = new Font("Serif", Font.BOLD, 20);
        // Apply the custom font to the resultDisplayLabel.
        resultDisplayLabel.setFont(resultFont);
        // Add the resultDisplayLabel to the resultPanel.
        resultPanel.add(resultDisplayLabel);
        // Add the resultPanel to the main frame.
        frame.add(resultPanel);

	}

}
