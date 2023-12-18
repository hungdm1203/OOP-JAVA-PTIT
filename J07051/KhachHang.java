package J07051;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class KhachHang implements Comparable<KhachHang> {
    private String id,name,room,start,end;
    private int phatSinh;
    private long time, price;
    
    public KhachHang(int id, String name, String room, String start, String end, String phatSinh) {
        this.id = "KH"+String.format("%02d",id);
        this.name = this.setName(name);
        this.room = room;
        this.start = start;
        this.end = end;
        this.phatSinh = Integer.valueOf(phatSinh);
        this.time=this.setTime(start,end);
        this.price=this.setPrice();
    }

    public String setName(String name){
        String str[]=name.toUpperCase().split("\\s+"), res="";
        for (int i = 0; i < str.length; i++) {
            res=res+str[i].substring(0, 1)+str[i].substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }

    public long setTime(String start,String end){
        String a[]=start.split("/"), b[]=end.split("/");
        LocalDate d1=LocalDate.of(Integer.valueOf(a[2]), Integer.valueOf(a[1]), Integer.valueOf(a[0]));
        LocalDate d2=LocalDate.of(Integer.valueOf(b[2]), Integer.valueOf(b[1]), Integer.valueOf(b[0]));
        if(ChronoUnit.DAYS.between(d1, d2)==0) return 1;
        return ChronoUnit.DAYS.between(d1, d2)+1;
    }


    public long setPrice(){
        if(this.room.charAt(0)=='1') return this.time*25+this.phatSinh;
        if(this.room.charAt(0)=='2') return this.time*34+this.phatSinh;
        if(this.room.charAt(0)=='3') return this.time*50+this.phatSinh;
        return this.time*80+this.phatSinh;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + room + " " + time + " " + price;
    }


    public int compareTo(KhachHang k){
        if(this.price<k.price) return 1;
        return -1;
    }
    
    
}
