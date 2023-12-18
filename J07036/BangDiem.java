package J07036;

public class BangDiem implements Comparable<BangDiem> {
    private SinhVien s;
    private MonHoc m;
    private String diem;

    public BangDiem(SinhVien s, MonHoc m, double diem) {
        this.s = s;
        this.m = m;
        if(diem-(int)diem==0){
            this.diem=String.valueOf((int)diem);
        } else this.diem=String.format("%.1f", diem);
    }

    @Override
    public String toString() {
        return s.getMsv()+" "+s.getName()+" "+m.getId()+" "+m.getName()+" "+diem;
    }

    public int compareTo(BangDiem b){
        if(this.m.getId().equals(b.m.getId())){
            return this.s.getMsv().compareTo(b.s.getMsv());
        } else return this.m.getId().compareTo(b.m.getId());
    }   
    
    public String getLop(){
        return this.s.getLop();
    }
    
}
