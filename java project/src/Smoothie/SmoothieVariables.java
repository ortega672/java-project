package Smoothie;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SmoothieVariables {

    
    
    double wallet;
    int choice;
    double payment;
    int total;
    double diff=0;
    

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
        
        if(wallet == 0){
            JOptionPane.showMessageDialog(null, 
                    "You don't have current balance. Please return to the Smoothie Menu"
            );
            new SmoothieMenu();
        }else{
            payment = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your Payment: "));
            pay();
            exit();
        }
        
    }
    
    void pay(){
        
        diff = payment - wallet;
        
        if (payment < wallet){
            JOptionPane.showMessageDialog(null, 
                    "Insuffienct Funds"
            );
            payment();
        }else{
            JOptionPane.showMessageDialog(null, 
                    "Your total cost: " + wallet +
                    "\nChange: " + diff
            );
        }
    }
    
    void exit(){
        JOptionPane.showMessageDialog(null, 
                    "Thank you for choosing Sip n' Tea! \n"
                            + "             Come Again! ('-')/"
            );
    }
}
