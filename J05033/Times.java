package J05033;



public class Times implements Comparable<Times> {
    private int a,b,c;

    public Times(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int compareTo(Times tm){
        long t1=this.a*3600+this.b*60+this.c;
        long t2=tm.a*3600+tm.b*60+tm.c;
        if(t1<t2)
            return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return a + " " + b + " " + c;
    }
   
    
}
