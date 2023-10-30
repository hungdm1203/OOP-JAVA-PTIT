package Thuchanh2.bai11;

public class SanPham {
    private String id,name;
    private int gia, baohanh;
    public SanPham(String id, String name, int gia, int baohanh) {
        this.id = id;
        this.name = name;
        this.gia = gia;
        this.baohanh = baohanh;
    }
    public String getID(){
        return id;
    }

    public int getGia(){
        return gia;
    }

    public int getBH(){
        return baohanh;
    }
}
