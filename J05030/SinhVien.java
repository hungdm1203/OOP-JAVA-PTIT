package J05030;

public class SinhVien implements Comparable<SinhVien>{
    private String msv,name,lop;
    private double d1,d2,d3;
    
    public SinhVien(String msv, String name, String lop, double d1, double d2, double d3) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + d1 + " " + d2 + " " + d3;
    }
    
    public int compareTo(SinhVien sv){
        return this.msv.compareTo(sv.msv);
    }


}
