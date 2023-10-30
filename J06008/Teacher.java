package J06008;
import java.util.*;

public class Teacher {
    private String id,name;
    private LinkedHashMap<Subject,Double> list;
    private double time;

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
        this.list = new LinkedHashMap<>();
        this.time = 0;
    }

    public void setTimeSubject(Subject s, double t){
        if(this.list.containsKey(s)){
            this.list.put(s, this.list.get(s)+t);
        } else this.list.put(s, t);
        this.time=this.time+t;
    }

    public String getId() {
        return id;
    }

    
    public void Res() {
        System.out.println("Giang vien: "+this.name);
        for (Subject s : this.list.keySet()) {
            System.out.println(s.getName()+" "+this.list.get(s));
        }
        System.out.printf("Tong: %.2f\n",this.time);
    }

    

    
}
