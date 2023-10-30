package J07038;

public class ThucTap implements Comparable<ThucTap> {
    private SinhVien sv;
    private DoanhNghiep dn;

    
    public ThucTap(SinhVien sv, DoanhNghiep dn) {
        this.sv = sv;
        this.dn = dn;
    }

    public String getId() {
        return this.dn.getId();
    }

    public int compareTo(ThucTap tt){
        return this.sv.getMsv().compareTo(tt.sv.getMsv());
    }

    @Override
    public String toString() {
        return sv+"";
    }

    
}
