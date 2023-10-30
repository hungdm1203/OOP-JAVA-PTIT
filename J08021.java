import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * day ngoac dung dai nhat
 */
public class J08021 {

    public static void build(String s){
        Deque<Integer> dq=new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if(!dq.isEmpty() && s.charAt(dq.getFirst())=='(' && s.charAt(i)==')'){
                dq.removeFirst();
            } else dq.addFirst(i);
        }
        int dem=0 , n=s.length();
        while (!dq.isEmpty()) {
            dem=Math.max(dem, n-dq.getFirst()-1);
            n=dq.removeFirst();
        }
        System.out.println(Math.max(dem, n));
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s=scanner.nextLine();
            build(s);
        }
        scanner.close();
    }
}