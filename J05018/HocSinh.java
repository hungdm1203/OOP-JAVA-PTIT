package J05018;

public class HocSinh implements Comparable<HocSinh> {
    private String id,name;
    private double dtb;


    public HocSinh(int id, String name, double dtb) {
        this.id = "HS"+String.format("%02d", id);
        this.name = name;
        this.dtb = dtb;
    }

    public int compareTo(HocSinh hs){
        if(this.dtb<hs.dtb)
            return 1;
        else if(this.dtb>hs.dtb)
            return -1;
        else return Integer.valueOf(this.id.substring(2))-Integer.valueOf(hs.id.substring(2));
    }

    public String xepLoai(){
        if(this.dtb>=9)
            return "XUAT SAC";
        else if(this.dtb>=8)
            return "GIOI";
        else if(this.dtb>=7)
            return "KHA";
        else if(this.dtb>=5)
            return "TB";
        else return "YEU";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.1f", dtb) + " " + this.xepLoai();
    }


    
}
