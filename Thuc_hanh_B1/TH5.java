
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * TH5
 */
public class TH5 {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("SONGUYEN.IN"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<String> arr=new ArrayList<>();
        while (n-->0) {
            arr.add(scanner.nextLine().trim());
        }
        for (String string : arr) {
            System.out.println(check(string));
        }
    }


    public static String check(String s){
        BigInteger a=new BigInteger(s), b=BigInteger.valueOf(7), c=BigInteger.valueOf(13);
        BigInteger x=a.divide(b), y=a.divide(c);
        if(a.compareTo(x.multiply(b))==0 && a.compareTo(y.multiply(c))==0){
            return "Both";
        }else if(a.compareTo(x.multiply(b))==0) return "Div 7";
        else if(a.compareTo(y.multiply(c))==0) return "Div 13";
        return "None";
    }
}