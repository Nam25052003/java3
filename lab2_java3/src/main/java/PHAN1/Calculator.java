/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PHAN1;

import java.awt.event.KeyEvent;

/**
 *
 * @author NAM PC
 */
public class Calculator extends javax.swing.JFrame {

    private long so1 = 0;
    private String pheptoan = "";
    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void one() {
        String gt = txtCal.getText();
        btn1.setMnemonic(KeyEvent.VK_1);
        if (gt.length() < 12) {
            if (gt.equals("0")) {
                gt = "";
            }
            long so = Long.parseLong(gt + btn1.getText());
            txtCal.setText(String.valueOf(so));
        }
    }

    private void two() {
        String gt = txtCal.getText();
        btn2.setMnemonic(KeyEvent.VK_2);
        if (gt.length() < 12) {
            if (gt.equals("0")) {
                gt = "";
            }
            long so = Long.parseLong(gt + btn2.getText());
            txtCal.setText(String.valueOf(so));
        }
    }

    private void three() {
        String gt = txtCal.getText();
        btn3.setMnemonic(KeyEvent.VK_3);
        if (gt.length() < 12) {
            if (gt.equals("0")) {
                gt = "";
            }
            long so = Long.parseLong(gt + btn3.getText());
            txtCal.setText(String.valueOf(so));
        }
    }

    private void four() {
        String gt = txtCal.getText();
        btn4.setMnemonic(KeyEvent.VK_4);
        if (gt.length() < 12) {
            if (gt.equals("0")) {
                gt = "";
            }
            long so = Long.parseLong(gt + btn4.getText());
            txtCal.setText(String.valueOf(so));
        }
    }

    private void five() {
        String gt = txtCal.getText();
        btn5.setMnemonic(KeyEvent.VK_5);
        if (gt.length() < 12) {
            if (gt.equals("0")) {
                gt = "";
            }
            long so = Long.parseLong(gt + btn5.getText());
            txtCal.setText(String.valueOf(so));
        }
    }

    private void six() {
        String gt = txtCal.getText();
        btn6.setMnemonic(KeyEvent.VK_6);
        if (gt.length() < 12) {
            if (gt.equals("0")) {
                gt = "";
            }
            long so = Long.parseLong(gt + btn6.getText());
            txtCal.setText(String.valueOf(so));
        }
    }

    private void seven() {
        String gt = txtCal.getText();
        btn7.setMnemonic(KeyEvent.VK_7);
        if (gt.length() < 12) {
            if (gt.equals("0")) {
                gt = "";
            }
            long so = Long.parseLong(gt + btn7.getText());
            txtCal.setText(String.valueOf(so));
        }
    }

    private void eight() {
        String gt = txtCal.getText();
        btn8.setMnemonic(KeyEvent.VK_8);
        if (gt.length() < 12) {
            if (gt.equals("0")) {
                gt = "";
            }
            long so = Long.parseLong(gt + btn8.getText());
            txtCal.setText(String.valueOf(so));
        }
    }

    private void nine() {
        String gt = txtCal.getText();
        btn9.setMnemonic(KeyEvent.VK_9);
        if (gt.length() < 12) {
            if (gt.equals("0")) {
                gt = "";
            }
            long so = Long.parseLong(gt + btn9.getText());
            txtCal.setText(String.valueOf(so));
        }
    }

    private void chia() {
        so1 = Long.parseLong(txtCal.getText());
        pheptoan = "/";
        txtCal.setText("0");
    }

    private void reset() {
        txtCal.setText("");
    }

    private void cong() {
        so1 = Long.parseLong(txtCal.getText());
        pheptoan = "+";
        txtCal.setText("0");
    }

    private void tru() {
        so1 = Long.parseLong(txtCal.getText());
        pheptoan = "-";
        txtCal.setText("0");
    }

    private void nhan() {
        so1 = Long.parseLong(txtCal.getText());
        pheptoan = "*";
        txtCal.setText("0");
    }

    private void chialaydu() {
        so1 = Long.parseLong(txtCal.getText());
        pheptoan = "%";
        txtCal.setText("0");
    }

    private void nghichdao() {
        double nd = 1 / Double.parseDouble(txtCal.getText());
        txtCal.setText(String.valueOf(nd));
    }

    private void sqrt() {
        double sqrt = Math.sqrt(Double.parseDouble(txtCal.getText()));
        txtCal.setText(String.valueOf(sqrt));
    }

    private void daodau() {
        long daodau = -1 * (Long.parseLong(txtCal.getText()));
        txtCal.setText(String.valueOf(daodau));
    }

