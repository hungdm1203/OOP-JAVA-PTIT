package J06006;

public class Items {
    private String id,name,unit;
    private int buy,sell;

    public Items(int id, String name, String unit, int buy, int sell) {
        this.id = "MH" + String.format("%03d",id);
        this.name = name;
        this.unit = unit;
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
