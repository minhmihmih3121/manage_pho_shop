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
public class Thit {
    String MaThit;
    String Loai;
    int Tinhtrang;

    public Thit(String MaThit, String Loai, int Tinhtrang) {
        this.MaThit = MaThit;
        this.Loai = Loai;
        this.Tinhtrang = Tinhtrang;
    }

    public String getMaThit() {
        return MaThit;
    }

    public void setMaThit(String MaThit) {
        this.MaThit = MaThit;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public int getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(int Tinhtrang) {
        this.Tinhtrang = Tinhtrang;
    }
    
}
