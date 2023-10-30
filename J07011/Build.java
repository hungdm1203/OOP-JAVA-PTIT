package J07011;

public class Build implements Comparable<Build> {
    private String s;
    private int n;

    public Build(String s, int n){
        this.s=s;
        this.n=n;
    }

    public int compareTo(Build b){
        if(this.n<b.n) return 1;
        if(this.n>b.n) return -1;
        return this.s.compareTo(b.s);
    }

    @Override
    public String toString() {
        return s + " " + n;
    }
    

}
