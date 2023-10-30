package J04012;

public class NhanVien {
    private String mnv,name,position;
    private long luong,ngaycong;
    
    
    public NhanVien(String name, long luong, long ngaycong, String position) {
        this.mnv = "NV01";
        this.name = name;
        this.position = position;
        this.luong = luong;
        this.ngaycong = ngaycong;
    }


    public long getPhucap() {
        if( this.position.equals("GD")){
            return 250000;
        } else if(this.position.equals("PGD")){
            return 200000;
        } else if(this.position.equals("TP")){
            return 180000;
        } else return 150000;
    }


    public long getLuong() {
        return this.luong*this.ngaycong;
    }

    public long getThuong(){
        if(this.ngaycong>=25){
            return this.getLuong()*20/100;
        } else if(this.ngaycong>=22 && this.ngaycong<25){
            return this.getLuong()*10/100;
        } else return 0;
    }


    public long getThunhap(){
        return this.getLuong()+this.getPhucap()+this.getThuong();
    }


    @Override
    public String toString() {
        return mnv + " " + name + " " + this.getLuong() + " " + this.getThuong() + " " + this.getPhucap() + " " + this.getThunhap();
    }
    

    

}
