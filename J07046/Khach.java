package J07046;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Khach implements Comparable<Khach> {
    private String id,name,maPhong,start,end;
    private long time;

    public Khach(int id, String name, String maPhong, String start, String end) {
        this.id = "KH"+String.format("%02d", id);
        this.name = name;
        this.maPhong = maPhong;
        this.start = start;
        this.end = end;
        this.time=this.getTime();
    }

    public long getTime(){
        String s1[]=this.start.split("/"), s2[]=this.end.split("/");
        LocalDate st= LocalDate.of(Integer.valueOf(s1[2]), Integer.valueOf(s1[1]), Integer.valueOf(s1[0]));
        LocalDate en= LocalDate.of(Integer.valueOf(s2[2]), Integer.valueOf(s2[1]), Integer.valueOf(s2[0]));
        return ChronoUnit.DAYS.between(st, en);
    }

    public int compareTo(Khach k){
        if(this.time<k.time){
            return 1;
        } else return -1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + maPhong+" "+time;
    }
    
}
