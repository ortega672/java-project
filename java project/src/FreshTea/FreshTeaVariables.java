package FreshTea;

import javax.swing.JOptionPane;

public class FreshTeaVariables {
	
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
    
}
