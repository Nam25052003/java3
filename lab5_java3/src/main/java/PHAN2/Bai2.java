/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PHAN2;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author NAM PC
 */
public class Bai2 extends javax.swing.JFrame {

    ArrayList<STUDENTS> list = new ArrayList<>();
    STUDENTS sv = new STUDENTS();
    int index = 0;
    public static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String url = "jdbc:sqlserver://localhost; database = QLSV";
    public static String user = "sa";
    public static String password = "123";

    /**
     * Creates new form Bai2
     */
    public Bai2() {
        initComponents();
        setLocationRelativeTo(null);
        loadDataToArray();
        disPlay(index);
        DisEnablef();
    }

    public void disPlay(int i) {
        STUDENTS sv = list.get(i);
        txtmasv.setText(sv.maSV);
        txthoten.setText(sv.hoTen);
        txtemail.setText(sv.eMail);
        txtsodt.setText(sv.soDT);
        boolean gt = sv.gioiTinh;
        if (gt == true) {
            rdonam.setSelected(true);
        } else {
            rdonu.setSelected(true);
        }
        txa.setText(sv.diaChi);
    }

    public void loadDataToArray() {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stm = conn.createStatement();
            String sql = "select * from STUDENTS";
            ResultSet rs = stm.executeQuery(sql);
            list.clear();

            while (rs.next()) {
                String masv = rs.getString(1);
                String hoten = rs.getString(2);
                String email = rs.getString(3);
                String sodt = rs.getString(4);
                boolean gt = rs.getBoolean(5);
                String diachi = rs.getString(6);
                STUDENTS sv = new STUDENTS(masv, hoten, email, sodt, diachi, gt);
                list.add(sv);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void savef() {
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "insert into STUDENTS values (?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, txtmasv.getText());
            pst.setString(2, txthoten.getText());
            pst.setString(3, txtemail.getText());
            pst.setString(4, txtsodt.getText());
            boolean gt;
            if (rdonam.isSelected()) {
                gt = true;
            } else {
                gt = false;
            }
            pst.setBoolean(5, gt);
            pst.setString(6, txa.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "SAVE");
            conn.close();
            loadDataToArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updatef() {
        if (txtmasv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "nhập mã sv");
            txtmasv.requestFocus();
            return;
        }
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "update STUDENTS set hoten=?, email=?, sodt=?, diachi=?," + "gioitinh=? where masv=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, txthoten.getText());
            pst.setString(2, txtemail.getText());
            pst.setString(3, txtsodt.getText());
            pst.setString(4, txa.getText());
            boolean gt;
            if (rdonam.isSelected()) {
                gt = true;
            } else {
                gt = false;
            }
            pst.setBoolean(5, gt);
            pst.setString(6, txtmasv.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "UPDATE");
            conn.close();
            loadDataToArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deletef() {
        if (txtmasv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "nhập mã sv");
            txtmasv.requestFocus();
            return;
        }
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "delete from STUDENTS where masv=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, txtmasv.getText());
            pst.execute();
            JOptionPane.showMessageDialog(this, "DELETE");
            conn.close();
            disPlay(index--);
            clearf();
            loadDataToArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findf() {
        if (txtfind.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "nhập mã sv để tìm kiếm");
            txtfind.requestFocus();
            return;
        }
//        for (STUDENTS sv : list) {
//            if (txtfind.getText().equalsIgnoreCase(sv.getMaSV())) {
//                JOptionPane.showMessageDialog(this, "không có sinh viên này");
//                return;
//            }
//        }
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "select * from STUDENTS where masv=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, txtfind.getText());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                txtmasv.setText(rs.getString(1));
                txthoten.setText(rs.getString(2));
                txtemail.setText(rs.getString(3));
                txtsodt.setText(rs.getString(4));

                Boolean gt = rs.getBoolean(5);
                if (gt == true) {
                    rdonam.setSelected(true);
                } else {
                    rdonu.setSelected(true);
                }

                txa.setText(rs.getString(6));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearf() {
        txtmasv.setText("");
        txthoten.setText("");
        txtemail.setText("");
        txtsodt.setText("");
        rdonam.setSelected(false);
        rdonu.setSelected(false);
        txa.setText("");
        txtfind.setText("");
        index = 0;
    }

    public void Enablef() {
        txtmasv.setEditable(true);
        txthoten.setEditable(true);
        txtemail.setEditable(true);
        rdonam.setEnabled(true);
        rdonu.setEnabled(true);
        txtsodt.setEditable(true);
        txa.setEditable(true);
    }

    public void DisEnablef() {
        txtmasv.setEditable(false);
        txthoten.setEditable(false);
        txtemail.setEditable(false);
        rdonam.setEnabled(false);
        rdonu.setEnabled(false);
        txtsodt.setEditable(false);
        txa.setEditable(false);
    }
//    validate

    public boolean checknull() {
        if (txtmasv.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "hãy nhập mã sv");
            txtmasv.requestFocus();
            return false;
        }
        if (txthoten.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "hãy nhập họ tên");
            txthoten.requestFocus();
            return false;
        }
        if (txtemail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "hãy nhập email");
            txtemail.requestFocus();
            return false;
        }
        if (txtsodt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "hãy nhập số đt");
            txtsodt.requestFocus();
            return false;
        }
        if (txa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "hãy nhập địa chỉ");
            txa.requestFocus();
            return false;
        }
        return true;
    }

    //      check lỗi email và sdt và mã sv
    private static final String P_MASV = "^ps\\d{5}";

    public boolean check_masv() {
        Matcher matcher1 = Pattern.compile(P_MASV).matcher(txtmasv.getText());
        if (!matcher1.matches()) {
            JOptionPane.showMessageDialog(this, "mã sinh viên sai định dạng");
            return false;
        }
        for (STUDENTS sv : list) {
            if (txtmasv.getText().equalsIgnoreCase(sv.getMaSV())) {
                JOptionPane.showMessageDialog(this, "không được trùng mã sinh viên");
                return false;
            }
        }
        return true;
    }
    private static final String P_EMAIL = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";

    public boolean check_email() {
        Matcher matcher2 = Pattern.compile(P_EMAIL).matcher(txtemail.getText());
        if (!matcher2.matches()) {
            JOptionPane.showMessageDialog(this, "Email sai định dạng");
            return false;
        }
        return true;
    }
    private static final String P_SDT = "^0\\d{9}";

    public boolean check_sdt() {
        Matcher matcher3 = Pattern.compile(P_SDT).matcher(txtsodt.getText());
        if (!matcher3.matches()) {
            JOptionPane.showMessageDialog(this, "số điện thoại sai định dạng");
            return false;
        }
        return true;
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
        jLabel1 = new javax.swing.JLabel();
        btnfind = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtfind = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtmasv = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtsodt = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        rdonam = new javax.swing.JRadioButton();
        rdonu = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa = new javax.swing.JTextArea();
        btnexit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("QUẢN LÝ USERS");

        btnfind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N
        btnfind.setText("Find");
        btnfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfindActionPerformed(evt);
            }
        });

        jLabel8.setText("Tìm kiếm");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfind, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Mã SV: ");

        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add.png"))); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        jLabel3.setText("Họ tên: ");

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jLabel4.setText("Email: ");

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jLabel5.setText("Số ĐT: ");

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        jLabel6.setText("Giới tính: ");

        buttonGroup1.add(rdonam);
        rdonam.setText("nam");

        buttonGroup1.add(rdonu);
        rdonu.setText("nữ");

        jLabel7.setText("Địa chỉ: ");

        txa.setColumns(20);
        txa.setRows(5);
        jScrollPane1.setViewportView(txa);

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Log out.png"))); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtmasv, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                .addComponent(txthoten)
                                .addComponent(txtemail)
                                .addComponent(txtsodt))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdonam)
                        .addGap(18, 18, 18)
                        .addComponent(rdonu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete)
                    .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rdonam)
                    .addComponent(rdonu)
                    .addComponent(btnexit))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnfirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/first.PNG"))); // NOI18N
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });
        jPanel3.add(btnfirst);

        btnprev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prev.PNG"))); // NOI18N
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });
        jPanel3.add(btnprev);

        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next.PNG"))); // NOI18N
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        jPanel3.add(btnnext);

        btnlast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/last.PNG"))); // NOI18N
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });
        jPanel3.add(btnlast);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(366, 366, 366)
                                        .addComponent(btnfind, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 5, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnfind)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        clearf();
        txtmasv.requestFocus();
        Enablef();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:        
        int choosedelete = JOptionPane.showConfirmDialog(this, "confirm", "DELETE", JOptionPane.YES_NO_OPTION);
        if (choosedelete == JOptionPane.YES_OPTION) {
            deletef();
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        updatef();
        Enablef();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if (txthoten.isEditable()) {
            if (checknull() && check_masv() && check_email() && check_sdt()) {
                savef();
                clearf();
            }
        } else {
            JOptionPane.showMessageDialog(this, "hãy nhấn nút new để tạo mới trang");
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        // TODO add your handling code here:
        index = 0;
        disPlay(index);
        DisEnablef();
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        index++;
        if (index >= list.size()) {
            JOptionPane.showMessageDialog(this, "đang ở cuối");
            index = list.size();
            index--;
            return;
        }
        disPlay(index);
        DisEnablef();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        // TODO add your handling code here:
        index--;
        if (index < 0) {
            JOptionPane.showMessageDialog(this, "đang ở đầu");
            index = 0;
            return;
        }
        disPlay(index);
        DisEnablef();
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:
        index = list.size() - 1;
        disPlay(index);
        DisEnablef();
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfindActionPerformed
        // TODO add your handling code here:
//        if (findf(txtmasv.getText()) == null) {
//            JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên");
//        } else {
//            fillToForm(findf(txtmasv.getText()));
//        }
        findf();
    }//GEN-LAST:event_btnfindActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        int chooseexit = JOptionPane.showConfirmDialog(this, "Confirm", "EXIT", JOptionPane.YES_NO_OPTION);
        if (chooseexit == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "EXIT");
            System.exit(0);
        }
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnfind;
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdonam;
    private javax.swing.JRadioButton rdonu;
    private javax.swing.JTextArea txa;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfind;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmasv;
    private javax.swing.JTextField txtsodt;
    // End of variables declaration//GEN-END:variables
}
