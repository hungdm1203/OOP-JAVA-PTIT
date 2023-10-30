package J05076;

public class MatHang {
    private String id,name,type;

    public MatHang(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

    
    
}
