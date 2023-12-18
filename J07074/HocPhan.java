package J07074;

public class HocPhan implements Comparable<HocPhan> {
    private String id,thu,kip,gv,phong;
    private MonHoc m;

    public HocPhan(int i,MonHoc m, String thu, String kip, String gv, String phong){
        this.id=String.format("HP%03d",i);
        this.m=m;
        this.thu=thu;
        this.kip=kip;
        this.gv=gv;
        this.phong=phong;
    }

    public MonHoc getMonHoc(){
        return m;
    }

    public int compareTo(HocPhan hp){
        if(this.thu.equals(hp.thu)){
            if(this.kip.equals(hp.kip)) return this.gv.compareTo(hp.gv);
            else return this.kip.compareTo(hp.kip);
        } else return this.thu.compareTo(hp.thu);
    }

    @Override
    public String toString() {
        return id + " " + thu + " " + kip + " " + gv + " " + phong;
    }

}
