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

            choice = Integer.parseInt(JOptionPane.showInputDialog(null, "MilkTea Menu Choice\n"
                    + "					 [1] Winter Melon\n"
                    + "					 [2]Oreo Cheesecake\n"
                    + "					 [3] Salted Caramel\n"
                    + "[4] Check Balance:\n"
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

            }

        } while (choice <= 4);

    }

    void order1() {

        int Slim = 65;
        int TheUsual  = 75;
        int Jumbo = 85;

        prdChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Slim " + Slim
                + "\n[2] The Usual " + TheUsual
                + "\n[3] Jumbo " + Jumbo
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        if (prdChoice == 1) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Pillar Cup "
                    + "\nQuantity: "));
            wallet = qty * Slim;
            passValue();
            order1();

        } else if (prdChoice == 2) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Classic Cup "
                    + "\nQuantity: "));
            wallet = qty * TheUsual;
            passValue();
            order1();

        } else if (prdChoice == 3) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Winter Melon + Grande Cup "
                    + "\n \nQuantity: "));
            wallet = qty * Jumbo;
            passValue();
            order1();
        } else if (prdChoice == 4) {

        }

    }

    void order2() {

        int Slim = 79;
        int TheUsual = 89;
        int Jumbo = 99;

        prdChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Slim " + Slim
                + "\n[2] The Usual " + TheUsual
                + "\n[3] Jumbo " + Jumbo
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        if (prdChoice == 1) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Oreo Cheesecake + Pillar Cup "
                    + "\nQuantity: "));
            wallet = qty * Slim;
            passValue();
            order2();

        } else if (prdChoice == 2) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Oreo Cheesecake + Classic Cup "
                    + "\nQuantity: "));
            wallet = qty * TheUsual;
            passValue();
            order2();

        } else if (prdChoice == 3) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Oreo Cheesecake + Grande Cup "
                    + "\n \nQuantity: "));
            wallet = qty * Jumbo;
            passValue();
            order2();
        } else if (prdChoice == 4) {

        }

    }

    void order3() {

        int Slim = 75;
        int TheUsual = 85;
        int Jumbo = 95;

        prdChoice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cup Size Choice\n" + "[1] Slim " + Slim
                + "\n[2] The Usual " + TheUsual
                + "\n[3] Jumbo " + Jumbo
                + "\n[4] Go Back to Milktea Menu" + "\n"
                + "Choose [1-3]: "));

        if (prdChoice == 1) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Salted Caramel + Pillar Cup "
                    + "\nQuantity: "));
            wallet = qty * Slim;
            passValue();
            order3();

        } else if (prdChoice == 2) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Salted Caramel + Classic Cup "
                    + "\nQuantity: "));
            wallet = qty * TheUsual;
            passValue();
            order3();

        } else if (prdChoice == 3) {

            qty = Integer.parseInt(JOptionPane.showInputDialog(null, "\nYou Chose: Salted Caramel + Grande Cup "
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
