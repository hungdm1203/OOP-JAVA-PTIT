package J07017;

public class Pair<First,Second> {
    private First first;
    private Second second;
    
    public Pair(First first, Second second) {
        this.first = first;
        this.second = second;
    }    

    public boolean check(int n){
        if(n<2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    public boolean isPrime(){
        if(this.check((Integer)this.first) && this.check((Integer)this.second)) return true;
        return false;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }  



}
