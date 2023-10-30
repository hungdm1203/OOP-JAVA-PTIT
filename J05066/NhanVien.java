package J05066;

public class NhanVien implements Comparable<NhanVien> {
    private String id,name,position,number,step;

    public NhanVien(String id, String name) {
        this.id=id;
        this.name = name;
        this.position = id.substring(0, 2);
        this.number = id.substring(4);
        this.step = id.substring(2, 4);
        this.setPosition();
    }

    private void setPosition(){
        if(this.position.equals("GD") && Integer.valueOf(this.number)>1 || this.position.equals("TP") && Integer.valueOf(this.number)>3 || this.position.equals("PP") && Integer.valueOf(this.number)>3)
            this.position="NV";
    }

    @Override
    public String toString() {
        return name + " " + position + " " + number + " " + step;
    }

    public String getName(){
        return this.name.toLowerCase();
    }
    
    public int compareTo(NhanVien nv){
        if(this.step.equals(nv.step)) return this.number.compareTo(nv.number);
        return -this.step.compareTo(nv.step);
    }

    
}
