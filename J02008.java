import java.math.BigInteger;
import java.util.*;

/**
 * boi so nho nhat cua n so nguyen duong dau tien
 */
public class J02008 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            long n=scanner.nextLong();
            build(n);
        }
        scanner.close();
    }


    public static void build(long n){
        long res=1;
        for (int i = 1; i <= n; i++) {
            res=lcm(res,i);
        }
        System.out.println(res);
    }

    public static long gcd(long a,long b){
        BigInteger x=BigInteger.valueOf(a);
        BigInteger y=BigInteger.valueOf(b);
        return x.gcd(y).intValue();
    }

    public static long lcm(long a,long b){
        return a*b/gcd(a, b);
    }
    
}