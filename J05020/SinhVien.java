package J05020;

public class SinhVien  implements Comparable<SinhVien> {
    private String msv,name,lop,email;

    public SinhVien(String msv, String name, String lop, String email) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
        this.email = email;
    }

    public int compareTo(SinhVien sv){
        if(this.lop.equals(sv.lop)){
            return this.msv.compareTo(sv.msv);
        }
        else return this.lop.compareTo(sv.lop);
    }


    @Override
    public String toString() {
        return msv + " " + name + " " + lop + " " + email;
    }
    
}
