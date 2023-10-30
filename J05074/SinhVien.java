package J05074;

public class SinhVien {
    private String msv,name,lop,note="";
    private int cc;

    public SinhVien(String msv, String name, String lop) {
        this.msv = msv;
        this.name = name;
        this.lop = lop;
    }

    public void setCC(String s){
        int d=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='v') d+=2;
            if(s.charAt(i)=='m') d++;
        }
        if(d>=10){
            this.cc=0;
            this.note="KDDK";
        } else {
            this.cc=10-d;
            this.note="";
        }
    }

    public String getLop(){
        return this.lop;
    }

    @Override
    public String toString() {
        if(this.note.isEmpty()) return msv + " " + name + " " + lop + " " + cc + " " + note;
        return msv + " " + name + " " + lop + " " + cc + " " + note;
    }

    
    
}
