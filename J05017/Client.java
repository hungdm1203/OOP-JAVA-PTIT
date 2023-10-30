package J05017;

public class Client implements Comparable<Client> {
    private String id,name;
    private int old,neww,price;

    public Client(int id, String name, int old, int neww) {
        this.id = "KH"+String.format("%02d", id);
        this.name = name;
        this.old = old;
        this.neww = neww;
        this.price=this.setPrice();
    }

    private int setPrice(){
        int x=this.neww-this.old;
        if(x>100) return (int)Math.round(50*100*1.05+50*150*1.05+(x-100)*200*1.05);
        if(x>50) return (int)Math.round(50*100*1.03+(x-50)*1.03*150);
        return (int)Math.round((x*100*1.02));
    }

    public int compareTo(Client c){
        if(this.price<c.price) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price;
    }    
    
}
