package Smoothie;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SmoothieMenu {

    int choice;

    int prdChoice;

    int qty, num;

    public static int wallet;

    SmoothieVariables mc = new SmoothieVariables();

    JFrame Optiopane;

    public SmoothieMenu() {

        do {

            choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Smoothie Menu Choice\n"
                    + "					 [1] Strawberry\n"
                    + "					 [2] Lemon\n"
                    + "					 [3] Mango\n"
                    + "					Choose [1-3]:"));

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
                    mc.balance();
                }
                case 5 -> {
                    mc.payment();
                }

            }

        } while (choice <= 4);

    }

    void order1() {

        int Slim = 90;
        int TheUsual = 110;
        int Jumbo = 130;

        prdChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Slim " + Slim
                + "\n[2] The Usual " + TheUsual
                + "\n[3] Jumbo " + Jumbo
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        if (prdChoice == 1) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry - Banana + Slim "
                    + "\nQuantity: "));
            wallet = qty * Slim;
            passValue();
            order1();

        } else if (prdChoice == 2) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry - Banana + The Usual "
                    + "\nQuantity: "));
            wallet = qty * TheUsual;
            passValue();
            order1();

        } else if (prdChoice == 3) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Strawberry - Banana + Jumbo "
                    + "\n \nQuantity: "));
            wallet = qty * Jumbo;
            passValue();
            order1();
        } else if (prdChoice == 4) {

        }

    }

    void order2() {

        int Slim = 95;
        int TheUsual = 115;
        int Jumbo = 135;

        prdChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Slim " + Slim
                + "\n[2] The Usual " + TheUsual
                + "\n[3] Jumbo " + Jumbo
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        if (prdChoice == 1) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon – Blueberry Smoothie + Slim "
                    + "\nQuantity: "));
            wallet = qty * Slim;
            passValue();
            order2();

        } else if (prdChoice == 2) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon – Blueberry Smoothie + The Usual  "
                    + "\nQuantity: "));
            wallet = qty * TheUsual;
            passValue();
            order2();

        } else if (prdChoice == 3) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Lemon – Blueberry Smoothie + Jumbo "
                    + "\n \nQuantity: "));
            wallet = qty * Jumbo;
            passValue();
            order2();
        } else if (prdChoice == 4) {

        }

    }

    void order3() {

        int Slim = 99;
        int TheUsual = 119;
        int Jumbo = 139;

        prdChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Slim " + Slim
                + "\n[2] The Usual " + TheUsual
                + "\n[3] Jumbo " + Jumbo
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        if (prdChoice == 1) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Mango + Slim "
                    + "\nQuantity: "));
            wallet = qty * Slim;
            passValue();
            order3();

        } else if (prdChoice == 2) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Mango + The Usual "
                    + "\nQuantity: "));
            wallet = qty * TheUsual;
            passValue();
            order3();

        } else if (prdChoice == 3) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Mango + Jumbo "
                    + "\n \nQuantity: "));
            wallet = qty * Jumbo;
            passValue();
            order3();
        } else if (prdChoice == 4) {

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
