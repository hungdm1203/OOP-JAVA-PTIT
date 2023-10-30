import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * tinh tong
 */
public class J07002 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("DATA.in"));
        long s=0;
        while (scanner.hasNext()) {
            try {
                int t=Integer.valueOf(scanner.next());
                s+=t;
            } catch(NumberFormatException e){}
        }
        System.out.println(s);
    }
    
}