package Thuchanh2.bai9;

public class Sinhvien implements Comparable<Sinhvien> {
    private String id,name,lop,email,sdt,tc,doan;

    public Sinhvien(String id, String name, String lop, String email, String std) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.sdt="0"+std;
        this.doan="";
    }

    public int compareTo(Sinhvien sv){
        return this.id.compareTo(sv.id);
    }

    public void setDoan(String s,String tmp){
        this.tc=s;
        this.doan=tmp;
    }
    public String getDOAN(){
        return doan;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + tc + " " + doan + " " + sdt;
    }
 

    
}
