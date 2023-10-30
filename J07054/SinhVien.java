package J07054;

public class SinhVien implements Comparable<SinhVien> {
    private String id,name;
    private double a,b,c,tb;

    public SinhVien(int id, String name, double a, double b, double c) {
        this.id = "SV"+String.format("%02d",id);
        this.name = this.setName(name);
        this.a = a;
        this.b = b;
        this.c = c;
        this.tb=this.setTB();
    }

    private String setName(String s){
        String res="",str[]=s.toUpperCase().split("\\s+");
        for(int i=0;i<str.length;i++){
            if(i!=str.length-1) res+=str[i].charAt(0)+str[i].substring(1).toLowerCase()+" ";
            else res+=str[i].charAt(0)+str[i].substring(1).toLowerCase();
        }
        return res;
    }

    private double setTB(){
        return Math.round((this.a*3+this.b*3+this.c*2)*100/8)/100.0;
    }

    public int compareTo(SinhVien sv){
        if(this.tb<sv.tb) return 1;
        if(this.tb>sv.tb) return -1;
        return this.id.compareTo(sv.id);
    }
    

    public double getTb() {
        return tb;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", tb);
    }   
    
}
