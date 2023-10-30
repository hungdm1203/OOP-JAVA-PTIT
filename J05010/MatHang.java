package J05010;

public class MatHang implements Comparable<MatHang> {
    private int id;
    private String ten,nhom;
    private double loinhuan;


    public MatHang(int id, String ten, String nhom, double loinhuan) {
        this.id=id;
        this.ten = ten;
        this.nhom = nhom;
        this.loinhuan = loinhuan;
    }


    @Override
    public String toString() {
        return id + " " + ten + " " + nhom + " " + String.format("%.2f", loinhuan);
    }

    public int compareTo(MatHang mh){
        if(this.loinhuan<mh.loinhuan)
            return 1;
        else if(this.loinhuan>mh.loinhuan)
            return -1;
        else return this.id-mh.id;
    }


    
}
