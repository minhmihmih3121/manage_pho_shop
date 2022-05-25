/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Admins
 */
public class QuestBan extends javax.swing.JDialog {

    /**
     * Creates new form Quest1
     */
    public QuestBan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        RCMBT.setVisible(false);
        PeopleSN.setVisible(false);
        QuestLB.setVisible(false);
        BanCB.setVisible(false);
        SobanLB.setVisible(false);
        ConfirmBT.setVisible(false);
    }
    static ConnectionDB kn=new ConnectionDB();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NoBT = new javax.swing.JButton();
        YesBT = new javax.swing.JButton();
        QuestLB = new javax.swing.JLabel();
        PeopleSN = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        RCMBT = new javax.swing.JButton();
        SobanLB = new javax.swing.JLabel();
        BanCB = new javax.swing.JComboBox<>();
        ConfirmBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("UVF BankGothic Md BT", 1, 18)); // NOI18N
        jLabel1.setText("Quý khách đã đặt bàn sẵn chưa?");

        NoBT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NoBT.setText("Chưa đặt");
        NoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoBTActionPerformed(evt);
            }
        });

        YesBT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        YesBT.setText("Đã đặt rồi");
        YesBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesBTActionPerformed(evt);
            }
        });

        QuestLB.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        QuestLB.setText("Nhóm của bạn tất cả bao nhiêu người?");

        PeopleSN.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));

        RCMBT.setText("Xếp bàn");
        RCMBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCMBTActionPerformed(evt);
            }
        });

        SobanLB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SobanLB.setText("Bàn số:");

        BanCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn" }));

        ConfirmBT.setText("Xác nhận");
        ConfirmBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(SobanLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BanCB, 0, 74, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ConfirmBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RCMBT))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RCMBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BanCB)
                            .addComponent(SobanLB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addComponent(ConfirmBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(YesBT, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(QuestLB)
                            .addGap(18, 18, 18)
                            .addComponent(PeopleSN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YesBT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoBT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuestLB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PeopleSN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoBTActionPerformed
        RCMBT.setVisible(true);
        PeopleSN.setVisible(true);
        QuestLB.setVisible(true);
        BanCB.setVisible(false);
        SobanLB.setVisible(false);
        ConfirmBT.setVisible(false);
    }//GEN-LAST:event_NoBTActionPerformed
    int min,sb,temp;
    private void RCMBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCMBTActionPerformed
        Connection cn=kn.getConnectionDB();
        Statement stm = null;
        ResultSet rs = null;
        min=20;
        sb=0;
        temp=0;
        String sql = "select * from BAN";
        try {
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            int songuoi=(int)PeopleSN.getValue();
            if(songuoi==2){
                while (rs.next()) {
                    if (rs.getInt(3)==songuoi && rs.getString(2).equals("N")){
                        sql="update BAN set conlai=? where SoBan="+rs.getString(1);
                        PreparedStatement ps=cn.prepareStatement(sql);
                        ps.setInt(1,0);
                        int n=ps.executeUpdate();
                        if (n==0) {
                            JOptionPane.showMessageDialog(this,"Chọn bàn "+rs.getString(1)+" bị lỗi!");
                        }
                        else {
                        JOptionPane.showMessageDialog(this,"Bàn "+rs.getString(1)+" phù hợp nhất với quý khách! Xin mời vào bàn");
                        sb=rs.getInt(1);
                        this.dispose();
                        return;
                        }
                    }
                    else {
                        temp=rs.getInt(3)-songuoi;
                        if (temp<min && temp>0){
                            sb=rs.getInt(1);
                            min=temp;
                        }
                    }
                }
            }
            else
            {
                while (rs.next()) {
                    if (rs.getInt(3)==songuoi){
                        sql="update BAN set conlai=? where SoBan="+rs.getString(1);
                        PreparedStatement ps=cn.prepareStatement(sql);
                        ps.setInt(1,0);
                        int n=ps.executeUpdate();
                        if (n==0) {
                            JOptionPane.showMessageDialog(this,"Chọn bàn "+rs.getString(1)+" bị lỗi!");
                        }
                        else {
                        JOptionPane.showMessageDialog(this,"Bàn "+rs.getString(1)+" phù hợp nhất với quý khách! Xin mời vào bàn");
                        sb=rs.getInt(1);
                        this.dispose();
                        return;
                        }
                    }
                    else {
                        temp=rs.getInt(3)-songuoi;
                        if (temp<min && temp>0){
                            sb=rs.getInt(1);
                            min=temp;
                        }
                    }
                }
            }
            if (sb!=0){
                sql="update BAN set conlai=? where SoBan="+sb;
                PreparedStatement ps=cn.prepareStatement(sql);
                ps.setInt(1,min);
                int n=ps.executeUpdate();
                if (n==0) {
                    JOptionPane.showMessageDialog(this,"Chọn bàn "+sb+" bị lỗi!");
                }
                else {
                    JOptionPane.showMessageDialog(this,"Bàn "+sb+" phù hợp nhất với quý khách! Xin mời vào bàn");
                    this.dispose();
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Hiện không có bàn trống!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_RCMBTActionPerformed

    private void YesBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesBTActionPerformed
        RCMBT.setVisible(false);
        PeopleSN.setVisible(false);
        QuestLB.setVisible(false);
        BanCB.setVisible(true);
        SobanLB.setVisible(true);
        ConfirmBT.setVisible(true);
        Connection c=kn.getConnectionDB();
        Statement stm = null;
        ResultSet rs = null;
        String sql;
        try {
            sql = "select SoBan from Ban";
            stm=c.createStatement();
            rs=stm.executeQuery(sql);
            while(rs.next()){
                    BanCB.addItem(rs.getString(1));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_YesBTActionPerformed

    private void ConfirmBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBTActionPerformed
        Connection cn=kn.getConnectionDB();
        String sql;
        int temp;
        Statement stm = null;
        ResultSet rs = null;
        if(BanCB.getSelectedItem().equals("Chọn")) {
            JOptionPane.showMessageDialog(this,"Số bàn có sẵn không được bỏ trống!");
            return;
        }
        sb=Integer.parseInt(BanCB.getSelectedItem().toString());
        try {
            sql = "select conlai from Ban where SoBan="+sb;
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            rs.next();
            temp=rs.getInt(1)-(int)PeopleSN.getValue();
            if(temp<0){
                temp=0;
            }
            JOptionPane.showMessageDialog(this,"Chọn bàn thành công! Xin mời vào bàn "+sb);
            this.dispose();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ConfirmBTActionPerformed
    public int getSB() {
        return sb;
    }
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
            java.util.logging.Logger.getLogger(QuestBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuestBan dialog = new QuestBan(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BanCB;
    private javax.swing.JButton ConfirmBT;
    private javax.swing.JButton NoBT;
    private javax.swing.JSpinner PeopleSN;
    private javax.swing.JLabel QuestLB;
    private javax.swing.JButton RCMBT;
    private javax.swing.JLabel SobanLB;
    private javax.swing.JButton YesBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
