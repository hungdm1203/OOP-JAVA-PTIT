package J07027;

public class Sinhvien implements Comparable<Sinhvien> {
    private String msv,name,sdt,bt;
    private int stt;

    public Sinhvien(String msv, String name, String sdt) {
        this.msv = msv;
        this.name = name;
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + sdt+" "+stt+" "+bt;
    }

    public void setBT(String s, int i){
        this.stt=i;
        this.bt=s;
    }

    public int compareTo(Sinhvien sv){
        return this.msv.compareTo(sv.msv);
    }
    
}