    private void zero() {
        String gt = txtCal.getText();
        btn0.setMnemonic(KeyEvent.VK_0);
        if (gt.length() < 12) {
            if (gt.equals("0")) {
                gt = "";
            }
            long so = Long.parseLong(gt + btn0.getText());
            txtCal.setText(String.valueOf(so));
        }
    }

    private void result() {
        long kq = 0;
        long so2 = Long.parseLong(txtCal.getText());
        if (pheptoan.length() > 0) {
            switch (pheptoan) {
                case "+":
                    kq = so1 + so2;
                    txtCal.setText(String.valueOf(kq));
                    break;
                case "-":
                    kq = so1 - so2;
                    txtCal.setText(String.valueOf(kq));
                    break;
                case "*":
                    kq = so1 * so2;
                    txtCal.setText(String.valueOf(kq));
                    break;
                case "/":
                    if (txtCal.getText().equals("0")) {
                        txtCal.setText("ERROR");
                        return;
                    }
                    kq = so1 / so2;
                    txtCal.setText(String.valueOf(kq));
                    break;
                case "%":
                    kq = so1 % so2;
                    txtCal.setText(String.valueOf(kq));
                    break;
            }
            pheptoan = "";
            so1 = 0;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCal = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnchia = new javax.swing.JButton();
        btnsqrt = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btntonghieu = new javax.swing.JButton();
        btnchialaydu = new javax.swing.JButton();
        btnnhan = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        btntru = new javax.swing.JButton();
        btncong = new javax.swing.JButton();
        btn1x = new javax.swing.JButton();
        btnbang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULATOR");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("CASIO");

        txtCal.setEnabled(false);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnchia.setText("/");
        btnchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchiaActionPerformed(evt);
            }
        });

        btnsqrt.setText("sqrt");
        btnsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsqrtActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btntonghieu.setText("+/-");
        btntonghieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntonghieuActionPerformed(evt);
            }
        });

        btnchialaydu.setText("%");
        btnchialaydu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchialayduActionPerformed(evt);
            }
        });

        btnnhan.setText("*");
        btnnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnhanActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnc.setText("C");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });

        btntru.setText("-");
        btntru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntruActionPerformed(evt);
            }
        });

        btncong.setText("+");
        btncong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncongActionPerformed(evt);
            }
        });

        btn1x.setText("1/x");
        btn1x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1xActionPerformed(evt);
            }
        });

        btnbang.setText("=");
        btnbang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btntru, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn1x, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnchia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnchialaydu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btntonghieu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btncong, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtCal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnchia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnchialaydu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntru, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1x, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntonghieu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        one();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        two();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        three();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        four();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        five();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        six();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        seven();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        eight();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        nine();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        zero();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btntonghieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntonghieuActionPerformed
        // TODO add your handling code here:
        daodau();
    }//GEN-LAST:event_btntonghieuActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btncActionPerformed

    private void btncongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncongActionPerformed
        // TODO add your handling code here:
        cong();
    }//GEN-LAST:event_btncongActionPerformed

    private void btntruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntruActionPerformed
        // TODO add your handling code here:
        tru();
    }//GEN-LAST:event_btntruActionPerformed

    private void btnnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnhanActionPerformed
        // TODO add your handling code here:
        nhan();
    }//GEN-LAST:event_btnnhanActionPerformed

    private void btnchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchiaActionPerformed
        // TODO add your handling code here:
        chia();
    }//GEN-LAST:event_btnchiaActionPerformed

    private void btnsqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsqrtActionPerformed
        // TODO add your handling code here:
        sqrt();
    }//GEN-LAST:event_btnsqrtActionPerformed

    private void btnchialayduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchialayduActionPerformed
        // TODO add your handling code here:
        chialaydu();
    }//GEN-LAST:event_btnchialayduActionPerformed

    private void btn1xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1xActionPerformed
        // TODO add your handling code here:
        nghichdao();
    }//GEN-LAST:event_btn1xActionPerformed

    private void btnbangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbangActionPerformed
        // TODO add your handling code here:
        result();
    }//GEN-LAST:event_btnbangActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn1x;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnbang;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnchia;
    private javax.swing.JButton btnchialaydu;
    private javax.swing.JButton btncong;
    private javax.swing.JButton btnnhan;
    private javax.swing.JButton btnsqrt;
    private javax.swing.JButton btntonghieu;
    private javax.swing.JButton btntru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtCal;
    // End of variables declaration//GEN-END:variables
}
