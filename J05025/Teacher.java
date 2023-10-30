package J05025;

public class Teacher implements Comparable<Teacher> {
    private String id,fname,mon,name;

    public Teacher(int id, String fname, String mon, String name) {
        this.id = "GV"+String.format("%02d",id);
        this.fname = fname;
        this.mon = mon;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + fname + " " + mon;
    }

    public int compareTo(Teacher t){
        if(this.name.equals(t.name)){
            return this.id.compareTo(t.id);
        } else return this.name.compareTo(t.name);
    }
    

    
}
