/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ConnectionDB;
import java.sql.*;
import javax.swing.*;
import model.KhachHang;
import java.awt.GridLayout;

/**
 *
 * @author Admins
 */
public class ForgotPass extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPass
     */
    public ForgotPass() {
        initComponents();
        this.setLocationRelativeTo(null);
        MaNVLB.setVisible(pos);
        MaNVTF.setVisible(pos);
    }
    boolean pos=false;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        MaNVLB = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MaNVTF = new javax.swing.JTextField();
        PosCB = new javax.swing.JComboBox<>();
        SexCB = new javax.swing.JComboBox<>();
        SDTTF = new javax.swing.JTextField();
        NameTF = new javax.swing.JTextField();
        AccTF = new javax.swing.JTextField();
        ForgetBT = new javax.swing.JButton();
        RegisterBT = new javax.swing.JButton();
        LoginBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255)));
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 700));

        MaNVLB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MaNVLB.setText("Mã nhân viên:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Giới tính:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quyền:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Số điện thoại:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Họ và Tên:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên tài khoản:");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 8, 8));
        jLabel1.setText("  XÁC NHẬN THÔNG TIN TÀI KHOẢN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PosCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khách hàng", "Nhân viên" }));
        PosCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosCBActionPerformed(evt);
            }
        });

        SexCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn", "Nam", "Nữ", "Khác" }));

        ForgetBT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ForgetBT.setText("Đổi mật khẩu");
        ForgetBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgetBTActionPerformed(evt);
            }
        });

        RegisterBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RegisterBT.setText("Đăng ký");
        RegisterBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBTActionPerformed(evt);
            }
        });

        LoginBT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoginBT.setText("Đăng nhập");
        LoginBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(LoginBT, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245)
                        .addComponent(RegisterBT, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SexCB, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PosCB, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                                    .addComponent(AccTF)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(MaNVLB)
                                        .addGap(18, 18, 18)
                                        .addComponent(MaNVTF, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(SDTTF, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(ForgetBT, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(384, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SDTTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SexCB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PosCB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaNVLB)
                    .addComponent(MaNVTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(ForgetBT, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterBT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginBT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(160, 10, 680, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ConnectionDB c= new ConnectionDB();
    private void ForgetBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgetBTActionPerformed
        Connection cn=c.getConnectionDB();
        String phone;
        Statement stm = null;
        ResultSet rs = null;
        if(pos==false){
            try {
                String sql1="select * from KHACHHANG";
                String sql="update KHACHHANG set pass=? where TKKH='"+AccTF.getText()+"'";
                stm=cn.createStatement();
                rs=stm.executeQuery(sql1);
                StringBuilder sb = new StringBuilder();
                if (NameTF.getText().equals("")) {
                    sb.append("Họ tên không được để trống! \n");
                }
                if (AccTF.getText().equals("")){
                    sb.append("Tên Tài khoản không được bỏ trống! \n");
                }
                if (SDTTF.getText().equals("")){
                    sb.append("Số điện thoại không được để trống! \n");
                }
                phone=SDTTF.getText();
                try{
                    Integer.parseInt(phone);
                    
                }catch (Exception e){
                    sb.append("Số điện thoại chỉ được là số! \n");
                }
                if(SexCB.getSelectedItem().equals("chọn")) {
                    sb.append("Giới tính không được để trống! \n");
                }
                if (sb.length()>0) {
                    JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                while (rs.next()) {
                    if (rs.getString(1).equals(AccTF.getText()) && rs.getString(3).equalsIgnoreCase(NameTF.getText())&& rs.getString(4).equals(SexCB.getSelectedItem().toString()) && rs.getString(7).equals(SDTTF.getText()))
                    {
                        JPanel pn=new JPanel();
                        pn.setLayout(new GridLayout(2,2));
                        JPasswordField pw=new JPasswordField();
                        JLabel lb=new JLabel("Mật khẩu mới:");
                        pn.add(lb);
                        pn.add(pw);
                        int kt = JOptionPane.showConfirmDialog(this,pn,"Enter your new password:",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if (kt==0) {
                            PreparedStatement ps=cn.prepareStatement(sql);
                            ps.setString(1,String.valueOf(pw.getPassword()));
                            int n=ps.executeUpdate();
                            if(n!=0) {
                                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!");
                            }
                            else JOptionPane.showMessageDialog(this, "Đổi mật khẩu thất bại!");
                            return;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Đã hủy đổi mật khẩu!");
                            return;
                        }
                    }
                }
                JOptionPane.showMessageDialog(this, "Sai thông tin!");
            }
            catch (Exception e) {
                System.out.print("Ket noi khong thanh cong");
                e.printStackTrace();
            }
        }
        else {
            try {
                String sql1="select * from NHANVIEN";
                String sql="update NHANVIEN set pass=? where TKNV='"+AccTF.getText()+"'";
                stm=cn.createStatement();
                rs=stm.executeQuery(sql1);
                StringBuilder sb = new StringBuilder();
                if (MaNVTF.getText().equals("")) {
                    sb.append("Mã nhân viên không được để trống!");
                }
                if (NameTF.getText().equals("")) {
                    sb.append("Họ tên không được để trống! \n");
                }
                if (AccTF.getText().equals("")){
                    sb.append("Tên Tài khoản không được bỏ trống! \n");
                }
                if (SDTTF.getText().equals("")){
                    sb.append("Số điện thoại không được để trống! \n");
                }
                phone=SDTTF.getText();
                try{
                    Integer.parseInt(phone);
                    
                }catch (Exception e){
                    sb.append("Số điện thoại chỉ được là số! \n");
                }
                if(SexCB.getSelectedItem().equals("chọn")) {
                    sb.append("Giới tính không được để trống! \n");
                }
                if (sb.length()>0) {
                    JOptionPane.showMessageDialog(this, sb.toString(), "Invalidation",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                while (rs.next()) {
                    if (rs.getString(1).equals(MaNVTF.getText()) && rs.getString(2).equalsIgnoreCase(NameTF.getText())&& rs.getString(3).equals(AccTF.getText()) && rs.getString(5).equals(SexCB.getSelectedItem().toString()) && rs.getString(7).equals(SDTTF.getText()))
                    {
                        JPanel pn=new JPanel();
                        pn.setLayout(new GridLayout(2,2));
                        JPasswordField pw=new JPasswordField();
                        JLabel lb=new JLabel("Mật khẩu mới:");
                        pn.add(lb);
                        pn.add(pw);
                        int kt = JOptionPane.showConfirmDialog(this,pn,"Enter your new password:",JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if (kt==0) {
                            PreparedStatement ps=cn.prepareStatement(sql);
                            ps.setString(1,String.valueOf(pw.getPassword()));
                            int n=ps.executeUpdate();
                            if(n!=0) {
                                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!");
                            }
                            else JOptionPane.showMessageDialog(this, "Đổi mật khẩu thất bại!");
                            return;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Đã hủy đổi mật khẩu!");
                            return;
                        }
                    }
                }
                JOptionPane.showMessageDialog(this, "Sai thông tin!");    
            }
            catch (Exception e) {
                System.out.print("Ket noi khong thanh cong");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ForgetBTActionPerformed

    private void PosCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosCBActionPerformed
        if (PosCB.getSelectedItem().equals("Nhân viên")){
            pos=true;
            MaNVLB.setVisible(true);
            MaNVTF.setVisible(true);
        }
        else {
            pos=false;
            MaNVLB.setVisible(false);
            MaNVTF.setVisible(false);
        }
    }//GEN-LAST:event_PosCBActionPerformed

    private void LoginBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBTActionPerformed
        this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_LoginBTActionPerformed

    private void RegisterBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBTActionPerformed
        this.dispose();
        new Register().setVisible(true);
    }//GEN-LAST:event_RegisterBTActionPerformed

   
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
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccTF;
    private javax.swing.JButton ForgetBT;
    private javax.swing.JButton LoginBT;
    private javax.swing.JLabel MaNVLB;
    private javax.swing.JTextField MaNVTF;
    private javax.swing.JTextField NameTF;
    private javax.swing.JComboBox<String> PosCB;
    private javax.swing.JButton RegisterBT;
    private javax.swing.JTextField SDTTF;
    private javax.swing.JComboBox<String> SexCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
