package J05077;

public class NhanVien {
    private String id,name;
    private int lcb,nc;
    private PhongBan pb;
    private long luong;

    public NhanVien(String id, String name, int lcb, int nc, PhongBan pb) {
        this.id = id;
        this.name = name;
        this.lcb = lcb*1000;
        this.nc = nc;
        this.pb = pb;
        this.luong=this.tinhLuong();
    }


    @Override
    public String toString() {
        return id + " " + name + " " + pb + " " + luong;
    }

    public long tinhLuong(){
        char c=this.id.charAt(0);
        int n=Integer.valueOf(this.id.substring(1,3));
        if(c=='A'){
            if(n>=16) return this.lcb*this.nc*20;
            if(n>=9) return this.lcb*this.nc*14;
            if(n>=4) return this.lcb*this.nc*12;
            if(n>=1) return this.lcb*this.nc*10;
        } else if(c=='B'){
            if(n>=16) return this.lcb*this.nc*16;
            if(n>=9) return this.lcb*this.nc*13;
            if(n>=4) return this.lcb*this.nc*11;
            if(n>=1) return this.lcb*this.nc*10;
        } else if(c=='C'){
            if(n>=16) return this.lcb*this.nc*14;
            if(n>=9) return this.lcb*this.nc*12;
            if(n>=4) return this.lcb*this.nc*10;
            if(n>=1) return this.lcb*this.nc*9;
        } else{
            if(n>=16) return this.lcb*this.nc*13;
            if(n>=9) return this.lcb*this.nc*11;
            if(n>=4) return this.lcb*this.nc*9;
            if(n>=1) return this.lcb*this.nc*8;
        }
        return this.lcb*this.nc;
    }
    
    
}
