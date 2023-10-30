package J05019;

public class Tram {
    private String id,name;
    private int time=0,pmm=0;
    private double tb;

    public Tram(int id, String name) {
        this.id = "T"+String.format("%02d",id);
        this.name = name;
    }

    public void setTime(String start, String end){
        String a[]=start.split(":"),b[]=end.split(":");
        this.time=this.time + (Integer.valueOf(b[0])-Integer.valueOf(a[0]))*60+Integer.valueOf(b[1])-Integer.valueOf(a[1]);
    }

    public void setPmm(int pmm){
        this.pmm=this.pmm+pmm;
    }

    public void setTB(){
        this.tb=Math.round(this.pmm*60.0*100/this.time)/100.0;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.2f", tb);
    }



    
}
