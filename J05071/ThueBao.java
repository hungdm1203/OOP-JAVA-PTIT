package J05071;

public class ThueBao implements Comparable<ThueBao> {
    private String number,start,end;
    private ThanhPho tp;
    private long price,time;

    public ThueBao(String number, String start, String end, ThanhPho tp) {
        this.number = number;
        this.start = start;
        this.end = end;
        this.tp = tp;
        this.time=this.setTime();
        this.price=this.setPrice();
    }

    private long setTime(){
        String a[]=this.start.split(":"), b[]=this.end.split(":");
        long t=(Integer.valueOf(b[0])-Integer.valueOf(a[0]))*60+Integer.valueOf(b[1])-Integer.valueOf(a[1]);
        if(this.tp.getName().equals("Noi mang")) return Math.round(t/3.0);
        return t;
    }

    private long setPrice(){
        return this.tp.getGiaCuoc()*this.time;
        
    }

    public int compareTo(ThueBao tb){
        if(this.price<tb.price) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return number + " " + tp.getName() + " " + time + " " + price;
    } 

    
    
}
