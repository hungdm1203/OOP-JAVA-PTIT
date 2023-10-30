package J05024;

public class SinhVien {
    private String msv,name,lop,email;

    public SinhVien(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public String getNganh() {
        if(this.msv.contains("DCCN") && this.lop.charAt(0)!='E') return "Cong nghe thong tin";
        if(this.msv.contains("DCAT") && this.lop.charAt(0)!='E') return "An toan thong tin";
        if(this.msv.contains("DCKT")) return "Ke toan";
        if(this.msv.contains("DCVT")) return "Vien thong";
        if(this.msv.contains("DCDT")) return "Dien tu";
        return "";
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + email;
    }

       
    
}
