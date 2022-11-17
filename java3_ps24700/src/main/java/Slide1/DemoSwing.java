
package Slide1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class DemoSwing {
    public static void main(String[] args) {
        JFrame jf = new JFrame("jframe");
        jf.setSize(400,300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pnl = new JPanel();    
        jf.add(pnl);
        JButton btn = new JButton("blue");
        jf.add(btn);
        jf.setVisible(true);
        
        jf.setVisible(true);
    }
}
