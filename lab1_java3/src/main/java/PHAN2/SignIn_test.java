package PHAN2;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


public class SignIn_test { 
    private JFrame mainFrame;
    private Label signIn, useName, passWord;
    private TextField txtusename, txtconfirm;
    private JPasswordField pswpassword;
    private JPanel controJPanel;

    public SignIn_test() {
        prerareGUI();
    }
    
    public static void main(String[] args) {
        SignIn_test signinmain = new SignIn_test();
        
    }
    
    public void prerareGUI(){
        mainFrame = new JFrame("Sign In Form");
        mainFrame.setSize(800,400);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainFrame.setVisible(true);
    }
}
