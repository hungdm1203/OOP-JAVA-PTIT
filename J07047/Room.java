package J07047;

public class Room {
    private String loai,rName;
    private long donGia;
    private double phi;

    public Room(String s0,String s1,String s2,String s3){
        this.loai=s0;
        this.rName=s1;
        this.donGia=Long.valueOf(s2);
        this.phi=Double.valueOf(s3);
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

    public String getRname(){
        return rName;
    }    
    
}
