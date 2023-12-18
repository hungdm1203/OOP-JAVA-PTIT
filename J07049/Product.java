package J07049;

public class Product {
    private String id,name;
    private int sell,time;

    public Product(String id, String name, int sell, int time) {
        this.id = id;
        this.name = name;
        this.sell = sell;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public int getSell() {
        return sell;
    }

    public int getTime() {
        return time;
    }

    
    
}
