/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admins
 */
public class NhanVien {
    String MaNV;
    String TenNV;
    String TK;
    String MK;
    String Sex;
    String SDT;
    String Pos;

    public NhanVien(String MaNV, String TenNV, String TK, String MK, String Sex, String SDT, String Pos) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.TK = TK;
        this.MK = MK;
        this.Sex = Sex;
        this.SDT = SDT;
        this.Pos = Pos;
    }

    public NhanVien() {
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getTK() {
        return TK;
    }

    public void setTK(String TK) {
        this.TK = TK;
    }

    public String getMK() {
        return MK;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getPos() {
        return Pos;
    }

    public void setPos(String Pos) {
        this.Pos = Pos;
    }
    
    
}
