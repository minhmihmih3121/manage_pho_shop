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
public class KhachHang {
    String acc;
    String pass;
    String name;
    String vip;
    String sex;
    String sdt;
    int point;

    private void CheckVip(int point) {
        if (point<0) 
            vip="Z";
        else
            if (point<500)
                vip="N";
            else
                if (point<2000)
                    vip="B";
                else
                    if (point<8000)
                        vip="S";
                    else 
                        if (point<20000)
                            vip="G";
                        else vip="D";  
    }

    public KhachHang() {
        acc="";
        pass="";
        name="";
        sex="";
        sdt="";
        point=0;
        vip="";
    }

    public KhachHang(String acc, String pass, String name, String sex, String sdt) {
        this.acc = acc;
        this.pass = pass;
        this.name = name;
        this.sex = sex;
        this.sdt=sdt;
        point=0;
        vip="N";
    }
    
    public void SetKH(String acc, String pass, String name, String sex, int point,String sdt) {
        this.acc = acc;
        this.pass = pass;
        this.name = name;
        this.sex = sex;
        this.point = point;
        this.sdt=sdt;
        CheckVip(this.point);
    }
    public KhachHang(String acc, String pass, String name, String sex, int point,String sdt) {
        this.acc = acc;
        this.pass = pass;
        this.name = name;
        this.sex = sex;
        this.point = point;
        this.sdt=sdt;
        CheckVip(this.point);
    }
    
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;    
        CheckVip(this.point);
    }
    
    public void addPoint(int point) {
        this.point+=point;
        CheckVip(this.point);
    }
    public String getVip() {
        return vip;
    }
    public void resetVip() {
        point=0;
        vip="N";
    }
}
