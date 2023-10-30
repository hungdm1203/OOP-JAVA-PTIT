package Thuchanh2;
import java.math.BigInteger;
import java.util.*;


public class bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        while(s.length()>1){
            BigInteger b1=new BigInteger(s.substring(0, (int)s.length()/2)), b2=new BigInteger(s.substring((int)s.length()/2));
            System.out.println(b1.add(b2));
            s=b1.add(b2).toString();
        }
    }
    
}