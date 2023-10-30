package J06001;

public class SanPham {
    private String maSP,tenSP;
    private long l1,l2;
    
    public SanPham(String maSP, String tenSP, long l1, long l2) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.l1 = l1;
        this.l2 = l2;
    }

    public String getMaSP(){
        return maSP;
    }

    public long getGia(int i){
        if(i==1) return l1;
        return l2;
    }

    public String gettenSP() {
        return tenSP;
    }

    
}
