package J07047;

public class Room {
    private String loai,rName;
    private long donGia;
    private double phi;

    public Room(String s){
        String str[]=s.trim().split("\\s+");
        this.loai=str[0];
        this.rName=str[1];
        this.donGia=Integer.valueOf(str[2]);
        this.phi=Double.valueOf(str[3]);
    }

    public String getLoai() {
        return loai;
    }

    public long getDonGia() {
        return donGia;
    }

    public double getPhi() {
        return phi;
    }

    
    
}
