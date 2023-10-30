package J06005;

public class Items {
    private String itemID,nameItem,unit;
    private int buy,sell;

    public Items(int itemID, String nameItem, String unit, int buy, int sell) {
        this.itemID = "MH"+String.format("%03d", itemID);
        this.nameItem = nameItem;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
    }

    

    public int getSell() {
        return sell;
    }



    @Override
    public String toString() {
        return nameItem + " " + unit + " " + buy + " " + sell;
    }


}
