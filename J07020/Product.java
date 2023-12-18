package J07020;

public class Product {
    private String id,name,unit;
    private long buy,sell;
    
    public Product(int id, String name, String unit, long buy, long sell) {
        this.id = String.format("MH%03d", id);
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
    }

    public long getSell(){
        return sell;
    }

    @Override
    public String toString() {
        return name + " " + unit + " " + buy + " " + sell;
    }

    
    
}
