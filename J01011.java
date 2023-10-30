import java.math.BigInteger;
import java.util.Scanner;

/**
 * bcnn-ucln
 */
public class J01011 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            BigInteger a=scanner.nextBigInteger();
            BigInteger b=scanner.nextBigInteger();
            BigInteger gcd=a.gcd(b);
            BigInteger lcm=a.multiply(b).divide(gcd);
            System.out.println(lcm+" "+gcd);
        }
        scanner.close();
    }
}