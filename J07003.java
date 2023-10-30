import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * tach doi va tinh tong
 */
public class J07003 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("DATA.in"));
        String s=scanner.nextLine();
        while(s.length()>1){
            BigInteger b1=new BigInteger(s.substring(0, (int)s.length()/2)), b2=new BigInteger(s.substring((int)s.length()/2));
            System.out.println(b1.add(b2));
            s=b1.add(b2).toString();
        }
    }
    
}