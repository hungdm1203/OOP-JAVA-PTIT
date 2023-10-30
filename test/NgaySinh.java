package test;

import java.io.Serializable;

public class NgaySinh implements Serializable {
    private int ngay,thang,nam;

    public NgaySinh(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    @Override
    public String toString() {
        return ngay + " " + thang + " " + nam;
    }



}
