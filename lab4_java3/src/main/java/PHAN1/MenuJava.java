/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PHAN1;

import java.awt.Color;
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author NAM PC
 */
public class MenuJava extends javax.swing.JFrame {

    /**
     * Creates new form MenuJava
     */
    public MenuJava() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void aboutf(){
        String str = "program: demo menu \n author: tuech \n last update: 06-oct-2015 \n education: fpoly";
        JOptionPane.showMessageDialog(this, str, "Giới thiệu",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void exitf(){
        JOptionPane.showMessageDialog(this, "EXIT");
        System.exit(0);
    }
    
    public void changeClolorBackgroud(Color color){
        txt.setBackground(color);        
    }
    
    public void changeColorText(){
        txt.setForeground(JColorChooser.showDialog(null, "chọn màu chữ", Color.white));
    }
    
    public void openf(){
        JFileChooser jfc = new JFileChooser("D:\\laptrinh\\java\\java3\\lab4_java3");
        int result = jfc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                txp.setPage("file:///" + jfc.getSelectedFile().getPath());
            } catch (Exception e) {
            }
        }
    }
    
    public void savef(){
        JFileChooser jfc = new JFileChooser("D:\\laptrinh\\java\\java3\\lab4_java3");
        int result = jfc.showOpenDialog(null);
        File file = jfc.getSelectedFile();
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                PrintWriter printWriter = new PrintWriter(file);
                printWriter.println(txp.getText());
                printWriter.close();
            } catch (Exception e) {
            }
        }
    }
    
    public void newMenu(){
        txp.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        btnnew = new javax.swing.JButton();
        btnabout = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txp = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnufile = new javax.swing.JMenu();
        mnuinew = new javax.swing.JMenuItem();
        mnuiopen = new javax.swing.JMenuItem();
        mnuisave = new javax.swing.JMenuItem();
        mnucolor = new javax.swing.JMenu();
        rdomnuired = new javax.swing.JRadioButtonMenuItem();
        rdomnuigreen = new javax.swing.JRadioButtonMenuItem();
        rdomnuiblue = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        rdomnuitextcolor = new javax.swing.JRadioButtonMenuItem();
        mnusystem = new javax.swing.JMenu();
        mnuiaboutus = new javax.swing.JMenuItem();
        mnuiexit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Documents.png"))); // NOI18N
        btnnew.setFocusable(false);
        btnnew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jToolBar1.add(btnnew);

        btnabout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User.png"))); // NOI18N
        btnabout.setFocusable(false);
        btnabout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnabout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnabout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaboutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnabout);

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnexit);

        txt.setBackground(new java.awt.Color(102, 255, 102));
        txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt.setForeground(new java.awt.Color(0, 51, 204));
        txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt.setText("Fpoly - Java3");
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txp);

        mnufile.setText("File");

        mnuinew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuinew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Documents.png"))); // NOI18N
        mnuinew.setText("New");
        mnuinew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuinewActionPerformed(evt);
            }
        });
        mnufile.add(mnuinew);

        mnuiopen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuiopen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Open file.png"))); // NOI18N
        mnuiopen.setText("Open");
        mnuiopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiopenActionPerformed(evt);
            }
        });
        mnufile.add(mnuiopen);

        mnuisave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuisave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        mnuisave.setText("Save");
        mnuisave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuisaveActionPerformed(evt);
            }
        });
        mnufile.add(mnuisave);

        jMenuBar1.add(mnufile);

        mnucolor.setBorder(null);
        mnucolor.setText("Color");

        buttonGroup1.add(rdomnuired);
        rdomnuired.setSelected(true);
        rdomnuired.setText("Red");
        rdomnuired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdomnuiredActionPerformed(evt);
            }
        });
        mnucolor.add(rdomnuired);

        buttonGroup1.add(rdomnuigreen);
        rdomnuigreen.setText("Green ");
        rdomnuigreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdomnuigreenActionPerformed(evt);
            }
        });
        mnucolor.add(rdomnuigreen);

        buttonGroup1.add(rdomnuiblue);
        rdomnuiblue.setText("Blue");
        rdomnuiblue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdomnuiblueActionPerformed(evt);
            }
        });
        mnucolor.add(rdomnuiblue);
        mnucolor.add(jSeparator1);

        buttonGroup1.add(rdomnuitextcolor);
        rdomnuitextcolor.setText("Text color");
        rdomnuitextcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdomnuitextcolorActionPerformed(evt);
            }
        });
        mnucolor.add(rdomnuitextcolor);

        jMenuBar1.add(mnucolor);

        mnusystem.setText("System");

        mnuiaboutus.setText("About us");
        mnuiaboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiaboutusActionPerformed(evt);
            }
        });
        mnusystem.add(mnuiaboutus);

        mnuiexit.setText("Exit");
        mnuiexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiexitActionPerformed(evt);
            }
        });
        mnusystem.add(mnuiexit);

        jMenuBar1.add(mnusystem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    private void mnuiexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiexitActionPerformed
        // TODO add your handling code here:
       exitf();
    }//GEN-LAST:event_mnuiexitActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        exitf();
    }//GEN-LAST:event_btnexitActionPerformed

    private void mnuiopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiopenActionPerformed
        // TODO add your handling code here:
        openf();
    }//GEN-LAST:event_mnuiopenActionPerformed

    private void btnaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaboutActionPerformed
        // TODO add your handling code here:
        aboutf();
    }//GEN-LAST:event_btnaboutActionPerformed

    private void mnuiaboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiaboutusActionPerformed
        // TODO add your handling code here:
        aboutf();
    }//GEN-LAST:event_mnuiaboutusActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        // TODO add your handling code here:
        newMenu();
    }//GEN-LAST:event_btnnewActionPerformed

    private void mnuinewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuinewActionPerformed
        // TODO add your handling code here:
        newMenu();
    }//GEN-LAST:event_mnuinewActionPerformed

    private void mnuisaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuisaveActionPerformed
        // TODO add your handling code here:
        savef();
    }//GEN-LAST:event_mnuisaveActionPerformed

    private void rdomnuitextcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdomnuitextcolorActionPerformed
        // TODO add your handling code here:
        changeColorText();
    }//GEN-LAST:event_rdomnuitextcolorActionPerformed

    private void rdomnuiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdomnuiredActionPerformed
        // TODO add your handling code here:
        changeClolorBackgroud(Color.red);
    }//GEN-LAST:event_rdomnuiredActionPerformed

    private void rdomnuigreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdomnuigreenActionPerformed
        // TODO add your handling code here:
        changeClolorBackgroud(Color.green);
    }//GEN-LAST:event_rdomnuigreenActionPerformed

    private void rdomnuiblueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdomnuiblueActionPerformed
        // TODO add your handling code here:
        changeClolorBackgroud(Color.blue);
    }//GEN-LAST:event_rdomnuiblueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnabout;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnnew;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mnucolor;
    private javax.swing.JMenu mnufile;
    private javax.swing.JMenuItem mnuiaboutus;
    private javax.swing.JMenuItem mnuiexit;
    private javax.swing.JMenuItem mnuinew;
    private javax.swing.JMenuItem mnuiopen;
    private javax.swing.JMenuItem mnuisave;
    private javax.swing.JMenu mnusystem;
    private javax.swing.JRadioButtonMenuItem rdomnuiblue;
    private javax.swing.JRadioButtonMenuItem rdomnuigreen;
    private javax.swing.JRadioButtonMenuItem rdomnuired;
    private javax.swing.JRadioButtonMenuItem rdomnuitextcolor;
    private javax.swing.JTextPane txp;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
