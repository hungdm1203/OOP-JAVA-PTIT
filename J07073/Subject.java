package J07073;

public class Subject implements Comparable<Subject> {
    private String id,name,stc,lt,th;

    public Subject(String id, String name, String stc, String lt, String th) {
        this.id = id;
        this.name = name;
        this.stc = stc;
        this.lt = lt;
        this.th = th;
    }

    public String getTH(){
        return th;
    }

    public int compareTo(Subject s){
        return this.id.compareTo(s.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + stc + " " + lt + " " + th;
    }

    
    
}
