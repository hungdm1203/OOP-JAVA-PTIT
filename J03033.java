import java.math.BigInteger;
import java.util.Scanner;

/**
 * boi so chung nho nhat
 */
public class J03033 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            BigInteger a=new BigInteger(scanner.next());
            BigInteger b=new BigInteger(scanner.next());
            System.out.println( a.multiply(b).divide(a.gcd(b)) );
        }
        scanner.close();
    }
}