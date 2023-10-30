package J05042;

public class SinhVien implements Comparable<SinhVien>{
    private String name;
    private int ac,submit;


    public SinhVien(String name, int ac, int submit) {
        this.name = name;
        this.ac = ac;
        this.submit = submit;
    }

    public int compareTo(SinhVien sv){
        if(this.ac<sv.ac){
            return 1;
        } else if(this.ac>sv.ac){
            return -1;
        } else{
            if(this.submit<sv.submit)
                return -1;
            else if(this.submit>sv.submit)
                return 1;
            else return this.name.compareTo(sv.name);
        }
    }

    @Override
    public String toString() {
        return name + " " + ac + " " + submit;
    }

    
    
}
