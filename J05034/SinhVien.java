package J05034;

public class SinhVien implements Comparable<SinhVien> {
    private String stt,msv,name,lop,email,cty;

    public SinhVien(int stt, String msv, String name, String lop, String email, String cty) {
        this.stt = String.valueOf(stt);
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.cty = cty;
    }

    public String getCty() {
        return cty;
    }    

    public String getMsv() {
        return msv;
    }

    public int compareTo(SinhVien sv){
        return this.name.compareTo(sv.name);
    }

    @Override
    public String toString() {
        return stt + " " + msv + " " + name + " " + lop + " " + email + " " + cty;
    }
    
    
}
