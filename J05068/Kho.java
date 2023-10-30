package J05068;

public class Kho implements Comparable<Kho> {
    private String ma, hang;
    private long sl,dg,thue,thanhTien;
    
    public Kho(String ma, long sl) {
        this.ma = ma;
        this.sl = sl;
        this.hang=Hang(ma);
        this.dg=DonGia(ma);
        this.thue=(long)(this.dg*this.sl*Thue(ma)/100);
        this.thanhTien=this.thue+this.dg*this.sl;
    }

    public String Hang(String s){
        s=s.substring(3);
        if(s.equals("BP")) return "British Petro";
        if(s.equals("ES")) return "Esso";
        if(s.equals("SH")) return "Shell";
        if(s.equals("CA")) return "Castrol";
        if(s.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }

    public long DonGia(String s){
        if(s.charAt(0)=='X') return 128000;
        if(s.charAt(0)=='D') return 11200;
        return 9700;
    }

    public double Thue(String s){
        if(s.substring(3).equals("TN")) return 0.0;
        if(s.charAt(0)=='X') return 3.0;
        if(s.charAt(0)=='D') return 3.5;
        return 2.0;
    }

    @Override
    public String toString() {
        return ma + " " + hang + " " + dg + " " + thue + " " + thanhTien;
    }

    public int compareTo(Kho k){
        if(this.thanhTien<k.thanhTien)
            return 1;
        else return -1;
    }
    
    
}
