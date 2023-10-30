
import java.math.BigInteger;
import java.util.Scanner;

/**
 * TH2
 */
public class TH2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        while (s.length()>=2) {
            BigInteger s1=new BigInteger(s.substring(0, (int)s.length()/2)), s2=new BigInteger(s.substring((int)s.length()/2));
            BigInteger s3=s1.add(s2);
            System.out.println(s3);
            s=s3.toString();
        }
        scanner.close();
    }
}