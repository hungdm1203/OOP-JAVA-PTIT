package test;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private int ma;
    private String ten,lop;
    private  NgaySinh ns;

    public SinhVien(int ma, String ten, String lop, int ngay, int thang, int nam) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.ns=new NgaySinh(ngay, thang, nam);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + ns;
    }


    
}
