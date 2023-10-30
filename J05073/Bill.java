package J05073;

public class Bill {
    private String id;
    private int quantity;
    private double price,sell;

    public Bill(String id, double price, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.setSell();
    }

    private void setSell(){
        double tmp;
        if(this.id.charAt(0)=='T' ){
            if(this.id.charAt(3)=='C') tmp=this.price*0.29*0.95;
            else tmp=this.price*0.29;
            tmp=tmp+this.price*0.04;
        } else if(this.id.charAt(0)=='C'){
            if(this.id.charAt(3)=='C') tmp=this.price*0.1*0.95;
            else tmp=this.price*0.1;
            tmp=tmp+this.price*0.03;
        } else if(this.id.charAt(0)=='D'){
            if(this.id.charAt(3)=='C') tmp=this.price*0.08*0.95;
            else tmp=this.price*0.08;
            tmp=tmp+this.price*0.025;
        } else {
            if(this.id.charAt(3)=='C') tmp=this.price*0.02*0.95;
            else tmp=this.price*0.02;
            tmp=tmp+this.price*0.005;
        }
        this.sell=(this.price+tmp)*1.2;
    }

    @Override
    public String toString() {
        return id + " " + String.format("%.2f", sell);
    }

    
    
}
