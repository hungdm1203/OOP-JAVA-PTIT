package J05003;

public class SinhVien {
    private String msv,name,lop,dob;
    private double gpa;

    public SinhVien(int id, String name, String lop, String dob, double gpa) {
        this.msv = "B20DCCN"+String.format("%03d", id);
        this.name = name;
        this.lop = lop;
        if(dob.charAt(2)!='/')
            dob="0"+dob;
        if(dob.charAt(5)!='/')
            dob=dob.substring(0, 3)+"0"+dob.substring(3);
        this.dob = dob;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
    }


}
