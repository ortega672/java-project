package javaproject;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class menu_choices {

	JFrame OptionPane;

	int choice;

	menu_choices() {

		JFrame optionpane = new JFrame();

		do {
			choice = Integer.parseInt(JOptionPane.showInputDialog(null, "\t Menu Choices \n" + "[1] MilkTea" + "\n [2] Fresh Tea" + "\n [3] Smoothie" + "\n \nChoose [1 - 3]: "));

			switch (choice)

			{
			case 1: 
				new MilkTea();
				break;
				
				
			case 2: 
				
				break;
				
				
			case 3: 
				
				break;
				
				
			default: 
				JOptionPane.showMessageDialog(null, "WRONG INPUT", "Warning Message!!!", JOptionPane.WARNING_MESSAGE);
				new menu_choices();
			}
		} while (choice < 3);

	}

}
