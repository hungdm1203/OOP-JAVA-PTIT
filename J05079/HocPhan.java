package J05079;

public class HocPhan implements Comparable<HocPhan> {
    private String id,name,group,teacher;

    public HocPhan(String id, String name, String group, String teacher) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.teacher = teacher;
    }

    public int compareTo(HocPhan hp){
        return this.group.compareTo(hp.group);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return group + " " + teacher;
    }

    

    
}
