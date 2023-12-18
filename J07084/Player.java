package J07084;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Player implements Comparable<Player> {
    private String name,din,dout,tin,tout;
    private long time;

    public Player(String name, String in,String out){
        this.name=name;
        String a[]=in.split("\\s+"), b[]=out.split("\\s+");
        this.din=a[0];
        this.dout=b[0];
        this.tin=a[1];
        this.tout=b[1];
        this.setTime();
    }

    public void setTime(){
        String a[]=this.din.split("/"), b[]=this.dout.split("/");
        LocalDate i=LocalDate.of(Integer.valueOf(a[2]), Integer.valueOf(a[1]), Integer.valueOf(a[0]));
        LocalDate o=LocalDate.of(Integer.valueOf(b[2]), Integer.valueOf(b[1]), Integer.valueOf(b[0]));
        long d=ChronoUnit.DAYS.between(i, o);
        String x[]=this.tin.split(":"),y[]=this.tout.split(":");
        LocalTime t1=LocalTime.of(Integer.valueOf(x[0]), Integer.valueOf(x[1]), Integer.valueOf(x[2]));
        LocalTime t2=LocalTime.of(Integer.valueOf(y[0]), Integer.valueOf(y[1]), Integer.valueOf(y[2]));
        this.time=d*60*24+ChronoUnit.MINUTES.between(t1, t2);
    }

    public int compareTo(Player p){
        if (this.time==p.time) {
            return this.name.compareTo(p.name);
        }
        return -Long.valueOf(this.time).compareTo(Long.valueOf(p.time));
    }

    @Override
    public String toString() {
        return name + " " + time;
    }


}
