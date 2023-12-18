package J06006;

/**
 * Bill
 */
public class Bill implements Comparable<Bill> {

    private Guest g;
    private Items i;
    private String id;
    private int quantity,ln,price;

    public Bill(int id,Guest g,Items i,int quantity){
        this.id=String.format("HD%03d", id);
        this.g=g;
        this.i=i;
        this.quantity=quantity;
        this.price=this.i.getSell()*quantity;
        this.ln=(this.i.getSell()-this.i.getBuy())*quantity;
    }

    @Override
    public String toString() {
        return id+" "+g.getName()+" "+g.getAdd()+" "+i.getName()+" "+quantity+" "+price+" "+ln;
    }

    public int compareTo(Bill b){
        if(this.ln==b.ln) return this.id.compareTo(b.id);
        return -Integer.valueOf(this.ln).compareTo(Integer.valueOf(b.ln));
    }

}