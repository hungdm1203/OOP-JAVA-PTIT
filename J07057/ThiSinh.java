package J07057;


public class ThiSinh implements Comparable<ThiSinh> {
    private String id, name, dt,note;
    private int kv;
    private double sum;

    public ThiSinh(int id, String name, double d, String dt, int kv) {
        this.id = "TS" + String.format("%02d", id);
        this.name = name;
        this.dt = dt;
        this.kv = kv;
        this.setSum(d);
        if(this.sum>=20.5) this.note="Do";
        else this.note="Truot";
    }

    public void setSum(double d) {
        if (this.kv == 1) this.sum = d + 1.5;
        else if (this.kv == 2) this.sum = d + 1;
        else this.sum = d;
        if (!this.dt.equals("Kinh")) this.sum+=1.5; 
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f",sum) + " " + note;
    }

    public int compareTo(ThiSinh ts){
        if(this.sum<ts.sum) return 1;
        else if(this.sum>ts.sum) return -1;
        return this.id.compareTo(ts.id);
    }

}
