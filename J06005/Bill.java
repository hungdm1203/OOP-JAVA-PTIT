package J06005;

public class Bill {
    private String id;
    private Guest guest;
    private Items item;
    private int quantity,price;

    public Bill(int id, Guest guest, Items item, int quantity) {
        this.id = "HD"+String.format("%03d",id);
        this.guest = guest;
        this.item = item;
        this.quantity = quantity;
        this.price=this.setPrice();
    }

    private int setPrice(){
        return this.quantity*this.item.getSell();
    }

    @Override
    public String toString() {
        return id + " " + guest + " " + item + " " + quantity + " " + price;
    }

    
    
}
