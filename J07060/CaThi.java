package J07060;

import java.time.LocalDate;

public class CaThi implements Comparable<CaThi> {
    private String id,date,time,room;
    private MonThi m;
    private String nhom;
    private int n;

    public CaThi(int id, String date, String time, String room) {
        this.id = String.format("C%03d", id);
        this.date = date;
        this.time = time;
        this.room = room;
    }

    public void set(MonThi m, String nhom, int n){
        this.m=m;
        this.nhom=nhom;
        this.n=n;
    }

    public int compareTo(CaThi c){
        if(this.date.equals(c.date)) {
            if(this.time.equals(c.time)) return this.id.compareTo(c.id);
            else return this.time.compareTo(c.time);
        }
        else{
            String a[]=this.date.split("/");
            String b[]=c.date.split("/");
            LocalDate d1=LocalDate.of(Integer.valueOf(a[2]),Integer.valueOf(a[1]),Integer.valueOf(a[0]));
            LocalDate d2=LocalDate.of(Integer.valueOf(b[2]),Integer.valueOf(b[1]),Integer.valueOf(b[0]));
            return d1.compareTo(d2);
        }
    }

    @Override
    public String toString() {
        return date+" "+time+" "+room+" "+m.getName()+" "+nhom+" "+n;
    }
    
    
}
