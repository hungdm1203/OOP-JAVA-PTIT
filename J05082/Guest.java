package J05082;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Guest implements Comparable<Guest> {
    private String id,name,gender,dob,add;

    public Guest(int id, String name, String gender, String dob, String add) {
        this.id = "KH"+String.format("%03d", id);
        this.name = this.setName(name);
        this.gender = gender;
        this.dob = this.srtDob(dob);
        this.add = add;
    }

    public String setName(String s){
        String res="", str[]=s.toUpperCase().trim().split("\\s+");
        for (int i = 0; i < str.length; i++) {
            if(i!=str.length-1) res=res+str[i].charAt(0)+str[i].substring(1).toLowerCase()+" ";
            else res=res+str[i].charAt(0)+str[i].toLowerCase().substring(1);
        }
        return res;
    }

    public String srtDob(String s){
        if(s.charAt(2)!='/') s='0'+s;
        if(s.charAt(5)!='/') s=s.substring(0, 3)+'0'+s.substring(3);
        return s;
    }


    public int compareTo(Guest g){
        String s1[]=this.dob.split("/"), s2[]=g.dob.split("/");
        int d=(Integer.valueOf(s1[2])-Integer.valueOf(s2[2]))*365 + (Integer.valueOf(s1[1])-Integer.valueOf(s2[1]))*30 + Integer.valueOf(s1[0])-Integer.valueOf(s2[0]);
        if(d<0) return -1;
        return 1;
    }


    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + add + " " + dob;
    }

    
    
}
