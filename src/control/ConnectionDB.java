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
public class ConnectionDB {
    Connection c=null;
    public Connection getConnectionDB() {
        try {
            String url="jdbc:sqlserver://127.0.0.1:1433;databaseName=QL_QUAN_PHO";
            String user = "admin3121";
            String pass = "m120792741";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c=DriverManager.getConnection(url,user,pass);
            System.out.print("ketnoithanhcong");
        } catch (Exception e) {
            System.out.print("Ket noi khong thanh cong");
        }
        return c;
    }
}
