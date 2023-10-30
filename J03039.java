import java.math.BigInteger;
import java.util.Scanner;

/**
 * chia het
 */
public class J03039 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s1=scanner.next(), s2=scanner.next();
            BigInteger a=new BigInteger(s1), b=new BigInteger(s2);
            if(a.divide(b).multiply(b).equals(a) ||b.divide(a).multiply(a).equals(b)){
                System.out.println("YES");
            } else System.out.println("NO");
        }
        scanner.close();
    }
}