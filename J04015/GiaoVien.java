package J04015;

public class GiaoVien {
    private String mangach,name;
    private long luong;
    
    
    public GiaoVien(String mangach, String name, long luong) {
        this.mangach = mangach;
        this.name = name;
        this.luong = luong;
    }


    public int getMangach() {
        return Integer.parseInt(mangach.substring(2));
    }

    public long getPhucap() {
        if(this.mangach.contains("HP")){
            return 900000;
        } else if(this.mangach.contains("HT")){
            return 2000000;
        } else return 500000;
    }

    public long getThunhap() {
        return this.luong*this.getMangach()+this.getPhucap();
    }


    @Override
    public String toString() {
        return mangach +" "+ name +" "+ this.getMangach() +" "+ this.getPhucap() +" "+this.getThunhap();
    }
    
    
}
