package J07048;

public class SanPham implements Comparable<SanPham> {
    private String id,name;
    private long price,time;

    public SanPham(String id, String name, String price, String time) {
        this.id = id;
        this.name = name;
        this.price = Long.valueOf(price);
        this.time = Long.valueOf(time);
    }

    public int compareTo(SanPham sp){
        if(this.price==sp.price){
            return this.id.compareTo(sp.id);
        } else{
            if(this.price<sp.price){
                return 1;
            } else return -1;
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + time;
    }

    
    
}
