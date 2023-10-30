package J05058;

public class ThiSinh implements Comparable<ThiSinh> {
    private String id,name,tt;
    private double a,b,c,sum,ut;
    
    public ThiSinh(String id, String name, double a, double b, double c) {
        this.id = id;
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        
        if(id.substring(0, 3).equals("KV1"))
            this.ut=0.5;
        else if(id.subSequence(0, 3).equals("KV2"))
            this.ut=1;
        else this.ut=2.5;

        this.sum=a*2+b+c+this.ut;
        if(this.sum<24)
            this.tt="TRUOT";
        else this.tt="TRUNG TUYEN";
    }


    public String geString(double n){
        if(n-(int)n==0)
            return String.format("%.0f", n);
        else return String.format("%.1f",n);
    }


    public int compareTo(ThiSinh ts){
        if(this.sum<ts.sum)
            return 1;
        else if(this.sum>ts.sum)
            return -1;
        else return this.id.compareTo(ts.id);
    }



    @Override
    public String toString() {
        return id + " " + name + " " + this.geString(ut) + " " + this.geString(sum) + " " + tt;
    }


    
    
}
