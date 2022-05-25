/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
/**
 *
 * @author Admins
 */
public class HoaDon {
    int MaHD;
    int soBan;
    String MaNV;
    String TKKH;
    int tongtien;
    Date tg;

    public HoaDon(int MaHD, int soBan, String MaNV, String TKKH, Date tg) {
        this.MaHD = MaHD;
        this.soBan = soBan;
        this.MaNV = MaNV;
        this.TKKH = TKKH;
        this.tg = tg;
        this.tongtien=0;
    }

    public HoaDon(int MaHD, int soBan, String MaNV, String TKKH, int tongtien, Date tg) {
        this.MaHD = MaHD;
        this.soBan = soBan;
        this.MaNV = MaNV;
        this.TKKH = TKKH;
        this.tongtien = tongtien;
        this.tg = tg;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTKKH() {
        return TKKH;
    }

    public void setTKKH(String TKKH) {
        this.TKKH = TKKH;
    }

    public int getTongtien() {
        return tongtien;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "MaHD=" + MaHD + ", soBan=" + soBan + ", MaNV=" + MaNV + ", TKKH=" + TKKH + ", tongtien=" + tongtien + ", tg=" + tg + '}';
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }
    public void addTongtien(int tongtien) {
        this.tongtien += tongtien;
    }
    public Date getTg() {
        return tg;
    }

    public void setTg(Date tg) {
        this.tg = tg;
    }
    
}
