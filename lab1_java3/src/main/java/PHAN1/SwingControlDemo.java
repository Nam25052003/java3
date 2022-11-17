package PHAN1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo {
    
    private JFrame mainFrame;
    private JLabel headerLabel, statusLabel;
    private JPanel controlPanel;
    
    public SwingControlDemo() {
        prepareGUI();
    }
    
    public static void main(String[] args) {
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        swingControlDemo.showCheckBoxDemo();
    }
    
    private void prepareGUI() {
        mainFrame = new JFrame("java swing");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);
        
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    
    private void showCheckBoxDemo() {
        headerLabel.setText("control in action: checked");
        
        final JCheckBox chkApple = new JCheckBox("apple");
        final JCheckBox chkMango = new JCheckBox("mango");
        final JCheckBox chkPeer = new JCheckBox("peer");
        
        chkApple.setMnemonic(KeyEvent.VK_C);
        chkMango.setMnemonic(KeyEvent.VK_M);
        chkPeer.setMnemonic(KeyEvent.VK_P);
        
        chkApple.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("apple checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        chkMango.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("mango checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        chkPeer.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                statusLabel.setText("peer checkbox: " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });
        
        controlPanel.add(chkApple);
        controlPanel.add(chkMango);
        controlPanel.add(chkPeer);
        
        mainFrame.setVisible(true);
    }
    
}
