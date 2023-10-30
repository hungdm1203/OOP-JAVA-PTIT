package J05016;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Guest implements Comparable<Guest> {
    private String id,name,room,in,out;
    private int price,service;
    private long sum,time;

    public Guest(int id, String name, String room, String in, String out, int service) {
        this.id = "KH"+String.format("%02d", id);
        this.name = name;
        this.room = room;
        this.in = in;
        this.out = out;
        this.service = service;
        this.time=this.setTime();
        this.price=this.setPrice();
        this.sum=this.time*this.price+this.service;
    }

    private int setPrice(){
        if(this.room.charAt(0)=='1') return 25;
        if(this.room.charAt(0)=='2') return 34;
        if(this.room.charAt(0)=='3') return 50;
        return 80;
    }

    private long setTime(){
        String s1[]=this.in.split("/"), s2[]=this.out.split("/");
        LocalDate d1=LocalDate.of(Integer.valueOf(s1[2]), Integer.valueOf(s1[1]), Integer.valueOf(s1[0]));
        LocalDate d2=LocalDate.of(Integer.valueOf(s2[2]), Integer.valueOf(s2[1]), Integer.valueOf(s2[0]));
        return ChronoUnit.DAYS.between(d1, d2)+1;
    }

    public int compareTo(Guest g){
        if(this.sum<g.sum) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + room + " " + time + " " + sum;
    }

    

    
}
