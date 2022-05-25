/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.*;
import javax.swing.*;
import control.ConnectionDB;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import model.CT_HOA_DON;
import java.sql.Date;
import java.util.*;
import model.HoaDon;
public class GDKhach extends javax.swing.JFrame {
    String acc;
    private List<CT_HOA_DON> cthoadon;
    public GDKhach() {
        initComponents();
        acc="khach1";
        addComponent();
        this.setLocationRelativeTo(null);
    }
    public GDKhach(String acc) {
        initComponents();
        this.acc=acc;
        addComponent(); 
        this.setLocationRelativeTo(null);
    }
    static ConnectionDB c =new ConnectionDB();
    Statement stm = null;
    ResultSet rs = null;
    String sql;
    Connection cn=c.getConnectionDB();
    HoaDon hd;
    BillNow bn=new BillNow();
    DefaultTableModel dtm=new DefaultTableModel(){
    @Override
    public boolean isCellEditable(int row, int column) {
       return false;
    }
    };
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BillBT = new javax.swing.JButton();
        BillNowBT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShowTB = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        datele = new javax.swing.JButton();
        Success = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ThankLB = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        MenuLB = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        HelloLB = new javax.swing.JLabel();
        ThemBT = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        FuncMN = new javax.swing.JMenu();
        LogoutMI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BillBT.setText("Hóa đơn mới");
        BillBT.setFocusable(false);
        BillBT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BillBT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BillBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillBTActionPerformed(evt);
            }
        });

        BillNowBT.setText("Hóa đơn hiện tại");
        BillNowBT.setFocusable(false);
        BillNowBT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BillNowBT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BillNowBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillNowBTActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(252, 252, 233));

        jPanel3.setBackground(new java.awt.Color(252, 252, 233));
        jPanel3.setMinimumSize(new java.awt.Dimension(400, 500));
        jPanel3.setLayout(new java.awt.GridLayout(0, 2));

        jPanel4.setBackground(new java.awt.Color(252, 252, 233));

        ShowTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên món", "Số lượng", "Giá", "Thịt", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ShowTB);
        if (ShowTB.getColumnModel().getColumnCount() > 0) {
            ShowTB.getColumnModel().getColumn(0).setPreferredWidth(140);
            ShowTB.getColumnModel().getColumn(1).setPreferredWidth(80);
            ShowTB.getColumnModel().getColumn(2).setPreferredWidth(100);
            ShowTB.getColumnModel().getColumn(3).setResizable(false);
            ShowTB.getColumnModel().getColumn(3).setPreferredWidth(150);
            ShowTB.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("  Món đã đặt:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        datele.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        datele.setText("Xóa món");
        datele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateleActionPerformed(evt);
            }
        });

        Success.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Success.setText("Hoàn tất gọi món");
        Success.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuccessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(datele, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Success, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Success, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 102))));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("UVF Chikita", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 38, 38));
        jLabel1.setText(" Đặt món");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        ThankLB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ThankLB.setText("Vui lòng ấn \"Hóa đơn mới\" để bắt đầu gọi món. Xin cảm ơn!");

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("UVF Reina 12 Pro", 1, 23)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Swing");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        MenuLB.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("  Menu:");

        javax.swing.GroupLayout MenuLBLayout = new javax.swing.GroupLayout(MenuLB);
        MenuLB.setLayout(MenuLBLayout);
        MenuLBLayout.setHorizontalGroup(
            MenuLBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLBLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(60, 60, 60))
        );
        MenuLBLayout.setVerticalGroup(
            MenuLBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ThankLB, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(MenuLB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ThankLB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(MenuLB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        HelloLB.setFont(new java.awt.Font("UVF Didot LT Std", 1, 16)); // NOI18N
        HelloLB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        ThemBT.setText("Gọi thêm");
        ThemBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemBTActionPerformed(evt);
            }
        });

        FuncMN.setText("Function");

        LogoutMI.setText("Đăng xuất");
        LogoutMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutMIActionPerformed(evt);
            }
        });
        FuncMN.add(LogoutMI);

        jMenuBar1.add(FuncMN);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BillBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BillNowBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ThemBT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HelloLB, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BillBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BillNowBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HelloLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ThemBT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void addComponent() {       
        try {
            sql = "select * from MON";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            int i=0;
            String mm;
            while (rs.next()) {
                JButton bt = new JButton();
                jPanel3.add(bt);
                bt.setName(String.format("MonBT%d",i));
                bt.setText(rs.getString(2));
                bt.setFont(new Font("Tahoma",1,16));
                bt.setActionCommand(String.format(rs.getString(1)));
                mm=rs.getString(1);
                i++;
                bt.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        MonBTActionPerformed(evt,bt.getActionCommand(),bt.getText());
                    }
                });
            }
        }
        catch (Exception c) {
            System.out.print("Ket noi khong thanh cong");
        }
        ThemBT.setEnabled(false);
        BillNowBT.setEnabled(false);
        ShowTB.setModel(dtm);
        dtm.addColumn("Tên món");
        dtm.addColumn("Số lượng");
        dtm.addColumn("Giá");
        dtm.addColumn("Thịt");
        dtm.addColumn("Ghi chú");
        ShowTB.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        ShowTB.getColumnModel().getColumn(0).setPreferredWidth(120);
        ShowTB.getColumnModel().getColumn(1).setPreferredWidth(70);
        ShowTB.getColumnModel().getColumn(2).setPreferredWidth(70);
        ShowTB.getColumnModel().getColumn(3).setPreferredWidth(150);
        ShowTB.getColumnModel().getColumn(4).setPreferredWidth(90);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        MenuLB.setVisible(false);
        cthoadon=new ArrayList<>();
        dtm = (DefaultTableModel) ShowTB.getModel();
        try {
            sql="select TenKH from KHACHHANG where TKKH='"+acc+"'";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            rs.next();
            HelloLB.setText("Xin chào! "+rs.getString(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addCtHoaDon(CT_HOA_DON ct) {
        cthoadon.add(ct);
        String temp;
        hd.addTongtien(ct.getGia());
        dtm.setRowCount(0); 
        for (CT_HOA_DON cthd: cthoadon) {
            temp="";
            if(!cthd.getThit1().equals("Không")){
                temp+=cthd.getThit1()+","+cthd.getThit2();
            }
            if(!cthd.getThit3().equals("Không")){
                temp+=","+cthd.getThit3();
            }
            if(!cthd.getThit4().equals("Không")){
                temp+=","+cthd.getThit4();
            }
            dtm.addRow(new Object[]{cthd.getTenMon(),cthd.getSl(),cthd.getGia(),temp,cthd.getNote()});
        }
    }
    public void deleteCtHoaDon(int a) {
        cthoadon.remove(a);
        dtm.setRowCount(0); 
        String temp="";
        for (CT_HOA_DON cthd: cthoadon) {
            if(!cthd.getThit1().equals("Không")){
                temp+=cthd.getThit1()+","+cthd.getThit2();
            }
            if(!cthd.getThit3().equals("Không")){
                temp+=","+cthd.getThit3();
            }
            if(!cthd.getThit4().equals("Không")){
                temp+=","+cthd.getThit4();
            }
            dtm.addRow(new Object[]{cthd.getTenMon(),cthd.getSl(),cthd.getGia(),temp,cthd.getNote()});
        }
    }
    private void MonBTActionPerformed(java.awt.event.ActionEvent evt,String maMon,String tenMon) {
        GoiMon n = new GoiMon(this,true,maMon,tenMon,hd.getMaHD());
        n.setVisible(true);   
    }  
    private void LogoutMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutMIActionPerformed
        this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_LogoutMIActionPerformed
     
    private void BillBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillBTActionPerformed
        int maHD=1;
        Date t;
        long millis=System.currentTimeMillis();
        t=new Date(millis);
        int sb;
        String maNV="none";
        int dk=JOptionPane.showConfirmDialog(this,"Bạn muốn tạo hóa đơn mới?","Confirm",JOptionPane.YES_NO_OPTION);
        if(dk!=JOptionPane.YES_OPTION) {
            return;
        }
        QuestBan a = new QuestBan(this,true);
        a.setVisible(true);
        sb=a.getSB();
        try {
            sql= "select MaHD from HOADON";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            while(rs.next()){
                maHD++;
            }
        }
        catch (Exception e) {
            maHD=1;
            e.printStackTrace();
        }
        try {
            sql = "select ViTri,MaNV from NHANVIEN";
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString(1).equals("Phục Vụ")){
                    maNV=rs.getString(2);
                    break;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        try {
            hd=new HoaDon(maHD,sb,maNV,acc,t);
        } catch (Exception e) {
            e.printStackTrace();
        }
        bn=null;
        bn=new BillNow(hd);
        BillNowBT.setEnabled(true);
        ThankLB.setVisible(false);
        jPanel3.setVisible(true);
        jPanel4.setVisible(true);
        MenuLB.setVisible(true);
        ThemBT.setEnabled(false);
    }//GEN-LAST:event_BillBTActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Info(this,true).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    private void SuccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuccessActionPerformed
        try {
            String sql1;
            stm=cn.createStatement();
            PreparedStatement ps;
            int maHD=0,n=0;
            sql= "select MaHD from HOADON";
            rs=stm.executeQuery(sql);
            while(rs.next()){
                maHD++;
            }
            if(hd.getMaHD()!=maHD){
                sql="insert into HOADON values (?,?,?,?,?,?)";
                ps=cn.prepareStatement(sql);
                ps.setInt(1,hd.getMaHD());
                ps.setInt(2,hd.getSoBan());
                ps.setString(3,hd.getMaNV());
                ps.setString(4,hd.getTKKH());
                ps.setInt(5,hd.getTongtien());
                ps.setDate(6,hd.getTg());
                ps.executeUpdate();
                ThemBT.setEnabled(true);
            }
            else {
                sql="update HOADON set ThanhTien=? where MaHD='"+hd.getMaHD()+"'";
                ps=cn.prepareStatement(sql);
                ps.setInt(1,hd.getTongtien());
            }
            sql="insert into CT_HOA_DON values (?,?,?,?,?,?,?,?,?)";
            for (CT_HOA_DON cthd: cthoadon) {
                ps=cn.prepareStatement(sql);
                ps.setInt(1,cthd.getMaHoaDon());
                ps.setString(2,cthd.getMaMon());
                ps.setInt(3,cthd.getSl());
                sql1="select MaTHIT from THIT where Loai=N'"+cthd.getThit1()+"'";
                rs=stm.executeQuery(sql1);
                rs.next();
                ps.setString(4,rs.getString(1));
                sql1="select MaTHIT from THIT where Loai=N'"+cthd.getThit2()+"'";
                rs=stm.executeQuery(sql1);
                rs.next();
                ps.setString(5,rs.getString(1));
                sql1="select MaTHIT from THIT where Loai=N'"+cthd.getThit3()+"'";
                rs=stm.executeQuery(sql1);
                rs.next();
                ps.setString(6,rs.getString(1));
                sql1="select MaTHIT from THIT where Loai=N'"+cthd.getThit4()+"'";
                rs=stm.executeQuery(sql1);
                rs.next();
                ps.setString(7,rs.getString(1));
                ps.setInt(8,cthd.getGia());
                ps.setString(9,cthd.getNote());
                n=ps.executeUpdate();
            }
            if(n!=0){
                bn.UpdateTable(this,hd);
                JOptionPane.showMessageDialog(this, "Gọi món thành công. Hóa đơn đã được cập nhật!");
                dtm.setRowCount(0);
                cthoadon.clear();
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        MenuLB.setVisible(false);
        ThemBT.setEnabled(true);
    }//GEN-LAST:event_SuccessActionPerformed
    public void disen() {
        BillBT.setEnabled(true);
        ThemBT.setEnabled(false);
    }
    public List<CT_HOA_DON> getCTHoaDon() {
        return cthoadon;
    }
    private void dateleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateleActionPerformed
        int select = ShowTB.getSelectedRow();
        try {
            deleteCtHoaDon(select);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Hãy chọn món bạn muốn hủy đặt!");
            return;
        }
    }//GEN-LAST:event_dateleActionPerformed

    private void BillNowBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillNowBTActionPerformed
        bn.setVisible(true);
    }//GEN-LAST:event_BillNowBTActionPerformed

    private void ThemBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemBTActionPerformed
            jPanel3.setVisible(true);
            jPanel4.setVisible(true);
            MenuLB.setVisible(true);
    }//GEN-LAST:event_ThemBTActionPerformed

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
            java.util.logging.Logger.getLogger(GDKhach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GDKhach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GDKhach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GDKhach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GDKhach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BillBT;
    private javax.swing.JButton BillNowBT;
    private javax.swing.JMenu FuncMN;
    private javax.swing.JLabel HelloLB;
    private javax.swing.JMenuItem LogoutMI;
    private javax.swing.JPanel MenuLB;
    private javax.swing.JTable ShowTB;
    private javax.swing.JButton Success;
    private javax.swing.JLabel ThankLB;
    private javax.swing.JButton ThemBT;
    private javax.swing.JButton datele;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
