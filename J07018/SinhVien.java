package J07018;

public class SinhVien {
    private String msv,name,lop,dob;
    private double gpa;
    public SinhVien(int msv, String name, String lop, String dob, double gpa) {
        this.msv = String.format("B20DCCN%03d", msv);
        this.name = name;
        this.lop = lop;
        this.dob = dob;
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }
    
    
}
