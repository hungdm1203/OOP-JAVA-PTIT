package TH14;

public class HoiDong implements Comparable<HoiDong> {
    private SinhVien sv;
    private DeTai dt;
    private int stt;
    public HoiDong(SinhVien sv, DeTai dt, int stt) {
        this.sv = sv;
        this.dt = dt;
        this.stt=stt;
    }

    public int getStt(){
        return this.stt;
    }

    @Override
    public String toString() {
        return sv + " " + dt;
    }

    public int compareTo(HoiDong hd){
        if(this.stt<hd.stt)
            return -1;
        else if(this.stt>hd.stt)
            return 1;
        else return this.sv.compareTo(hd.sv);
    }

    
    
}
