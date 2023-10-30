package J05047;

public class MatHang implements Comparable<MatHang> {
    private String id,name;
    private long sl,dg,ck,tt;
    
    public MatHang(String id, String name, String sl, String dg) {
        this.id = id;
        this.name = name;
        this.sl = Long.valueOf(sl);
        this.dg = Long.valueOf(dg);
        if(this.sl>10)
            this.ck=this.dg*this.sl*5/100;
        else if(this.sl>=8)
            this.ck=this.dg*this.sl*2/100;
        else if(this.sl>=5)
            this.ck=this.dg*this.sl*1/100;
        else this.ck=0;
        this.tt = this.sl*this.dg-this.ck;
    }


    public int compareTo(MatHang mh){
        if(this.ck<mh.ck)
            return 1;
        else return -1;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + ck + " " + tt;
    }
    
}
