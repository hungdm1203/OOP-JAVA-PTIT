package J07038;

public class DoanhNghiep {
    private String id,tenDN;
    private int quantity;

    public DoanhNghiep(String id, String tenDN, int quantity) {
        this.id = id;
        this.tenDN = tenDN;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getTenDN() {
        return tenDN;
    }

    public int getQuantity() {
        return quantity;
    }

    
}
