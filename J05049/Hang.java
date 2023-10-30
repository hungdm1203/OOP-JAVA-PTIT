package J05049;


public class Hang implements Comparable<Hang> {
    private String id;
    private long nhap,xuat,donGia,price,thue;
    
    public Hang(String id, long nhap) {
        this.id = id;
        this.nhap = nhap;
        
        if(id.charAt(0)=='A'){
            this.xuat=Math.round(nhap*60/100.0);
        } else this.xuat=Math.round(nhap*70/100.0);

        if(id.charAt(id.length()-1)=='Y'){
            this.donGia=110000;
        } else this.donGia=135000;

        this.price=this.donGia*this.xuat;

        if(id.charAt(0)=='A'){
            if(id.charAt(id.length()-1)=='Y')
                this.thue=this.price*8/100;
            else this.thue=this.price*11/100;
        } else{
            if(id.charAt(id.length()-1)=='Y')
                this.thue=this.price*17/100;
            else this.thue=this.price*22/100;
        }

    }


    public int compareTo(Hang h){
        if(this.thue<h.thue)
            return 1;
        else return -1;
    }

    public String getId() {
        return id.substring(0, 1);
    }

    @Override
    public String toString() {
        return id + " " + nhap + " " + xuat + " " + donGia + " " + price + " " + thue;
    }

    

    
}
