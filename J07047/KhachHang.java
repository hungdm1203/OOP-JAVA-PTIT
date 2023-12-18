package J07047;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class KhachHang implements Comparable<KhachHang> {
    private String ma,khName,rID,start,end;
    private long time;
    private double price;
    private Room r;

    public KhachHang(int ma, String khName, String rID, String start, String end, Room r){
        this.ma="KH"+String.format("%02d", ma);
        this.khName=khName;
        this.rID=rID;
        this.start=start;
        this.end=end;    
        this.time=this.setTime();
        this.r=r;
        this.price=tinhTien();
    }

    public long setTime(){
        String a[]=this.start.split("/"), b[]=this.end.split("/");
        LocalDate d1=LocalDate.of(Integer.valueOf(a[2]), Integer.valueOf(a[1]), Integer.valueOf(a[0]));
        LocalDate d2=LocalDate.of(Integer.valueOf(b[2]), Integer.valueOf(b[1]), Integer.valueOf(b[0]));
        return ChronoUnit.DAYS.between(d1, d2);
    }


    public double tinhTien(){
        if(this.time==0) return Math.round((this.r.getDonGia()+this.r.getDonGia()*this.r.getPhi())*100)/100.0;

        double t=this.time*this.r.getDonGia()*(1+this.r.getPhi());
        if(this.time>=30) return Math.round(t*0.94*100)/100.0;
        if(this.time>=20) return Math.round(t*0.96*100)/100.0;
        if(this.time>=10) return Math.round(t*0.98*100)/100.0;
        return Math.round(t*100)/100.0;
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