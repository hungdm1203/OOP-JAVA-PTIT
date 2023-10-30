package J05076;

public class DonHang {
    private MatHang mh;
    private int in,price,out,pIn,pOut;

    public DonHang(MatHang mh, int in, int price, int out) {
        this.mh = mh;
        this.in = in;
        this.price = price;
        this.out = out;
        this.pIn=this.price*this.in;
        this.pOut=this.tinhTien();
    }

    public int tinhTien(){
        if(this.mh.getType().equals("A"))
            return this.out*this.price+Math.round(this.price*this.out*8/100);
        else if(this.mh.getType().equals("B"))
            return this.out*this.price+Math.round(this.price*this.out*5/100);
        return this.out*this.price+Math.round(this.price*this.out*2/100);
    }

    @Override
    public String toString() {
        return mh + " " + pIn + " " + pOut;
    }

    

    
}
