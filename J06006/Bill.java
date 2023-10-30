package J06006;

public class Bill implements Comparable<Bill> {
    private String id;
    private Guest g;
    private Items it;
    private int quantity,price,profit;
    
    public Bill(int id, Guest g, Items it, int quantity) {
        this.id = "HD" + String.format("%03d",id);
        this.g = g;
        this.it = it;
        this.quantity = quantity;
        this.setPrice();
        this.setProfit();
    }

    private void setPrice(){
        this.price=this.quantity*this.it.getSell();
    }

    private void setProfit(){
        this.profit=this.quantity*(this.it.getSell()-this.it.getBuy());
    }

    @Override
    public String toString() {
        return id + " " + g.getName() + " " + g.getAdd() + " " + it.getName() + " " + quantity + " " + price + " " + profit;
    }

    public int compareTo(Bill b){
        if(this.profit< b.profit) return 1;
        else if(this.profit>b.profit) return -1;
        return this.id.compareTo(b.id);
    }
    
    
}
