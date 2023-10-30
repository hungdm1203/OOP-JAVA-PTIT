import java.math.BigInteger;
import java.util.Scanner;

/**
 * uoc so chung lon nhat cua so nguyen lon
 */
public class J03011 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            BigInteger a=scanner.nextBigInteger();
            BigInteger b=scanner.nextBigInteger();
            System.out.println(a.gcd(b));
        }
        scanner.close();
    }
}