/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Ban {
    int SoBan;
    String Loai;
    int conlai;

    public int getSoBan() {
        return SoBan;
    }

    public void setSoBan(int SoBan) {
        this.SoBan = SoBan;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public int getConlai() {
        return conlai;
    }

    public void setConlai(int conlai) {
        this.conlai = conlai;
    }

    public Ban(int SoBan, String Loai, int conlai) {
        this.SoBan = SoBan;
        this.Loai = Loai;
        this.conlai = conlai;
    }
}
