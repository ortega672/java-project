package javaproject;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Milktea.MilkTeaMenu;
import Smoothie.SmoothieMenu;
import Smoothie.SmoothieVariables;

public class menu_choices {

    JFrame OptionPane;

    int choice;
    
    SmoothieVariables mc = new SmoothieVariables();

    public static int cost;

    menu_choices() {

        JFrame optionpane = new JFrame();
        

        do {
            choice = Integer.parseInt(JOptionPane.showInputDialog(null, "\tMenu Choices \n"
                    + "[1] MilkTea              [4] Check Balance" + ""
                    + "\n[2] Fresh Tea          [5] Payment" + ""
                    + "\n[3] Smoothie" + ""
                    + "\nChoose [1 - 3]: "));

            switch (choice) {
                case 1:

                    new MilkTeaMenu();

                    break;

                case 2:

                    break;

                case 3:
                    new SmoothieMenu();
                    break;
                    
                case 4:
                    mc.balance();
                    break;
                    
                case 5:
                    mc.payment();
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "WRONG INPUT", "Warning Message!!!", JOptionPane.WARNING_MESSAGE);
                    new menu_choices();
            }
        } while (choice < 3);

    }

}
