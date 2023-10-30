package J05044;

public class NhanVien {
    private String id,name,cvu;
    private long lcb,nc,pc,luong,ung,conLai;
    public NhanVien(int id, String name, String cvu, long lcb, long nc) {
        this.id = "NV"+String.format("%02d", id);
        this.name = name;
        this.cvu = cvu;
        this.lcb = lcb;
        this.nc = nc;
        this.luong=lcb*nc;
        
        if(cvu.equals("GD"))
            this.pc=500;
        else if(cvu.equals("PGD"))
            this.pc=400;
        else if(cvu.equals("TP"))
            this.pc=300;
        else if(cvu.equals("KT"))
            this.pc=250;
        else this.pc=100;

        if((this.pc+this.luong)*2/3<25000){
            this.ung=Math.round(((this.pc+this.luong)*2/3)/1000.0)*1000;
        } else this.ung=25000;

        this.conLai=this.luong+this.pc-this.ung;
    }

    
    public String getCvu() {
        return cvu;
    }


    @Override
    public String toString() {
        return id + " " + name + " " + pc + " " + luong + " " + ung + " " + conLai;
    }











    public long getLcb() {
        return lcb;
    }


    public long getNc() {
        return nc;
    }
}
