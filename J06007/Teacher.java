package J06007;

public class Teacher {
    private String id,name;
    private double time;

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
        this.time=0;
    }
 
    public String getID(){
        return this.id;
    }

    public void setTime(double t){
        this.time=this.time+t;
    }

    @Override
    public String toString() {
        return name + " " + String.format("%.2f", time);
    }
    
}
