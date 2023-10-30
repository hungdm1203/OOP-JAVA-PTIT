import java.math.BigInteger;
import java.util.Scanner;

/**
 * tong so nguyen lon-1
 */
public class J03012 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t= scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            BigInteger a=scanner.nextBigInteger();
            BigInteger b=scanner.nextBigInteger();
            System.out.println(a.add(b));
        }
        scanner.close();
    }
}