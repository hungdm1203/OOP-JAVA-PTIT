import java.util.Scanner;

/**
 * dao tu
 */
public class J03032 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s[]=scanner.nextLine().trim().split("\\s+");
            for (String i : s) {
                StringBuilder ss=new StringBuilder(i);
                System.out.print(ss.reverse()+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}