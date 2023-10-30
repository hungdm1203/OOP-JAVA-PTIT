package J05081;

public class MatHang implements Comparable<MatHang> {
    private String id,name,donVi;
    private long mua,ban,loiNhuan;

    public MatHang(int id, String name, String donVi, long mua, long ban, long loiNhuan) {
        this.id = "MH"+String.format("%03d", id);
        this.name = name;
        this.donVi = donVi;
        this.mua = mua;
        this.ban = ban;
        this.loiNhuan = loiNhuan;
    }

    public int compareTo(MatHang mh){
        if(this.loiNhuan<mh.loiNhuan){
            return 1;
        } else if(this.loiNhuan>mh.loiNhuan){
            return -1;
        } else{
            if(this.id.compareTo(mh.id)<0){
                return -1;
            } else return 1;
        }
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + donVi + " " + mua + " " + ban + " " + loiNhuan;
    }

    
    
}
