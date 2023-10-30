package J06003;

public class SinhVien {
    private String msv,name,sdt,btlName;
    private int nhom;
    public SinhVien(String msv, String name, String sdt, int nhom) {
        this.msv = msv;
        this.name = name;
        this.sdt = sdt;
        this.nhom=nhom;
    }

    public int getNhom(){
        return this.nhom;
    }

    public void setBTL(String s){
        this.btlName=s;
    }

    public String getBTL(){
        return this.btlName;
    }


    @Override
    public String toString() {
        return msv + " " + name + " " + sdt;
    }

    
    
}
