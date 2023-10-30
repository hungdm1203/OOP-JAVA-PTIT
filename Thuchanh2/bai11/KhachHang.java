package Thuchanh2.bai11;

public class KhachHang implements Comparable<KhachHang> {
    private String id,name,add,time;
    private SanPham sp;
    private int soluong,price;

    public KhachHang(int id, String name, String add, String time, SanPham sp, int soluong) {
        this.id = "KH"+String.format("%02d",id);
        this.name = name;
        this.add = add;
        this.time = time;
        this.sp = sp;
        this.soluong = soluong;
        this.price=this.soluong*this.sp.getGia();
        this.setTime();
    }

    public void setTime(){
        String str[]=time.split("/");
        int t=this.sp.getBH()%12;
        int n=(int)this.sp.getBH()/12;
        this.time= String.format("%02d", Integer.valueOf(str[0]))+"/"+String.format("%02d",Integer.valueOf(str[1])+t)+"/"+(Integer.valueOf(str[2])+n);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + add + " " + sp.getID() + " " + price + " " + time;
    }

    public int compareTo(KhachHang k){
        return solve(this.time).compareTo(solve(k.time));
    }
    
    public String solve(String s) {
        String[] a = s.split("/");
        String res = "";
        for (int i = 0; i < a.length; i++) {
            res += a[a.length - i - 1];
        }
        return res;
    }
}
