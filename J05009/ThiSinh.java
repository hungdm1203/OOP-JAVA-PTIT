package J05009;

public class ThiSinh implements Comparable<ThiSinh> {
    private int id;
    private String name,dob;
    private double d1,d2,d3;

    public ThiSinh(int id, String name, String dob, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double getDiem(){
        return this.d1+this.d2+this.d3;
    }

    public int compareTo(ThiSinh ts){
        if(this.getDiem()<ts.getDiem())
            return 1;
        else if(this.getDiem()>ts.getDiem()) 
            return -1;
        else return this.id-ts.id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + dob + " " + String.format("%.1f",this.getDiem());
    }

    
    
}
