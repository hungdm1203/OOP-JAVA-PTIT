import java.math.BigInteger;
import java.util.Scanner;

/**
 * chia het cho 11
 */
public class J03016 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            BigInteger n=scanner.nextBigInteger();
            BigInteger k=new BigInteger("11");
            if((n.remainder(k)).equals(BigInteger.ZERO)){
                System.out.println(1);
            } else System.out.println(0);
        }
        scanner.close();
    }
}