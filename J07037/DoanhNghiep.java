package J07037;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String id,name;
    private int soLuong;


    public DoanhNghiep(String id, String name, String soLuong) {
        this.id = id;
        this.name = name;
        this.soLuong = Integer.valueOf(soLuong);
    }

    public int compareTo(DoanhNghiep dn){
        return this.id.compareTo(dn.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + soLuong;
    }

    

    
}
