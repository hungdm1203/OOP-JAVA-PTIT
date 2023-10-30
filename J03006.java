import java.util.Scanner;

/**
 * so dep 1
 */
public class J03006 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s=scanner.nextLine();
            if (check(s)) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
        scanner.close();
    }

    public static boolean check(String s){
        int l=0, r=s.length()-1;
        while (l<r) {
            if ((s.charAt(l)-'0')%2!=0 || (s.charAt(l)-'0')%2!=0) {
                return false;
            }
            if (s.charAt(l)!=s.charAt(r)) {
                return false;
            }
            l++;r--;
        }
        return true;
    }
}