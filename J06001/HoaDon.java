package J06001;


public class HoaDon implements Comparable<HoaDon> {
    private String maHD;
    private SanPham sp;
    private long quantity,sale,price,sum;
    
    public HoaDon(int i, String ma, long quantity, SanPham sp) {
        this.maHD = ma+String.format("-%03d", i);
        this.quantity = quantity;
        this.sp=sp;
        this.sum=this.setSum(ma.charAt(2)-'0');
        this.sale=this.setSale();
        this.price=this.sum-this.sale;
    }

    public long setSum(int i){
        return this.quantity*this.sp.getGia(i);
    }

    public long setSale(){
        if(this.quantity>=150) return this.sum*50/100;
        if(this.quantity>=100) return this.sum*30/100;
        if(this.quantity>=50) return this.sum*15/100;
        return 0;
    }

    @Override
    public String toString() {
        return maHD + " " + sp.gettenSP() + " " + sale + " " + price;
    }   


    public int compareTo(HoaDon hd){
        if(this.price<hd.price)
            return 1;
        return -1;
    }


}
