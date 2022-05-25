package FreshTea;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javaproject.menu_choices;

public class FreshTeaMenu {
	
	int choice;

    int prdChoice;

    int qty, num;

    public static int wallet;
    
    FreshTeaVariables mc = new FreshTeaVariables();
    
    JFrame Optiopane;
    
    public FreshTeaMenu() {
    	
    	
    	do {

            choice = Integer.parseInt(JOptionPane.showInputDialog(null, "FreshTea Menu Choice"
                    + "					 \n[1] Lemon Tea"
                    + "					 \n[2] Strawberry Tea"
                    + "					 \n[3] Apple Tea\n"
                    + "[4] Return to the Main Menu\n"
                    + "					\nChoose [1-3]:"));

            switch (choice) {

                case 1 -> {
                    order1();
                }

                case 2 -> {
                    order2();
                }

                case 3 -> {
                    order3();
                }

                case 4 -> {
                	new menu_choices();
                }

            }

        } while (choice <= 4);

    }

    void order1() {

        int Petite = 60;
        int Standard = 70;
        int Mega = 80;

        prdChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Petite " + Petite
                + "\n[2] Standard " + Standard
                + "\n[3] Mega " + Mega
                + "\n[4] Go Back to FreshTea Menu" + "\n"
                + "Choose [1-4]: "));

        if (prdChoice == 1) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon Tea + Petite "
                    + "\nQuantity: "));
            wallet = qty * Petite;
            passValue();
            order1();

        } else if (prdChoice == 2) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon Tea + Standard "
                    + "\nQuantity: "));
            wallet = qty * Standard;
            passValue();
            order1();

        } else if (prdChoice == 3) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon Tea + Mega "
                    + "\n \nQuantity: "));
            wallet = qty * Mega;
            passValue();
            order1();
        } else if (prdChoice == 4) {
             
            new FreshTeaMenu();
        }

    }

    void order2() {

        int Petite = 68;
        int Standard = 78;
        int Mega = 88;

        prdChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Petite " + Petite
                + "\n[2] Standard " + Standard
                + "\n[3] Mega " + Mega
                + "\n[4] Go Back to FreshTea Menu" + "\n"
                + "Choose [1-4]: "));

        if (prdChoice == 1) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry Tea + Petite "
                    + "\nQuantity: "));
            wallet = qty * Petite;
            passValue();
            order2();

        } else if (prdChoice == 2) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry Tea + Standard "
                    + "\nQuantity: "));
            wallet = qty * Standard;
            passValue();
            order2();

        } else if (prdChoice == 3) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry Tea + Mega "
                    + "\n \nQuantity: "));
            wallet = qty * Mega;
            passValue();
            order2();
        } else if (prdChoice == 4) {

             new FreshTeaMenu();
        }

    }

    void order3() {

    	int Petite = 65;
        int Standard = 75;
        int Mega = 85;

        prdChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Petite " + Petite
                + "\n[2] Standard " + Standard
                + "\n[3] Mega " + Mega
                + "\n[4] Go Back to FreshTea Menu" + "\n"
                + "Choose [1-4]: "));

        if (prdChoice == 1) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Apple Tea + Petite "
                    + "\nQuantity: "));
            wallet = qty * Petite;
            passValue();
            order3();

        } else if (prdChoice == 2) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Apple Tea + Standard "
                    + "\nQuantity: "));
            wallet = qty * Standard;
            passValue();
            order3();

        } else if (prdChoice == 3) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Apple Tea + Mega "
                    + "\n \nQuantity: "));
            wallet = qty * Mega;
            passValue();
            order3();
        } else if (prdChoice == 4) {

             new FreshTeaMenu();
        }

    }
    
    void passValue() {

        num = num + wallet;

        System.out.println("\nPassed Num: " + num);
        System.out.println("\nPassed choice: " + choice);

        mc.getWallet(num);
        mc.getChoice(choice);

    }
    	
    	
    	
    }


