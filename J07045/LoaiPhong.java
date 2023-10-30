package J07045;

public class LoaiPhong implements Comparable<LoaiPhong> {
    private String loaiPhong,tenPhong;
    private int donGia;
    private double phi;
    
    public LoaiPhong(String s) {
        String str[]=s.trim().split("\\s+");
        this.loaiPhong=str[0];
        this.tenPhong=str[1];
        this.donGia=Integer.valueOf(str[2]);
        this.phi=Double.valueOf(str[3]);
    }

    public int compareTo(LoaiPhong lp){
        return this.tenPhong.compareTo(lp.tenPhong);
    }

    @Override
    public String toString() {
        return loaiPhong + " " + tenPhong + " " + donGia + " " + phi;
    }

    

    
}
