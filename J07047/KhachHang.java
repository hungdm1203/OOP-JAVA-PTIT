package J07047;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class KhachHang implements Comparable<KhachHang> {
    private String ma,khName,rID,start,end;
    private long time;
    private double price;

    public KhachHang(int ma, String khName, String rID, String start, String end, long rDG, double rPhi){
        this.ma="KH"+String.format("%02d", ma);
        this.khName=khName;
        this.rID=rID;
        this.start=start;
        this.end=end;    
        this.time=this.setTime(start, end);
        this.price=tinhTien(rDG, rPhi);
    }

    public long setTime(String start,String end){
        String a[]=start.split("/"), b[]=end.split("/");
        LocalDate d1=LocalDate.of(Integer.valueOf(a[2]), Integer.valueOf(a[1]), Integer.valueOf(a[0]));
        LocalDate d2=LocalDate.of(Integer.valueOf(b[2]), Integer.valueOf(b[1]), Integer.valueOf(b[0]));
        return ChronoUnit.DAYS.between(d1, d2);
    }


    public double tinhTien(long rDG, double rPhi){
        if(this.time==0) return Math.round((rDG+rDG*rPhi)*100)/100.0;

        double t=this.time*rDG*(1+rPhi);
        if(this.time>=30) return Math.round(t*0.94*100)/100.0;
        if(this.time>=20) return Math.round(t*0.96*100)/100.0;
        if(this.time>=10) return Math.round(t*0.98*100)/100.0;
        return Math.round(t*100)/100.0;
    }


    public String getrID() {
        return rID.substring(2, 3);
    }

    public int compareTo(KhachHang k){
        if(this.time<k.time)
            return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return ma + " " + khName + " " + rID + " " + time + " " + String.format("%.2f", price);
    }


    

    
    
}