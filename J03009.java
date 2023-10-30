
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * tap tu rieng cua hai xau
 */
public class J03009 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            ArrayList<String> a=new ArrayList<>();
            String s1[]=scanner.nextLine().trim().split("\\s+");
            String s2[]=scanner.nextLine().trim().split("\\s+");
            for (String string : s2) {
                a.add(string);
            }
            Arrays.sort(s1);
            for (String string : s1) {
                if(!a.contains(string)){
                    System.out.print(string+" ");
                    a.add(string);
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}