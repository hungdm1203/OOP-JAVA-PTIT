import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * tim vi tri xau con
 */
public class J07078 {

    public static void main(String[] args) throws IOException {
        // Scanner scanner=new Scanner(System.in);
        Scanner scanner = new Scanner(new File("STRING.in"));
        int n = Integer.valueOf(scanner.nextLine());
        while (n-- > 0) {
            String s1 = scanner.nextLine(), s2 = scanner.nextLine();
            if (s1.length()>s2.length()) {
                for (int i = 0; i <= s1.length()-s2.length(); i++) {
                    if (s1.charAt(i)==s2.charAt(0) && s1.substring(i,i+s2.length()).equals(s2)){
                        System.out.print(i+1+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}