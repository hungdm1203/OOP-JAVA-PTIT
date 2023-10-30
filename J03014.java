import java.math.BigInteger;
import java.util.Scanner;

/**
 * tong so nguyen lon-2
 */
public class J03014 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigInteger a=scanner.nextBigInteger();
        BigInteger b=scanner.nextBigInteger();
        System.out.println(a.add(b));
        scanner.close();
    }
}