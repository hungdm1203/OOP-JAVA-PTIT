package J07055;

public class SinhVien implements Comparable<SinhVien> {
    private String id,name,xeploai;
    private double dtb;
    public SinhVien(int id, String name, double d1, double d2, double d3) {
        this.id = "SV"+String.format("%02d",id);
        this.name = name;
        this.setDtb(d1, d2, d3);
        this.setXl();
    }

    public void setDtb(double a, double b,double c){
        this.dtb=a*0.25+b*0.35+c*0.4;
    }

    public void setXl(){
        if(this.dtb>=8) this.xeploai="GIOI";
        else if(this.dtb>=6.5) this.xeploai="KHA";
        else if(this.dtb>=5) this.xeploai="TRUNG BINH";
        else this.xeploai="KEM";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f",dtb) + " " + xeploai;
    }

    public int compareTo(SinhVien sv){
        if(this.dtb<sv.dtb) return 1;
        return -1;
    }
    
}
