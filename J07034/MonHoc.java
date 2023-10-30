package J07034;

public class MonHoc implements Comparable<MonHoc> {
    private String maMonHoc,ten;
    private int tc;

    public MonHoc(String maMonHoc, String ten, String tc) {
        this.maMonHoc = maMonHoc;
        this.ten = ten;
        this.tc = Integer.valueOf(tc);
    }


    public int compareTo(MonHoc mh){
        return this.ten.compareTo(mh.ten);
    }



    @Override
    public String toString() {
        return maMonHoc + " " + ten + " " + tc;
    }

    

    
}
