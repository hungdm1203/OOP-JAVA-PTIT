package J05065;

public class NhanVien implements Comparable<NhanVien> {
    private String name,position,number,step;

    public NhanVien(String name, String position, String number, String step) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.step = step;
    }

    @Override
    public String toString() {
        return name + " " + position + " " + number + " " + step;
    }

    public String getPosition(){
        return this.position;
    }
    
    public int compareTo(NhanVien nv){
        if(this.step.equals(nv.step)) return this.number.compareTo(nv.number);
        return -this.step.compareTo(nv.step);
    }

    
}