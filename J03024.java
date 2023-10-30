import java.util.Scanner;

/**
 * so uu the
 */
public class J03024 {

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
        if(s.charAt(0)=='0'){
            return "INVALID";
        }
        int chan=0;
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))){
                return "INVALID";
            }
            if((s.charAt(i)-'0')%2==0){
                chan++;
            }
        }
        if (s.length()%2==0 && chan>s.length()-chan){
            return "YES";
        } else if(s.length()%2!=0 && chan<s.length()-chan){
            return "YES";
        } else return "NO";
    }
}