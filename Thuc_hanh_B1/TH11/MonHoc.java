package TH11;

public class MonHoc implements Comparable<MonHoc> {
    private String ma,name,thi;

    public MonHoc(String ma, String name, String thi) {
        this.ma = ma;
        this.name = name;
        this.thi = thi;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + thi;
    }

    public int compareTo(MonHoc mh){
        return this.ma.compareTo(mh.ma);
    }
    
    
}
