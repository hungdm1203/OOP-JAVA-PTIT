package J04020;

public class Pair<First, Second> {
    private First a;
    private Second b;

    public Pair(First a, Second b) {
        this.a = a;
        this.b = b;
    }

    public boolean check(int n){
        if(n<2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    public boolean isPrime(){
        if(this.check((Integer)this.a) && this.check((Integer)this.b)){
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return a + " " + b;
    }

    


}
