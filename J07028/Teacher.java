package J07028;
import java.util.*;

public class Teacher {
    private String id,name;
    private double time;

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
        this.time=0;
    }

    public void setTime(double d){
        this.time=this.time+d;
    }

    @Override
    public String toString() {
        return name + " " + String.format("%.2f", time);
    }

}
