import java.util.ArrayList;
import java.util.Scanner;

/**
 * xau day du
 */
public class J03031 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            scanner.nextLine();
            String s=scanner.nextLine();
            int k=scanner.nextInt();
            ArrayList<Character> arr=new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if(!arr.contains(s.charAt(i))) arr.add(s.charAt(i));
            }
            if(s.length()>=26 && 26-arr.size()<=k){
                System.out.println("YES");
            } else System.out.println("NO");
        }
        scanner.close();
    }
    
}