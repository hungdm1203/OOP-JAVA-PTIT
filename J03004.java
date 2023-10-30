import java.util.Scanner;

/**
 * chuan hoa xau ho ten 1
 */
public class J03004 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String a[]=scanner.nextLine().trim().split("\\s+");
            for (String i : a) {
                String s=i.substring(0, 1).toUpperCase()+i.substring(1).toLowerCase();
                System.out.print(s+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}