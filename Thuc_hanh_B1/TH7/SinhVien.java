package TH7;

/**
 * SinhVien
 */
public class SinhVien implements Comparable<SinhVien> {

    private String msv,name,lop,email,sdt;

    public SinhVien(String msv, String name, String lop, String email, String sdt) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.sdt ="0"+ sdt;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + email + " " + sdt;
    }

    public int compareTo(SinhVien sv){
        if(this.lop.equals(sv.lop)) return this.msv.compareTo(sv.msv);
        return this.lop.compareTo(sv.lop);
    }
    
    
}