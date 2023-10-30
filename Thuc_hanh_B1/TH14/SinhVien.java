package TH14;

public class SinhVien implements Comparable<SinhVien> {
    private String msv,name,email,sdt;

    public SinhVien(String msv, String name, String email, String sdt) {
        this.msv = msv;
        this.name = name;
        this.email = email;
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return msv + " " + name;
    }

    public int compareTo(SinhVien sv){
        return this.msv.compareTo(sv.msv);
    }
    
}
