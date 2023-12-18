package J07020;

public class Bill {
    private String id;
    private Guest g;
    private Product p;
    private long quantity,price;

    public Bill(int id, Guest g, Product p, long quantity) {
        this.id = String.format("HD%03d", id);
        this.g = g;
        this.p = p;
        this.quantity = quantity;
        this.price=this.quantity*this.p.getSell();
    }

    @Override
    public String toString() {
        return id+" "+g.toString()+" "+p.toString()+" "+quantity+" "+price;
    }

    
    
}
