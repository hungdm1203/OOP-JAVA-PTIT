import java.util.Scanner;

/**
 * xau doi xung
 */
public class J03025 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s=scanner.nextLine();
            System.out.println(check(s));
        }
        scanner.close();
    }

    public static String check(String s){
        int l=0, r=s.length()-1, dem=0;
        while (l<r) {
            if(s.charAt(l)!=s.charAt(r)){
                dem++;
            }
            if (dem>1){
                return "NO";
            }
            l++;r--;
        }
        if(dem==1){
            return "YES";
        } else if(s.length()%2==0){
            return "NO";
        } else return "YES";
    }
}