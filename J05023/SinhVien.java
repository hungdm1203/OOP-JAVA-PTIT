package J05023;

public class SinhVien {
    private String msv,name,lop,email;

    public SinhVien(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + email;
    }

    public String getKhoa() {
        return this.lop.substring(1, 3);
    }
    
    
    
}
