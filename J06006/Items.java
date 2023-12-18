package J06006;

/**
 * Items
 */
public class Items {

    private String id,name,type;
    private int buy,sell;

    public Items(int id, String name, String type, int buy, int sell) {
        this.id = String.format("MH%03d", id);
        this.name = name;
        this.type = type;
        this.buy = buy;
        this.sell = sell;
    }

    public String getName() {
        return name;
    }

    public int getBuy() {
        return buy;
    }

    public int getSell() {
        return sell;
    }

    
    
}