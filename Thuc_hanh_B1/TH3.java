
import java.util.*;

/**
 * TH3
 */
public class TH3 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();scanner.nextLine();
        while (t-->0) {
            String s=scanner.nextLine();
            ArrayList<Character> arr=new ArrayList<>();
            int sum=0;
            for (int i = 0; i < s.length(); i++) {
                if(Character.isDigit(s.charAt(i))) sum=sum+(s.charAt(i)-'0');
                else arr.add(s.charAt(i));
            }
            Collections.sort(arr);
            for (Character c : arr) {
                System.out.print(c);
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}