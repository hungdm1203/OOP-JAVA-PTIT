package J05080;

public class HocPhan implements Comparable<HocPhan> {
    private String id,name,group,teacher;

    public HocPhan(String id, String name, String group, String teacher) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.teacher = teacher;
    }

    public int compareTo(HocPhan hp){
        if(this.id.equals(hp.id)) return this.group.compareTo(hp.group);
        return this.id.compareTo(hp.id);
    }

    public String getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + group;
    }

    

    
}
