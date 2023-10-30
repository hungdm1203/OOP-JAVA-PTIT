package J07084;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Player implements Comparable<Player> {
    private String name,datein,dateout,timein,timeout;
    private long time;

    public Player(String name, String datein, String dateout, String timein, String timeout) {
        this.name = name;
        this.datein = datein;
        this.dateout = dateout;
        this.timein = timein;
        this.timeout = timeout;
        this.setTime();;
    }

    public void setTime(){
        String din[]=this.datein.split("/");
        String dout[]=this.dateout.split("/");
        LocalDate d1=LocalDate.of(Integer.valueOf(din[2]), Integer.valueOf(din[1]), Integer.valueOf(din[0]));
        LocalDate d2=LocalDate.of(Integer.valueOf(dout[2]), Integer.valueOf(dout[1]), Integer.valueOf(dout[0]));
        long d=ChronoUnit.DAYS.between(d1, d2);

        String tin[]=this.timein.split(":");
        String tout[]=this.timeout.split(":");
        LocalTime t1=LocalTime.of(Integer.valueOf(tin[0]), Integer.valueOf(tin[1]), Integer.valueOf(tin[2]));
        LocalTime t2=LocalTime.of(Integer.valueOf(tout[0]), Integer.valueOf(tout[1]), Integer.valueOf(tout[2]));
        long t=ChronoUnit.MINUTES.between(t1, t2);
        // long t=Integer.valueOf(tout[0])*60-60*Integer.valueOf(tin[0])+Integer.valueOf(tout[1])-Integer.valueOf(tin[1]);
        this.time=t+d*60*24;
    }

    public int compareTo(Player p){
        if(this.time<p.time) return 1;
        else if(this.time>p.time) return -1;
        return this.name.compareTo(p.name);
    }

    public String toString(){
        return name+" "+time;
    }
}
