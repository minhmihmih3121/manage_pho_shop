/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ConnectionDB;
import java.sql.*;
import javax.swing.*;
import model.CT_HOA_DON;

/**
 *
 * @author Admins
 */
public class GoiMon extends javax.swing.JDialog {

    /**
     * Creates new form GoiMon
     */
    String tenmon,

    /**
     * Creates new form GoiMon
     */
    mamon;
    int mahd;
    private GDKhach gdkhach;
    public GoiMon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        addInitComponent("M03");
        this.setLocationRelativeTo(null);
        this.setTitle("phở");
        gdkhach=(GDKhach) parent;
    }
    public GoiMon(java.awt.Frame parent, boolean modal, String mm, String tm, int mahd) {
        super(parent, modal);
        initComponents();
        addInitComponent(mm);
        this.setLocationRelativeTo(null);
        this.setTitle(tm);
        gdkhach=(GDKhach) parent;
        tenmon=tm;
        mamon=mm;
        this.mahd=mahd;
    }
    static ConnectionDB c =new ConnectionDB();
    Statement stm = null;
    ResultSet rs = null;
    String sql;
    Connection cn=c.getConnectionDB();
    private void addInitComponent(String mm) {      
        try {
            sql = "select * from THIT";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                MeatCB1.addItem(rs.getString(2));
                MeatCB2.addItem(rs.getString(2));
                MeatCB3.addItem(rs.getString(2));
                MeatCB4.addItem(rs.getString(2));
            }
            sql="select Loai from MON where maMon='"+mm+"'";
            rs=stm.executeQuery(sql);
            rs.next();
            if (rs.getInt(1)==0) {
                MeatCB1.setEnabled(false);
                MeatCB2.setEnabled(false);
                MeatCB3.setEnabled(false);
                MeatCB4.setEnabled(false);
            }
            else
            {
                if (rs.getInt(1)==2) {
                    MeatCB3.setEnabled(false);
                    MeatCB4.setEnabled(false);
                }
                else
                {
                    if (rs.getInt(1)==3) {
                        MeatCB4.setEnabled(false);
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        MeatPN.add(MeatLB1);
        MeatPN.add(MeatCB1);
        MeatPN.add(MeatLB2);
        MeatPN.add(MeatCB2);
        MeatPN.add(MeatLB3);
        MeatPN.add(MeatCB3);
        MeatPN.add(MeatLB4);
        MeatPN.add(MeatCB4);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SoluongSN = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NoteTA = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        MeatPN = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        SoluongSN.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Số lượng:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Gọi món");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoluongSN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SoluongSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NoteTA.setColumns(20);
        NoteTA.setRows(5);
        jScrollPane1.setViewportView(NoteTA);

        jLabel1.setText("Ghi chú món ăn:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MeatPN.setLayout(new java.awt.GridLayout(4, 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MeatPN, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MeatPN, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            sql = "select Gia from Mon where maMon='"+mamon+"'";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            rs.next();
            CT_HOA_DON ct= new CT_HOA_DON(tenmon,mamon,mahd,String.valueOf(MeatCB1.getSelectedItem()),String.valueOf(MeatCB2.getSelectedItem()),
                String.valueOf(MeatCB3.getSelectedItem()),String.valueOf(MeatCB4.getSelectedItem()),getSL(),rs.getInt(1),getNote());
            gdkhach.addCtHoaDon(ct);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GoiMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoiMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoiMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoiMon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GoiMon dialog = new GoiMon(new javax.swing.JFrame(), true);
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
    public int getSL() {
        return (int)SoluongSN.getValue();
    }
    public String getNote() {
        return NoteTA.getText();
    }
    public String getThit1() {
        return String.valueOf(MeatCB1.getSelectedItem());
    }
    public String getThit2() {
        return String.valueOf(MeatCB2.getSelectedItem());
    }
    public String getThit3() {
        return String.valueOf(MeatCB3.getSelectedItem());
    }
    public String getThit4() {
        return String.valueOf(MeatCB4.getSelectedItem());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MeatPN;
    private javax.swing.JTextArea NoteTA;
    private javax.swing.JSpinner SoluongSN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    JComboBox MeatCB1 = new JComboBox();
    JComboBox MeatCB2 = new JComboBox();
    JComboBox MeatCB3 = new JComboBox();
    JComboBox MeatCB4 = new JComboBox();
    JLabel MeatLB1 = new JLabel("Loại thịt 1:");
    JLabel MeatLB2 = new JLabel("Loại thịt 2:");
    JLabel MeatLB3 = new JLabel("Loại thịt 3:");
    JLabel MeatLB4 = new JLabel("Loại thịt 4:");
}
