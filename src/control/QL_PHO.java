/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.*;
/**
 *
 * @author Admins
 */
public class QL_PHO {

    /**
     * @param args the command line arguments
     */
    static ConnectionDB kn=new ConnectionDB();
    public static void main(String[] args) {
        Connection cn=kn.getConnectionDB();
        Statement stm = null;
        ResultSet rs = null;
        String sql = "select * from BAN";
        try {
            stm=cn.createStatement();
            rs=stm.executeQuery(sql);
            while (rs.next()){
                System.out.println("soBan: "+rs.getInt(1)+" loaiBan: "+rs.getString(2)+" tinhTrang: "+rs.getString(3));
            }
        }
        catch (Exception c) {
            System.out.print("Ket noi khong thanh cong");
        }
    }
    
}
