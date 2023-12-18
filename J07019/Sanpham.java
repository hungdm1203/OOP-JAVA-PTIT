package J07019;

public class Sanpham {
    private String id,name;
    private int l1,l2;

    public Sanpham(String id, String name, int l1, int l2) {
        this.id = id;
        this.name = name;
        this.l1 = l1;
        this.l2 = l2;
    }

    public String getName(){
        return name;
    }

    public int getL1() {
        return l1;
    }

    public int getL2() {
        return l2;
    }


    
}
