import java.util.Scanner;

/**
 * so tam phan
 */
public class J01024 {

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
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='0' && s.charAt(i)!='1' && s.charAt(i)!='2'){
                return false;
            }
        }
        return true;
    }
}