package J07025;

import java.time.LocalDate;

public class Guest implements Comparable<Guest> {
    private String id,name,gender,dob,add;

    public Guest(int id, String name, String gender, String dob, String add) {
        this.id = String.format("KH%03d", id);
        this.setName(name);
        this.gender = gender;
        if(dob.charAt(2)!='/') dob='0'+dob;
        if(dob.charAt(5)!='/') dob=dob.substring(0, 3)+'0'+dob.substring(3);
        this.dob = dob;
        this.add = add;
    }
    
    public void setName(String s){
        String a[]=s.toUpperCase().trim().split("\\s+"), res="";
        for (String string : a) {
            res=res+string.charAt(0)+string.substring(1).toLowerCase()+" ";
        }
        this.name=res.trim();
    }

    public int compareTo(Guest g){
        String t1[]=this.dob.split("/");
        LocalDate d1=LocalDate.of(Integer.valueOf(t1[2]), Integer.valueOf(t1[1]), Integer.valueOf(t1[0]));
        String t2[]=g.dob.split("/");
        LocalDate d2=LocalDate.of(Integer.valueOf(t2[2]), Integer.valueOf(t2[1]), Integer.valueOf(t2[0]));
        return d1.compareTo(d2);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + gender + " " + add + " " + dob;
    }

    

}
