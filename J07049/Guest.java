package J07049;

import java.time.LocalDate;

public class Guest implements Comparable<Guest> {
    private String id,name,add;
    private Product p;
    private int quantity,price;
    private String date;

    public Guest(int id, String name, String add, Product p, int quantity, String date) {
        this.id = String.format("KH%02d", id);
        this.name = name;
        this.add = add;
        this.p = p;
        this.quantity = quantity;
        this.date = date;
        this.price=this.quantity*this.p.getSell();
        this.setDate();
    }

    public void setDate(){
        String s[]=this.date.split("/");
        int mon=(this.p.getTime()%12+Integer.valueOf(s[1]));
        int year=Integer.valueOf(s[2])+(int)this.p.getTime()/12;
        if(mon>12){
            year+=(int)mon/12;
            mon=mon%12;
        }
        
        this.date=String.format("%02d/%02d/%04d", Integer.valueOf(s[0]), mon, year);
    }

    public int compareTo(Guest g){
        if(this.date.equals(g.date)) return this.id.compareTo(g.id);
        else{
            String a[]=this.date.split("/"), b[]=g.date.split("/");
            LocalDate d1=LocalDate.of(Integer.valueOf(a[2]), Integer.valueOf(a[1]), Integer.valueOf(a[0]));
            LocalDate d2=LocalDate.of(Integer.valueOf(b[2]), Integer.valueOf(b[1]), Integer.valueOf(b[0]));
            return d1.compareTo(d2);
        }
    }

    @Override
    public String toString() {
        return id + " "+name+" "+add+" "+p.getId()+" "+price+" "+date;
    }

    
    
}
