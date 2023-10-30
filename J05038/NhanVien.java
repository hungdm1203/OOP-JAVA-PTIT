package J05038;

public class NhanVien {
    private String id,name,chucVu;
    private long luongNgay;
    private int ngayCong;

    public NhanVien(int id, String name, String luongNgay, String ngayCong, String chucVu) {
        this.id = "NV"+String.format("%02d", id);
        this.name = name;
        this.luongNgay = Long.valueOf(luongNgay);
        this.ngayCong = Integer.valueOf(ngayCong);
        this.chucVu = chucVu;
    }

    public long getLuongThang(){
        return this.ngayCong*this.luongNgay;
    }

    public long getThuong(){
        if(this.ngayCong>=25)
            return this.getLuongThang()*20/100;
        else if(this.ngayCong>=22)
            return this.getLuongThang()*10/100;
        else return 0;
    }

    public long getPhuCap(){
        if(this.chucVu.equals("GD"))
            return 250000;
        else if(this.chucVu.equals("PGD"))
            return 200000;
        else if(this.chucVu.equals("TP"))
            return 180000;
        else return 150000;
    }

    public long getLuong(){
        return this.getLuongThang()+this.getPhuCap()+this.getThuong();
    }

    @Override
    public String toString() {
        return id + " " + name + " " + this.getLuongThang() + " " + this.getThuong() + " " + this.getPhuCap() + " " + this.getLuong();
    }   

    
}
