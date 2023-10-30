import java.math.BigInteger;
import java.util.Scanner;

/**
 * tong phan so
 */



class Pso {
    private long a,b;

    public Pso(long a, long b) {
        this.a = a;
        this.b = b;
    }


    public Pso rutgon(){
        BigInteger tu=new BigInteger(String.valueOf(this.a)), mau=new BigInteger(String.valueOf(this.b));
        BigInteger gcd=tu.gcd(mau);
        
        return new Pso(tu.divide(gcd).longValue(),mau.divide(gcd).longValue());
    }


    public Pso cong(Pso ps2){
        BigInteger tups1=new BigInteger(String.valueOf(this.a)), tups2=new BigInteger(String.valueOf(ps2.a));
        BigInteger maups1=new BigInteger(String.valueOf(this.b)), maups2=new BigInteger(String.valueOf(ps2.b));
        long newa=(tups1.multiply(maups2)).add(tups2.multiply(maups1)).longValue();
        long newb=maups1.multiply(maups2).longValue();
        return new Pso(newa,newb).rutgon();
    }


    @Override
    public String toString() {
        return a + "/" + b;
    }

    
}


public class J04004 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pso ps1=new Pso(scanner.nextLong(), scanner.nextLong()), ps2=new Pso(scanner.nextLong(), scanner.nextLong());
        System.out.println(ps1.cong(ps2).toString());
        scanner.close();
    }
}