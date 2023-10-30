package J05041;

public class NhanVien implements Comparable<NhanVien> {
    private String id,name,cvu;
    private long lcb,nc,luongThang,thuong,pc,thuNhap;
    public NhanVien(int id, String name, long lcb, long nc, String cvu) {
        this.id = "NV"+String.format("%02d", id);
        this.name = name;
        this.lcb = lcb;
        this.nc = nc;
        this.cvu = cvu;
        this.luongThang=lcb*nc;
        
        if(nc>=25){
            this.thuong=luongThang*20/100;
        } else if(nc>=22){
            this.thuong=luongThang*10/100;
        } else this.thuong=0;
        
        
        if(cvu.equals("GD"))
            this.pc=250000;
        else if(cvu.equals("PGD"))
            this.pc=200000;
        else if(cvu.equals("TP"))
            this.pc=180000;
        else this.pc=150000;

        this.thuNhap=this.luongThang+this.thuong+this.pc;
    }


    public int compareTo(NhanVien nv){
        if(this.thuNhap<nv.thuNhap)
            return 1;
        else return -1;
    }


    


    public String getCvu() {
        return cvu;
    }


    public long getLcb() {
        return lcb;
    }


    public long getNc() {
        return nc;
    }


    @Override
    public String toString() {
        return id + " " + name + " " + luongThang + " " + thuong + " " + pc + " " + thuNhap;
    }

    

    
}
