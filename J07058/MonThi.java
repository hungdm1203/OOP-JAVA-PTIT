package J07058;

public class MonThi implements Comparable<MonThi> {
    private String ma,mon,hinhthuc;

    public MonThi(String ma, String mon, String hinhthuc) {
        this.ma = ma;
        this.mon = mon;
        this.hinhthuc = hinhthuc;
    }

    @Override
    public String toString() {
        return ma + " " + mon + " " + hinhthuc;
    }

    public int compareTo(MonThi a){
        if(this.ma.compareTo(a.ma)<0){
            return -1;
        } else return 1;
    }
    
    
}