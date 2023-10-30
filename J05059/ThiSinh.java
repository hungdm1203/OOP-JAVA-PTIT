package J05059;

public class ThiSinh implements Comparable<ThiSinh> {
    private String id,name;
    private double a,b,c,uuTien,sum;

    public ThiSinh(String id, String name, double a, double b, double c) {
        this.id = id;
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.uuTien=this.setUuTien();
        this.sum=a*2+b+c+this.uuTien;
    }

    private double setUuTien(){
        if(this.id.charAt(2)=='1') return 0.5;
        if(this.id.charAt(2)=='2') return 1.0;
        return 2.5;
    }

    private String getUuTien(){
        if( this.uuTien-(int)this.uuTien==0) return String.format("%.0f",this.uuTien);
        return String.format("%.1f", this.uuTien);
    }

    private String Sum(){
        if( this.sum-(int)this.sum==0) return String.format("%.0f",this.sum);
        return String.format("%.1f", this.sum);
    }

    public int compareTo(ThiSinh ts){
        if(this.sum<ts.sum) return 1;
        if(this.sum>ts.sum) return -1;
        return this.id.compareTo(ts.id);
    }

    public double getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + this.getUuTien() + " " + this.Sum();
    }


    
    
}
