import java.math.BigInteger;
import java.util.Scanner;

/**
 * hieu songuyen lon 2
 */
public class J03015 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine(), s2=scanner.nextLine();
        BigInteger a=new BigInteger(s1); 
        BigInteger b=new BigInteger(s2);
        System.out.println(a.subtract(b));
        scanner.close();
    }
}