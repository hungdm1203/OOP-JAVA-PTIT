import java.util.Scanner;

/**
 * so dep 2
 */
public class J03007 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s=scanner.nextLine();
            if(check(s)){
                System.out.println("YES");
            } else System.out.println("NO");
        }
        scanner.close();
    }
    public static boolean check(String s){
        int l=0,r=s.length()-1;
        if (s.charAt(l)!='8' || s.charAt(r)!='8') {
            return false;
        }
        long sum=0;
        while (l<=r) {
            if (s.charAt(l)!=s.charAt(r)) {
                return false;
            }
            sum=sum+s.charAt(l)-'0'+s.charAt(r)-'0';
            if(l==r){
                sum=sum-(s.charAt(r)-'0');
            }
            l++;r--;
        }
        if (sum%10==0) {
            return true;
        } else return false;
    }
}