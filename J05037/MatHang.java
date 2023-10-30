package J05037;

public class MatHang implements Comparable<MatHang> {
    private String ma,ten,dvi;
    private long donGia,soLuong,phivc,thanhTien,giaBan;
    
    
    public MatHang(int ma, String ten, String dvi, long donGia, long soLuong) {
        this.ma = "MH"+String.format("%02d",ma);
        this.ten = ten;
        this.dvi=dvi;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.phivc = Math.round((double)(donGia*soLuong*5)/100);
        this.thanhTien = Math.round(donGia*soLuong+phivc);
        this.giaBan =(long) Math.ceil( (double)(thanhTien + (thanhTien*2)/100) / soLuong/100)*100;
    }

    
    public int compareTo(MatHang mh){
        if(this.giaBan<mh.giaBan)
            return 1;
        else return -1;
    }


    @Override
    public String toString() {
        return ma + " " + ten + " " + dvi + " " + phivc + " " + thanhTien + " " + giaBan;
    }



    public long getDonGia() {
        return donGia;
    }
    public long getSoLuong() {
        return soLuong;
    }   
}
