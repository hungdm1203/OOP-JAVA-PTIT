package J07052;

public class ThiSinh implements Comparable<ThiSinh> {
    private String id,name;
    private double a,b,c,sum,ut;
    
    public ThiSinh(String id, String name, String a, String b, String c) {
        this.id = id;
        this.name = this.setName(name);
        this.a = Double.valueOf(a);
        this.b = Double.valueOf(b);
        this.c = Double.valueOf(c);
        
        if(id.substring(0, 3).equals("KV1"))
            this.ut=0.5;
        else if(id.subSequence(0, 3).equals("KV2"))
            this.ut=1;
        else this.ut=2.5;

        this.sum=this.a*2+this.b+this.c+this.ut;
    }

    public String setName(String name){
        String str[]=name.toUpperCase().split("\\s+"), res="";
        for (int i = 0; i < str.length; i++) {
            if(i!=str.length-1) res=res+str[i].substring(0, 1)+str[i].substring(1).toLowerCase()+" ";
            else res=res+str[i].substring(0, 1)+str[i].substring(1).toLowerCase();
        }
        return res;
    }


    public double getSum() {
        return sum;
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
        return id + " " + name + " " + this.geString(ut) + " " + this.geString(sum);
    }


    
    
}
