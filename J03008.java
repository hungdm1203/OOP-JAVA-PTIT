import java.util.Scanner;

/**
 * so dep 3
 */
public class J03008 {

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
        while (l<=r) {
            if (s.charAt(l)!=s.charAt(r)) {
                return false;
            }
            if(!nto(s.charAt(l)-'0') || !nto(s.charAt(r)-'0')){
                return false;
            }
            l++;r--;
        }
        return true;
    }
    public static boolean nto(int n){
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}