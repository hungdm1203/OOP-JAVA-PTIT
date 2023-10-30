package J07050;

public class MatHang implements Comparable<MatHang> {
    private String id, name, loai;
    private double mua,ban,loiNhuan;
    
    public MatHang(int id, String name, String loai, String mua, String ban) {
        this.id = "MH"+String.format("%02d",id);
        this.name = name;
        this.loai=loai;
        this.mua = Double.valueOf(mua);
        this.ban = Double.valueOf(ban);
        this.loiNhuan = this.ban-this.mua;
    }

    public int compareTo(MatHang mh){
        if(this.loiNhuan<mh.loiNhuan)
            return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + loai + " " + String.format("%.2f", loiNhuan);
    }


    
    
}
