package TH12;

public class Number implements Comparable<Number> {
    private long a1;
    private int a2,a3;
    public Number(long a1, int a2, int a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public int compareTo(Number s){
        if(this.a2<s.a2)
            return 1;
        else if(this.a2>s.a2)
            return -1;
        else {
            if(this.a3<s.a3) return -1;
            return 1;
        }
    }

    public int getA2() {
        return a2;
    }

    public long getA1() {
        return a1;
    }  



}
