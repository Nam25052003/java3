package Slide1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoAWT extends Frame implements ActionListener {

    private Button btnRed, btnYellow, btnexit;
    private Label label;    
    
    public DemoAWT(String title) {
        setTitle(title);
        setLayout(new FlowLayout());
        
        btnRed = new Button("red");
        btnYellow = new Button("yellow");
        btnexit = new Button("exit");
        label = new Label("....................");        
        
        add(btnRed);
        add(btnYellow);
        add(label);
        add(btnexit);
        
        btnRed.addActionListener(this);
        btnYellow.addActionListener(this);
        btnexit.addActionListener(this);
    }
    
    public static void main(String[] args) {
        DemoAWT demoAWT = new DemoAWT("demo giao diem");
        demoAWT.setSize(400, 200);
        demoAWT.show();
        demoAWT.setLocationRelativeTo(null);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("red")) {
            label.setText("red color");
            this.setBackground(Color.red);
        } else if (str.equals("yellow")) {
            label.setText("yellow color");
            this.setBackground(Color.yellow);
        } else if (str.equals("exit")) {
            System.exit(0);
        }
    }
}
