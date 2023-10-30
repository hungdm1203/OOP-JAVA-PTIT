package J05064;

public class GiaoVien {
    private String ma,name;
    private int bac;
    private long lcb,phuCap,thuNhap;
    public GiaoVien(String ma, String name, long lcb) {
        this.ma = ma;
        this.name = name;
        this.lcb = lcb;
        this.bac=Integer.valueOf(ma.substring(2));
        
        if(ma.substring(0,2).equals("HT"))
            this.phuCap=2000000;
        else if(ma.substring(0, 2).equals("HP"))
            this.phuCap=900000;
        else this.phuCap=500000;

        this.thuNhap=this.lcb*this.bac+this.phuCap;
    }
    @Override
    public String toString() {
        return ma + " " + name + " " + bac + " " + phuCap + " " + thuNhap;
    }

    
    
}
