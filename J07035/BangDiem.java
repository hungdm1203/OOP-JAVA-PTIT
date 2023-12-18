package J07035;

public class BangDiem implements Comparable<BangDiem> {
    private SinhVien s;
    private MonHoc m;
    private String diem;
    private double score;

    public BangDiem(SinhVien s, MonHoc m, double diem) {
        this.s = s;
        this.m = m;
        if(diem-(int)diem==0){
            this.diem=String.valueOf((int)diem);
        } else this.diem=String.format("%.1f", diem);
        this.score=diem;
    }

    @Override
    public String toString() {
        return s.getMsv()+" "+s.getName()+" "+s.getLop()+" "+diem;
    }

    public int compareTo(BangDiem b){
        if(this.score<b.score) return 1;
        else if(this.score>b.score) return -1;
        else return this.s.getMsv().compareTo(b.s.getMsv());
    }   
    
    public String getID(){
        return this.m.getId();
    }
    
}
