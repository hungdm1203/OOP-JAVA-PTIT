package J05029;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String id,name;
    private int soLuong;

    public DoanhNghiep(String id, String name, int soLuong) {
        this.id = id;
        this.name = name;
        this.soLuong = soLuong;
    }

    public int compareTo(DoanhNghiep dn){
        if(this.soLuong<dn.soLuong)
            return 1;
        else if(this.soLuong>dn.soLuong)
            return -1;
        else return this.id.compareTo(dn.id);
    }

    public int getSoLuong() {
        return soLuong;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + soLuong;
    }

    

    
}
