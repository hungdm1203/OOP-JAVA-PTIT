package J07019;

public class Hoadon {
    private String id;
    private Sanpham sp;
    private long quantity,discount,price;

    public Hoadon(int id, String s, Sanpham sp, long quantity) {
        this.id = s+String.format("-%03d", id);
        this.sp = sp;
        this.quantity = quantity;
        this.setPrice();
        this.setDiscount();
    }

    public void setPrice(){
        if(this.id.charAt(2)=='1'){
            this.price=this.quantity*sp.getL1();
        } else this.price=this.quantity*sp.getL2();
    }

    public void setDiscount(){
        if(this.quantity>=150) this.discount=this.price*50/100;
        else if(this.quantity>=100) this.discount=this.price*30/100;
        else if(this.quantity>=50) this.discount=this.price*15/100;
        else this.discount=0;
    }

    @Override
    public String toString() {
        return id + " " + sp.getName() + " " + discount + " " + (price-discount);
    }

    
    
}
