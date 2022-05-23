package javaproject;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MilkTea {

	JFrame OptionPane;

	int[] milkTeaQty = { 50, 50, 50 };
	String[] prd = { "Winter Melon", "Oreo Cheesecake", "Salted Caramel MilkTea" };
	int qty, trans;

	MilkTea() {

		do {

			trans = Integer.parseInt(JOptionPane.showInputDialog(null,
					"MilkTea Menu Choice \n" + "\n [1] Winter Melon" + "\n [2]Oreo Cheesecake" + "\n [3] Salted Caramel" + "\n \nChoose [1-3]: "));

			switch (trans) {

			case 1:
				product1();
				break;

			case 2:

				break;

			case 3:

				break;

			}

		} while (trans <= 3);

	}

	void product1() {
		
		
		

	}
}
