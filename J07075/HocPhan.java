package J07075;

public class HocPhan implements Comparable<HocPhan> {
    private String id;
    private Monhoc m;
    private String thu,kip,gv,phong;

    public HocPhan(int id, Monhoc m, String thu, String kip, String gv, String phong) {
        this.id = String.format("HP%03d", id);
        this.m = m;
        this.thu = thu;
        this.kip = kip;
        this.gv = gv;
        this.phong = phong;
    }
    
    public String getGv(){
        return gv;
    }

    @Override
    public String toString() {
        return id + " " + m.getName() + " " + thu + " " + kip + " " + phong;
    }

    public int compareTo(HocPhan hp){
        if(this.thu.equals(hp.thu)){
            if(this.kip.equals(hp.kip)){
                return this.gv.compareTo(hp.gv);
            } else return this.kip.compareTo(hp.kip);
        } else return this.thu.compareTo(hp.thu);
    }

}
