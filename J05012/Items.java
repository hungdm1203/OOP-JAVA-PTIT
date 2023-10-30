package J05012;

public class Items implements Comparable<Items> {
    private String id,name;
    private long quantity,price,discount,sum;

    public Items(String id, String name, long quantity, long price, long discount) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
        this.sum=this.price*this.quantity-this.discount;
    }

    public int compareTo(Items i){
        if(this.sum<i.sum) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + quantity + " " + price + " " + discount + " " + sum;
    }

    


}
