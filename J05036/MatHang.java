package J05036;

public class MatHang {
    private String ma,ten,dvi;
    private long donGia,soLuong;


    public MatHang(int ma, String ten, String dvi, long donGia, long soLuong) {
        this.ma = "MH"+String.format("%02d",ma);
        this.ten = ten;
        this.dvi = dvi;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public long phiVc(){
        return Math.round((double)this.donGia*this.soLuong*5/100);
    }

    public long thanhTien(){
        return Math.round(this.phiVc()+this.donGia*this.soLuong);
    }

    public long price(){
        return Math.round(this.thanhTien()+(double)this.thanhTien()*2/100);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + dvi + " " + this.phiVc() + " " + this.thanhTien() + " " + this.price();
    }

    

    
}
