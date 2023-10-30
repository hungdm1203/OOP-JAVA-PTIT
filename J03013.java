import java.math.BigInteger;
import java.util.Scanner;

/**
 * hieu so nguyen lon 1
 */
public class J03013 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t= scanner.nextInt();
        while (t-->0) {
            BigInteger a=scanner.nextBigInteger();
            BigInteger b=scanner.nextBigInteger();
            BigInteger c=a.subtract(b).abs();
            String ss=c.toString();
            int len=Math.max(a.toString().length(), b.toString().length());
            while (ss.length()<len) {
                ss='0'+ss;
            }
            System.out.println(ss);
        }
        scanner.close();
    }
}