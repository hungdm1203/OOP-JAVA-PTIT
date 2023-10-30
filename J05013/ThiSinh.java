package J05013;

public class ThiSinh implements Comparable<ThiSinh> {
    private String id,name,xepLoai;
    private double d1,d2,tb;

    public ThiSinh(int id, String name, double d1, double d2) {
        this.id = "TS"+String.format("%02d", id);
        this.name = name;
        this.d1 = this.cal(d1);
        this.d2 = this.cal(d2);
        this.tb=(this.d1+this.d2)/2;
        this.xepLoai=this.XL();
    }

    private String XL(){
        if(this.tb>9.5) return "XUAT SAC";
        if(this.tb>=8) return "DAT";
        if(this.tb>=5) return "CAN NHAC";
        return "TRUOT";
    }

    private double cal(double d){
        if(d>10) return d/10;
        return d;
    }

    public int compareTo(ThiSinh ts){
        if(this.tb<ts.tb) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", tb) + " " + xepLoai;
    }

    
    
}
