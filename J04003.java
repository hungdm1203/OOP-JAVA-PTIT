import java.math.BigInteger;
import java.util.Scanner;

/**
 * phan so
 */



class Pso {
    private long a,b;

    public Pso(long a, long b) {
        this.a = a;
        this.b = b;
    }

    public String rutgon(){
        BigInteger tu=new BigInteger(String.valueOf(this.a)), mau=new BigInteger(String.valueOf(this.b));
        BigInteger gcd=tu.gcd(mau);
        
        return tu.divide(gcd).toString()+"/"+mau.divide(gcd).toString();
    }

}


public class J04003 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pso ps=new Pso(scanner.nextLong(), scanner.nextLong());
        System.out.println(ps.rutgon());
        scanner.close();
    }
}