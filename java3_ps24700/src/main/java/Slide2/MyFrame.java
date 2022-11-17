package Slide2;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
    
    public MyFrame() {
        initFrame();
    }
    
    public static void main(String[] args) {
        new MyFrame().setVisible(true);
    }
    
    private void initFrame() {
        this.setSize(500, 400);
        this.setBackground(Color.GRAY);
        this.setTitle("my frame 1");
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel lblusername = new JLabel("Username");
        add(lblusername);
        
        JTextField txtusername = new JTextField(15);
        this.add(txtusername);
               
        ImageIcon icon = new ImageIcon("D:\\laptrinh\\java\\Hinh\\Stop.png");
        JButton btnstop = new JButton(icon);
        this.add(btnstop);
        btnstop.setIcon(new ImageIcon(getClass().getResource("/Hinh/Help.png")));
        
        ImageIcon icon2 = new ImageIcon(getClass().getResource("/Hinh/Create.png"));
        JButton btnaccept = new JButton(icon2);
        this.add(btnaccept);
    }
}
