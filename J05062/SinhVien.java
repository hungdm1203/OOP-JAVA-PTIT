package J05062;

public class SinhVien implements Comparable<SinhVien> {
    private String name,hb;
    private double gpa;
    private int rl;

    public SinhVien(String name, double gpa, int rl) {
        this.name = name;
        this.gpa = gpa;
        this.rl = rl;
        this.hb=this.setHB();
    }

    public String setHB(){
        if(this.gpa>=3.6 && this.rl>=90) return "XUATSAC";
        if(this.gpa>=3.2 && this.rl>=80) return "GIOI";
        if(this.gpa>=2.5 && this.rl>=70) return "KHA";
        return "x";
    }

    public double getGPA(){
        return this.gpa;
    }

    public String getHB(){
        return this.hb;
    }

    public String getName() {
        return name;
    }

    public int compareTo(SinhVien sv){
        if(this.gpa<sv.gpa) return 1;
        else if(this.gpa>sv.gpa) return -1;
        else{
            if(this.rl<sv.rl) return 1;
            return -1;
        }
    }


    @Override
    public String toString() {
        return name + ": " + hb;
    }

    
        
}
