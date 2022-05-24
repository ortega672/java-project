package Smoothie;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SmoothieVariables {

    int wallet;
    int choice;

    void getWallet(int wallet) {
        this.wallet = wallet;
        System.out.println("Over all balance: " + wallet);
    }

    void getChoice(int choice) {
        this.choice = choice;
    }

    void balance() {

        JOptionPane.showMessageDialog(null, "Your Current Balance is: " + wallet);
    }

    void payment(){
        
        JFrame Optiopane;
        
    }
}
