/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author Admins
 */
public class CT_HOA_DON {
    String tenMon;
    String maMon;
    int maHoaDon;
    String thit1;
    String thit2;
    String thit3;
    String thit4;
    int sl;
    int gia;
    String note;

    public CT_HOA_DON(String tm,String maMon, int maHoaDon, String thit1, String thit2, String thit3, String thit4, int sl, int gia, String note) {
        tenMon=tm;
        this.maMon = maMon;
        this.maHoaDon = maHoaDon;
        this.thit1 = thit1;
        this.thit2 = thit2;
        this.thit3 = thit3;
        this.thit4 = thit4;
        this.sl = sl;
        this.note = note;
        this.gia=sl*gia;
    }

    public String getTenMon() {
        return tenMon;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CT_HOA_DON other = (CT_HOA_DON) obj;
        if (this.maHoaDon != other.maHoaDon) {
            return false;
        }
        if (this.sl != other.sl) {
            return false;
        }
        if (this.gia != other.gia) {
            return false;
        }
        if (!Objects.equals(this.maMon, other.maMon)) {
            return false;
        }
        if (!Objects.equals(this.thit1, other.thit1)) {
            return false;
        }
        if (!Objects.equals(this.thit2, other.thit2)) {
            return false;
        }
        if (!Objects.equals(this.thit3, other.thit3)) {
            return false;
        }
        if (!Objects.equals(this.thit4, other.thit4)) {
            return false;
        }
        if (!Objects.equals(this.note, other.note)) {
            return false;
        }
        return true;
    }
    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getThit1() {
        return thit1;
    }

    public void setThit1(String thit1) {
        this.thit1 = thit1;
    }

    public String getThit2() {
        return thit2;
    }

    public void setThit2(String thit2) {
        this.thit2 = thit2;
    }

    public String getThit3() {
        return thit3;
    }

    public void setThit3(String thit3) {
        this.thit3 = thit3;
    }

    public String getThit4() {
        return thit4;
    }

    public void setThit4(String thit4) {
        this.thit4 = thit4;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}
