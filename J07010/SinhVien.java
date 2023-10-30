package J07010;

public class SinhVien {
    private String msv,name,lop,dob;
    private double gpa;
    public SinhVien(int msv, String name, String lop, String dob, String gpa) {
        this.msv = "B20DCCN" + String.format("%03d", msv);
        this.name = name.trim();
        this.lop = lop.trim();
        if(dob.charAt(2)!='/') dob="0"+dob;
        if(dob.charAt(5)!='/') dob=dob.substring(0, 3)+"0"+dob.substring(3);
        this.dob = dob.trim();
        this.gpa = Double.valueOf(gpa.trim());
    }
    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }

    

    
}
