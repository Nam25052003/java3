/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly.com.slide3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author adm1n
 */
public class StudentGui extends javax.swing.JFrame {

    /**
     * Creates new form StudentGui
     */
    public StudentGui() {
        initComponents();
        filltolist();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboten = new javax.swing.JComboBox<>();
        btnfill = new javax.swing.JButton();
        btnok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnfill.setText("FILL");
        btnfill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfillActionPerformed(evt);
            }
        });

        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(cboten, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnfill)
                .addGap(31, 31, 31)
                .addComponent(btnok)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnfill)
                    .addComponent(btnok))
                .addContainerGap(350, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
ArrayList<Student> lststudent= new ArrayList<Student>();
    public void filltolist()
    {
        lststudent.add(new Student("Tuấn", 5));
        lststudent.add(new Student("Kiệt", 5));
        lststudent.add(new Student("Phương", 20));
    }
    
    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Bạn đang chọn: " + cboten.getSelectedItem());
    }//GEN-LAST:event_btnokActionPerformed

    public void filltocombo()
    {
        
        cboten.removeAllItems();
        /*for(Student sv :lststudent)
        {
            cboten.addItem(sv.getTen());
                }
        */
        for(int i=0; i<lststudent.size(); i++)
        {
         cboten.addItem(lststudent.get(i).getTen());
        }
        
    }
    private void btnfillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfillActionPerformed
        // TODO add your handling code here:
        filltocombo();
    }//GEN-LAST:event_btnfillActionPerformed

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
            java.util.logging.Logger.getLogger(StudentGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfill;
    private javax.swing.JButton btnok;
    private javax.swing.JComboBox<String> cboten;
    // End of variables declaration//GEN-END:variables
}
