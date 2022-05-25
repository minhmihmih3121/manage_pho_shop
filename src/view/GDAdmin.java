 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ConnectionDB;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Ban;
import model.HoaDon;
import model.KhachHang;
import model.Mon;
import model.NhanVien;
import model.Thit;

/**
 *
 * @author Admins
 */
public class GDAdmin extends javax.swing.JFrame {
    static ConnectionDB c=new ConnectionDB();
    Connection cn=c.getConnectionDB();
    Statement stm=null;
    ResultSet rs=null;
    String sql;
    String acc;
    int slt=-1;
    String Now = "";
    Boolean QL=false;
    int n = 0;
    DefaultTableModel dtm=new DefaultTableModel(){
    @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    public GDAdmin() {
        acc="tentaikhoan";
        initComponents();
        addComponents();
        this.setLocationRelativeTo(null);
    }
    public GDAdmin(String acc) {
        initComponents();
        this.acc=acc;
        addComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        HelloLB = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LogoutBT = new javax.swing.JButton();
        DTBT = new javax.swing.JButton();
        QLBanBT = new javax.swing.JButton();
        QLMonAnBT = new javax.swing.JButton();
        QLKhachHangBT = new javax.swing.JButton();
        QLHoaDonBT = new javax.swing.JButton();
        QLNhanVienBT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        QLThitBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShowTB = new javax.swing.JTable();
        FindTF = new javax.swing.JTextField();
        TimeCB = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        AddAccBT = new javax.swing.JButton();
        AddBT = new javax.swing.JButton();
        EditBT = new javax.swing.JButton();
        DeleteBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(253, 253, 226));

        HelloLB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        HelloLB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        LogoutBT.setText("Đăng xuất");
        LogoutBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBTActionPerformed(evt);
            }
        });

        DTBT.setText("QL DOANH THU");
        DTBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DTBTActionPerformed(evt);
            }
        });

        QLBanBT.setText("QL BÀN");
        QLBanBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLBanBTActionPerformed(evt);
            }
        });

        QLMonAnBT.setText("QL MÓN ĂN");
        QLMonAnBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLMonAnBTActionPerformed(evt);
            }
        });

        QLKhachHangBT.setText("QL KHÁCH HÀNG");
        QLKhachHangBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLKhachHangBTActionPerformed(evt);
            }
        });

        QLHoaDonBT.setText("QL HÓA ĐƠN");
        QLHoaDonBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLHoaDonBTActionPerformed(evt);
            }
        });

        QLNhanVienBT.setText("QL NHÂN VIÊN");
        QLNhanVienBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLNhanVienBTActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled.png"))); // NOI18N

        QLThitBT.setText("QL LOẠI THỊT");
        QLThitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLThitBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(QLThitBT, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(QLNhanVienBT, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(QLHoaDonBT, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(QLKhachHangBT, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(QLMonAnBT, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(QLBanBT, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DTBT, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LogoutBT, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QLHoaDonBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QLKhachHangBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QLMonAnBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QLThitBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QLBanBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QLNhanVienBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DTBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(LogoutBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        ShowTB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShowTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ShowTB.setToolTipText("");
        ShowTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ShowTBMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(ShowTB);

        FindTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FindTFKeyReleased(evt);
            }
        });

        TimeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày", "Tháng", "Năm" }));
        TimeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeCBActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(253, 253, 226));
        jPanel3.setLayout(new java.awt.GridLayout(1, 4, 15, 0));

        AddAccBT.setText("Tạo tài khoản NV");
        AddAccBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAccBTActionPerformed(evt);
            }
        });
        jPanel3.add(AddAccBT);

        AddBT.setText("Thêm");
        AddBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBTActionPerformed(evt);
            }
        });
        jPanel3.add(AddBT);

        EditBT.setText("Sửa");
        EditBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBTActionPerformed(evt);
            }
        });
        jPanel3.add(EditBT);

        DeleteBT.setText("Xóa");
        DeleteBT.setPreferredSize(new java.awt.Dimension(75, 23));
        DeleteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTActionPerformed(evt);
            }
        });
        jPanel3.add(DeleteBT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(TimeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(FindTF, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HelloLB, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(HelloLB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FindTF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TimeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
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
    private void addComponents() {
        ShowTB.setModel(dtm);
        AddAccBT.setVisible(false);
        TimeCB.setVisible(false);
        try {
            sql="select TenNV,ViTri from NHANVIEN where TKNV='"+acc+"'";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            rs.next();
            if (rs.getString(2).equals("Quản Lí")) {
                QL=true;
            }
            HelloLB.setText("Xin chào! "+rs.getString(1)+" ("+rs.getString(2)+")");
        } catch (Exception e) {
            e.printStackTrace();
        }
        QLNhanVienBT.setVisible(QL);
        DTBT.setVisible(QL);
    }
    private void LogoutBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBTActionPerformed
        this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_LogoutBTActionPerformed
    
   
    private void QLMonAnBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLMonAnBTActionPerformed
        Now="mon";
        setEn();
        AddAccBT.setVisible(false);
        TimeCB.setVisible(false);
        dtm.setColumnCount(0);
        dtm.addColumn("Mã món ăn");
        dtm.addColumn("Tên món ăn");
        dtm.addColumn("Thịt kèm theo");
        dtm.addColumn("Giá");
        ShowTB.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);   
        ShowTB.getColumnModel().getColumn(0).setPreferredWidth(120);
        ShowTB.getColumnModel().getColumn(1).setPreferredWidth(252);
        ShowTB.getColumnModel().getColumn(2).setPreferredWidth(150);
        ShowTB.getColumnModel().getColumn(3).setPreferredWidth(170);
        UDMon();
    }//GEN-LAST:event_QLMonAnBTActionPerformed

    private void QLHoaDonBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLHoaDonBTActionPerformed
        Now="hd";
        slt=-1;
        setEn();
        AddAccBT.setVisible(false);
        TimeCB.setVisible(false);
        dtm.setColumnCount(0);
        dtm.addColumn("Mã HĐ");
        dtm.addColumn("Số bàn");
        dtm.addColumn("Mã NV");
        dtm.addColumn("TKKH");
        dtm.addColumn("Tổng tiền(vnđ)");
        dtm.addColumn("Thời gian(yyyy-mm-dd)");
        ShowTB.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        ShowTB.getColumnModel().getColumn(0).setPreferredWidth(80);
        ShowTB.getColumnModel().getColumn(1).setPreferredWidth(80);
        ShowTB.getColumnModel().getColumn(2).setPreferredWidth(90);
        ShowTB.getColumnModel().getColumn(3).setPreferredWidth(160);
        ShowTB.getColumnModel().getColumn(4).setPreferredWidth(160);
        ShowTB.getColumnModel().getColumn(5).setPreferredWidth(122);
        UDHD();
    }//GEN-LAST:event_QLHoaDonBTActionPerformed
        
    private void QLKhachHangBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLKhachHangBTActionPerformed
        Now="kh";
        setEn();
        AddAccBT.setVisible(false);
        TimeCB.setVisible(false);
        dtm.setColumnCount(0);
        dtm.addColumn("Tên KH");
        dtm.addColumn("Tài khoản");
        dtm.addColumn("Mật khẩu");
        dtm.addColumn("Giới tính");
        dtm.addColumn("Điểm");
        dtm.addColumn("Bậc VIP");
        dtm.addColumn("SĐT");
        ShowTB.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        ShowTB.getColumnModel().getColumn(0).setPreferredWidth(120);
        ShowTB.getColumnModel().getColumn(1).setPreferredWidth(100);
        ShowTB.getColumnModel().getColumn(2).setPreferredWidth(100);
        ShowTB.getColumnModel().getColumn(3).setPreferredWidth(80);
        ShowTB.getColumnModel().getColumn(4).setPreferredWidth(80);
        ShowTB.getColumnModel().getColumn(5).setPreferredWidth(80);
        ShowTB.getColumnModel().getColumn(6).setPreferredWidth(132);
        UDKH();
    }//GEN-LAST:event_QLKhachHangBTActionPerformed

    private void QLBanBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLBanBTActionPerformed
        Now="ban";
        setEn();
        AddAccBT.setVisible(false);
        TimeCB.setVisible(false);
        dtm.setColumnCount(0);
        dtm.addColumn("Số bàn");
        dtm.addColumn("Loại bàn");
        dtm.addColumn("Số ghế trống");
        ShowTB.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        ShowTB.getColumnModel().getColumn(0).setPreferredWidth(220);
        ShowTB.getColumnModel().getColumn(1).setPreferredWidth(252);
        ShowTB.getColumnModel().getColumn(2).setPreferredWidth(220);
        UDBan();
    }//GEN-LAST:event_QLBanBTActionPerformed

    private void QLNhanVienBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLNhanVienBTActionPerformed
        Now="nv";
        setEn();
        AddAccBT.setVisible(true);
        TimeCB.setVisible(false);
        dtm.setColumnCount(0);
        dtm.addColumn("Mã NV");
        dtm.addColumn("Tên NV");
        dtm.addColumn("Tài khoản");
        dtm.addColumn("Mật khẩu");
        dtm.addColumn("Giới tính");
        dtm.addColumn("Chức vụ");
        dtm.addColumn("SĐT");
        ShowTB.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        ShowTB.getColumnModel().getColumn(0).setPreferredWidth(60);
        ShowTB.getColumnModel().getColumn(1).setPreferredWidth(130);
        ShowTB.getColumnModel().getColumn(2).setPreferredWidth(110);
        ShowTB.getColumnModel().getColumn(3).setPreferredWidth(90);
        ShowTB.getColumnModel().getColumn(4).setPreferredWidth(90);
        ShowTB.getColumnModel().getColumn(5).setPreferredWidth(90);
        ShowTB.getColumnModel().getColumn(6).setPreferredWidth(122);
        UDNV();
    }//GEN-LAST:event_QLNhanVienBTActionPerformed

    private void QLThitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLThitBTActionPerformed
        Now="t";
        setEn();
        AddAccBT.setVisible(false);
        TimeCB.setVisible(false);
        dtm.setColumnCount(0);
        dtm.addColumn("Mã thịt");
        dtm.addColumn("Loại thịt");
        dtm.addColumn("Còn lại(đơn vị)");
        ShowTB.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        ShowTB.getColumnModel().getColumn(0).setPreferredWidth(210);
        ShowTB.getColumnModel().getColumn(1).setPreferredWidth(272);
        ShowTB.getColumnModel().getColumn(2).setPreferredWidth(210);
        UDThit();
    }//GEN-LAST:event_QLThitBTActionPerformed
    private void UDNV() {
        dtm.setRowCount(0);
        try {
            sql="select * from NHANVIEN";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),});
            }
        } catch (Exception e) {
        }
    }
    private void UDKH() {
        dtm.setRowCount(0);
        try {
            sql="select * from KHACHHANG";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(3),rs.getString(1),rs.getString(2),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7)});
            }
        } catch (Exception e) {
        }
    }
    private void UDMon() {
        dtm.setRowCount(0);
        try {
            sql="select * from MON";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4)});
            }
        } catch (Exception e) {
        }
    }
    private void UDThit() {
        dtm.setRowCount(0);
        try {
            sql="select * from THIT";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getInt(3)});
            }
        } catch (Exception e) {
        }
    }
    private void UDBan() {
        dtm.setRowCount(0);
        try {
            sql="select * from BAN";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
            }
        } catch (Exception e) {
        }
    }
    private void UDHD() {
        dtm.setRowCount(0);
        try {
            sql="select * from HOADON";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6)});
            }
        } catch (Exception e) {
        }
    }
    
    private void DTBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DTBTActionPerformed
        AddBT.setEnabled(false);
        EditBT.setEnabled(false);
        DeleteBT.setEnabled(false);
        AddAccBT.setVisible(false);
        TimeCB.setVisible(true);
        dtm.setColumnCount(0);
        dtm.setRowCount(0);
        dtm.addColumn("Thời gian(yyyy-mm-dd)");
        dtm.addColumn("Doanh thu(vnđ)");
        ShowTB.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        ShowTB.getColumnModel().getColumn(0).setPreferredWidth(200);
        ShowTB.getColumnModel().getColumn(1).setPreferredWidth(492);
        TimeCB.setSelectedItem("Ngày");
    }//GEN-LAST:event_DTBTActionPerformed
    private void setEn() {
        AddBT.setEnabled(true);
        EditBT.setEnabled(true);
        DeleteBT.setEnabled(true);
    }
    
    private void TimeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeCBActionPerformed
        if(TimeCB.getSelectedItem().equals("Ngày")){
            dtm.setRowCount(0);
            try {
            sql="select concat(year(thoigian),'-',month(thoigian),'-',day(thoigian)),sum(ThanhTien) from HOADON group by year(thoigian),month(thoigian),day(thoigian)";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(1),rs.getInt(2)});
            }
            } catch (Exception e) {
            }
        }
        else {
            if(TimeCB.getSelectedItem().equals("Tháng")) {
                dtm.setRowCount(0);
                try {
                    sql="select concat(year(thoigian),'-',month(thoigian)),sum(ThanhTien) from HOADON group by year(thoigian),month(thoigian)";
                    stm=cn.createStatement();
                    rs=stm.executeQuery(sql);
                    while (rs.next()) {
                        dtm.addRow(new Object[]{rs.getString(1),rs.getInt(2)});
                    }
                } catch (Exception e) {
                }
            }
            else {
                dtm.setRowCount(0);
                try {
                    sql="select year(thoigian),sum(ThanhTien) from HOADON group by year(thoigian)";
                    stm=cn.createStatement();
                    rs=stm.executeQuery(sql);
                    while (rs.next()) {
                        dtm.addRow(new Object[]{rs.getString(1),rs.getInt(2)});
                    }
                } catch (Exception e) {
                }
            }
        }
    
    }//GEN-LAST:event_TimeCBActionPerformed

    private void FindTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FindTFKeyReleased
        String query = FindTF.getText();
        Filter(query);
    }//GEN-LAST:event_FindTFKeyReleased
    private void Filter(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        ShowTB.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    private void AddBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBTActionPerformed
        try {
            if(Now.equals("kh")) {
                ThemKH n = new ThemKH(this,true);
                n.setLocationRelativeTo(null);
                n.setTitle("Thêm khách hàng");
                n.setVisible(true);
                UDKH();
            }
            if(Now.equals("nv")) {
                ThemNV n = new ThemNV(this,true);
                n.setLocationRelativeTo(null);
                n.setTitle("Thêm nhân viên");
                n.setVisible(true);
                UDNV();
            }
            if(Now.equals("hd")) {
                String str = "";
                boolean kt=false;
                str = JOptionPane.showInputDialog(this,"Hãy nhập tài khoản khách hàng");
                if (!str.equals("")){
                sql="select TKKH from KHACHHANG";
                stm=cn.createStatement();
                rs=stm.executeQuery(sql);
                while(rs.next()) {
                    if (rs.getString(1).equals(str)) {
                        kt=true;
                }
                }
                if (kt){
                    GDKhach n = new GDKhach(str);
                    n.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    n.setVisible(true);
                }
                else 
                    JOptionPane.showMessageDialog(this,"Tài khoản khách hàng không tồn tại!","Invalidation",JOptionPane.ERROR_MESSAGE);
                }
            }
            if(Now.equals("t")) {
                ThemThit n = new ThemThit(this,true);
                n.setLocationRelativeTo(null);
                n.setTitle("Thêm loại thịt");
                UDThit();
            }
            if(Now.equals("ban")) {
                ThemBan n = new ThemBan(this,true);
                n.setLocationRelativeTo(null);
                n.setTitle("Thêm bàn");
                UDBan();
            }
            if(Now.equals("mon")) {
                ThemMon n = new ThemMon(this,true);
                n.setLocationRelativeTo(null);
                n.setVisible(true);
                n.setTitle("Thêm món");
                UDMon();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_AddBTActionPerformed

    private void EditBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBTActionPerformed
        try {
            int t=ShowTB.getSelectedRow();
            if(Now.equals("kh")) {
                KhachHang kh=new KhachHang(String.valueOf(ShowTB.getValueAt(t, 1)),String.valueOf(ShowTB.getValueAt(t, 2)),String.valueOf(ShowTB.getValueAt(t, 0)),String.valueOf(ShowTB.getValueAt(t, 3)),Integer.parseInt(ShowTB.getValueAt(t, 4).toString()),String.valueOf(ShowTB.getValueAt(t, 6)));
                SuaKH n = new SuaKH(this,true,kh);
                n.setLocationRelativeTo(null);
                n.setTitle("Sửa khách hàng");
                n.setVisible(true);
                UDKH();
            }
            if(Now.equals("nv")) {
                NhanVien nv=new NhanVien((String.valueOf(ShowTB.getValueAt(t, 0))),(String.valueOf(ShowTB.getValueAt(t, 1))),(String.valueOf(ShowTB.getValueAt(t, 2))),(String.valueOf(ShowTB.getValueAt(t, 3))),(String.valueOf(ShowTB.getValueAt(t, 4))),(String.valueOf(ShowTB.getValueAt(t, 6))),(String.valueOf(ShowTB.getValueAt(t, 5))));
                SuaNV n = new SuaNV(this,true,nv);
                n.setLocationRelativeTo(null);
                n.setTitle("Sửa nhân viên");
                n.setVisible(true);
                UDNV();
            }
            if(Now.equals("hd")) {
                HoaDon hdd = new HoaDon(Integer.parseInt(ShowTB.getValueAt(t, 0).toString()),Integer.parseInt(ShowTB.getValueAt(t, 1).toString()),String.valueOf(ShowTB.getValueAt(t, 2)),String.valueOf(ShowTB.getValueAt(t, 3)),Integer.parseInt((ShowTB.getValueAt(t, 4).toString())),Date.valueOf(ShowTB.getValueAt(t, 5).toString()));
                SuaHD n = new SuaHD(this,true,hdd);
                n.setLocationRelativeTo(null);
                n.setTitle("Sửa hóa đơn");
                n.setVisible(true);
                UDHD();
            }
            if(Now.equals("t")) {
                Thit thit=new Thit(String.valueOf(ShowTB.getValueAt(t, 0)),(String.valueOf(ShowTB.getValueAt(t, 1))),Integer.parseInt(ShowTB.getValueAt(t, 2).toString()));
                SuaThit n = new SuaThit(this,true,thit);
                n.setLocationRelativeTo(null);
                n.setTitle("Sửa loại thịt");
                n.setVisible(true);
                UDThit();
            }
            if(Now.equals("ban")) {
                Ban b = new Ban(Integer.parseInt(ShowTB.getValueAt(t, 0).toString()),(String.valueOf(ShowTB.getValueAt(t, 1))),Integer.parseInt(ShowTB.getValueAt(t, 2).toString()));
                SuaBan n = new SuaBan(this,true,b);
                n.setLocationRelativeTo(null);
                n.setTitle("Sửa bàn");
                n.setVisible(true);
                UDBan();
            }
            if(Now.equals("mon")) {
                Mon m=new Mon(ShowTB.getValueAt(t, 0).toString(),String.valueOf(ShowTB.getValueAt(t, 1)),Integer.parseInt(ShowTB.getValueAt(t, 2).toString()),Integer.parseInt(ShowTB.getValueAt(t, 3).toString()));
                SuaMon n = new SuaMon(this,true,m);
                n.setLocationRelativeTo(null);
                n.setTitle("Sửa món");
                n.setVisible(true);
                UDMon();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_EditBTActionPerformed

    private void DeleteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTActionPerformed
        try {
            int t=ShowTB.getSelectedRow();
            String str;
            if(Now.equals("hd")) {
                str=String.valueOf(ShowTB.getValueAt(t,0));
                sql="delete from CT_HOA_DON where MaHD="+str;
                PreparedStatement ps=cn.prepareStatement(sql);
                ps.executeUpdate();
                sql="delete from HOADON where MaHD="+str;
                ps=cn.prepareStatement(sql);
                int n=ps.executeUpdate();
                if (n!=0) {
                    JOptionPane.showMessageDialog(this, "Xóa hóa đơn thành công!");
                }
                UDHD();
            }
            if(Now.equals("nv")) {
                str=String.valueOf(ShowTB.getValueAt(t,0));
                sql="delete from NHANVIEN where MaNV='"+str+"'";
                PreparedStatement ps=cn.prepareStatement(sql);
                int n=ps.executeUpdate();
                if (n!=0) {
                    JOptionPane.showMessageDialog(this, "Xóa nhân viên thành công!");
                }
                UDNV();
            }
            if(Now.equals("kh")) {
                str=String.valueOf(ShowTB.getValueAt(t,1));
                sql="delete from KHACHHANG where TKKH='"+str+"'";
                PreparedStatement ps=cn.prepareStatement(sql);
                int n=ps.executeUpdate();
                if (n!=0) {
                    JOptionPane.showMessageDialog(this, "Xóa khách hàng thành công!");
                }
                UDKH();
            }
            if(Now.equals("t")) {
                str=String.valueOf(ShowTB.getValueAt(t,0));
                sql="delete from THIT where MaTHIT='"+str+"'";
                PreparedStatement ps=cn.prepareStatement(sql);
                int n=ps.executeUpdate();
                if (n!=0) {
                    JOptionPane.showMessageDialog(this, "Xóa loại thịt thành công!");
                }
                UDThit();
            }
            if(Now.equals("ban")) {
                str=String.valueOf(ShowTB.getValueAt(t,0));
                sql="delete from BAN where SoBan="+str;
                PreparedStatement ps=cn.prepareStatement(sql);
                int n=ps.executeUpdate();
                if (n!=0) {
                    JOptionPane.showMessageDialog(this, "Xóa bàn thành công!");
                }
                UDBan();
            }
            if(Now.equals("mon")) {
                str=String.valueOf(ShowTB.getValueAt(t,0));
                sql="delete from MON where maMon='"+str+"'";
                PreparedStatement ps=cn.prepareStatement(sql);
                int n=ps.executeUpdate();
                if (n!=0) {
                    JOptionPane.showMessageDialog(this, "Xóa món thành công!");
                }
                UDMon();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Hãy chọn dòng muốn xóa!");
        }
    }//GEN-LAST:event_DeleteBTActionPerformed

    private void ShowTBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowTBMousePressed
        if (Now.equals("hd")){
        try {
            int t=ShowTB.getSelectedRow();
            if (t==slt) {
                new CTHoaDon((ShowTB.getValueAt(t,0)).toString()).setVisible(true);}
            else
                slt=t;
        } catch (Exception e) {
        }
        }
    }//GEN-LAST:event_ShowTBMousePressed

    private void AddAccBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAccBTActionPerformed
        int t=ShowTB.getSelectedRow();
        if(ShowTB.getValueAt(t, 2).equals("none")) {
            AddAcc n=new AddAcc(this,true,String.valueOf(ShowTB.getValueAt(t,0)));
            n.setTitle("Thêm tài khoản nhân viên");
            n.setLocationRelativeTo(null);
            n.setVisible(true);
            UDNV();
        }
        else {
            JOptionPane.showMessageDialog(this,"Nhân viên này đã có tài khoản!","Invalidation",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_AddAccBTActionPerformed

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
            java.util.logging.Logger.getLogger(GDAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDAdmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAccBT;
    private javax.swing.JButton AddBT;
    private javax.swing.JButton DTBT;
    private javax.swing.JButton DeleteBT;
    private javax.swing.JButton EditBT;
    private javax.swing.JTextField FindTF;
    private javax.swing.JLabel HelloLB;
    private javax.swing.JButton LogoutBT;
    private javax.swing.JButton QLBanBT;
    private javax.swing.JButton QLHoaDonBT;
    private javax.swing.JButton QLKhachHangBT;
    private javax.swing.JButton QLMonAnBT;
    private javax.swing.JButton QLNhanVienBT;
    private javax.swing.JButton QLThitBT;
    private javax.swing.JTable ShowTB;
    private javax.swing.JComboBox<String> TimeCB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
