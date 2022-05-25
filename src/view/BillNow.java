/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.CT_HOA_DON;
import model.HoaDon;
public class BillNow extends javax.swing.JFrame {
    
    private List<CT_HOA_DON> cthoadon = new ArrayList<CT_HOA_DON>();
    HoaDon hd;
    static ConnectionDB c =new ConnectionDB();
    Connection cn=c.getConnectionDB();
    Statement stm = null;
    ResultSet rs = null;
    String sql;
    DefaultTableModel dtm=new DefaultTableModel(){
    @Override
    public boolean isCellEditable(int row, int column) {
       return false;
    }
    };
    public BillNow() {
        initComponents();
        addComponents();
        this.setLocationRelativeTo(null);
    }
    public BillNow(HoaDon a) {
        initComponents();
        addComponents();
        this.setLocationRelativeTo(null);
        hd=a;
        MaHDLB.setText(String.valueOf(hd.getMaHD()));
        SoBanLB.setText(String.valueOf(hd.getSoBan()));
        MaNVLB.setText(hd.getMaNV());
        TKKHLB.setText(hd.getTKKH());
        try {
            sql="select TenKH,BacVip from KHACHHANG where TKKH='"+hd.getTKKH()+"'";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            rs.next();
            TenKHLB.setText(rs.getString(1));
            VipLB.setText(rs.getString(2));
            TimeLB.setText(hd.getTg().toString());
            TienLB.setText(hd.getTongtien()+"VNĐ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addComponents() {
        dtm.addColumn("Tên món");
        dtm.addColumn("SL");
        dtm.addColumn("Giá");
        dtm.addColumn("Thịt");
        dtm.addColumn("Ghi chú");
        ShowTB.setModel(dtm);
        ShowTB.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        ShowTB.getColumnModel().getColumn(0).setPreferredWidth(100);
        ShowTB.getColumnModel().getColumn(1).setPreferredWidth(50);
        ShowTB.getColumnModel().getColumn(2).setPreferredWidth(70);
        ShowTB.getColumnModel().getColumn(3).setPreferredWidth(140);
        ShowTB.getColumnModel().getColumn(4).setPreferredWidth(90);
        ttBT.setEnabled(false);
    }
    public void UpdateTable(GDKhach t,HoaDon a) {
        List<CT_HOA_DON> cthd = t.getCTHoaDon();
        for (CT_HOA_DON ct: cthd){
            cthoadon.add(ct);
        }
        dtm.setRowCount(0); 
        String temp;
        for (CT_HOA_DON ct: cthoadon) {
            temp="";
            if(!ct.getThit1().equals("Không")){
                temp+=ct.getThit1()+","+ct.getThit2();
            }
            if(!ct.getThit3().equals("Không")){
                temp+=","+ct.getThit3();
            }
            if(!ct.getThit4().equals("Không")){
                temp+=","+ct.getThit4();
            }
            dtm.addRow(new Object[]{ct.getTenMon(),ct.getSl(),ct.getGia(),temp,ct.getNote()});
        }
        TienLB.setText(a.getTongtien()+"VNĐ");
        ttBT.setEnabled(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShowTB = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MaHDLB = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SoBanLB = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        MaNVLB = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TenKHLB = new javax.swing.JLabel();
        TKKHLB = new javax.swing.JLabel();
        VipLB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TimeLB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TienLB = new javax.swing.JLabel();
        ttBT = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        ShowTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên món", "Số lượng", "Giá", "Loại thịt", "Ghi chú"
            }
        ));
        jScrollPane1.setViewportView(ShowTB);
        if (ShowTB.getColumnModel().getColumnCount() > 0) {
            ShowTB.getColumnModel().getColumn(0).setPreferredWidth(80);
            ShowTB.getColumnModel().getColumn(1).setPreferredWidth(50);
            ShowTB.getColumnModel().getColumn(2).setPreferredWidth(60);
            ShowTB.getColumnModel().getColumn(3).setPreferredWidth(120);
        }

        jLabel1.setFont(new java.awt.Font("UVF Reina 12 Pro", 1, 20)); // NOI18N
        jLabel1.setText("Phở SWING");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Mã hóa đơn:");

        MaHDLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Số bàn:");

        SoBanLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Mã nhân viên:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tên khách hàng:");

        MaNVLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("TK:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Bậc Vip:");

        TenKHLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TKKHLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        VipLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Tổng tiền:");

        TimeLB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Thời gian:");

        TienLB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ttBT.setText("Thanh toán");
        ttBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SoBanLB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MaNVLB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TenKHLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TKKHLB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VipLB, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaHDLB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TimeLB, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TienLB, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(ttBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MaHDLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(TimeLB)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SoBanLB)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(MaNVLB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TenKHLB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(TKKHLB)
                    .addComponent(VipLB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TienLB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ttBT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ttBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttBTActionPerformed
        this.dispose();
        JOptionPane.showMessageDialog(this, "Thanh toán thành công!");
        ttBT.setEnabled(false);
        
    }//GEN-LAST:event_ttBTActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillNow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillNow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillNow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillNow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillNow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MaHDLB;
    private javax.swing.JLabel MaNVLB;
    private javax.swing.JTable ShowTB;
    private javax.swing.JLabel SoBanLB;
    private javax.swing.JLabel TKKHLB;
    private javax.swing.JLabel TenKHLB;
    private javax.swing.JLabel TienLB;
    private javax.swing.JLabel TimeLB;
    private javax.swing.JLabel VipLB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ttBT;
    // End of variables declaration//GEN-END:variables
}
