package J05052;

public class MatHang implements Comparable<MatHang> {
    private String name,id,stt;
    private long dg,sl,giam,tt;

    public MatHang(String name, String id, long dg, long sl) {
        this.name = name;
        this.id = id;
        this.dg = dg;
        this.sl = sl;
        this.stt=id.substring(1, 4);

        if(id.charAt(4)=='1')
            this.giam=50*dg*sl/100;
        else this.giam=30*dg*sl/100;

        this.tt=dg*sl-this.giam;
    }

    public int compareTo(MatHang mh){
        return this.stt.compareTo(mh.stt);
    }


    @Override
    public String toString() {
        return name + " " + id + " " + stt + " " + giam + " " + tt;
    }










    

    public long getDg() {
        return dg;
    }

    public long getSl() {
        return sl;
    }


    
    
}
