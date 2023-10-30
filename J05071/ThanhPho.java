package J05071;

public class ThanhPho {
    private String id,name;
    private int giaCuoc;

    public ThanhPho(String id, String name, int giaCuoc) {
        this.id = id;
        this.name = name;
        this.giaCuoc = giaCuoc;
    }

    public String getName() {
        return name;
    }

    public int getGiaCuoc() {
        return giaCuoc;
    }
    
    
}
