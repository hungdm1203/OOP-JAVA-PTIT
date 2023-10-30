import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

/**
 * so loc phat
 */
public class JKT013 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt();
            build(n);
        }
        scanner.close();
    }

    public static void build(int n){
        ArrayList<String> arr=new ArrayList<>();
        Deque<String> dq=new ArrayDeque<>();
        dq.addFirst("6");
        dq.addFirst("8");
        while (!dq.isEmpty()) {
            if(dq.getFirst().length()>n){
                while (dq.getLast().length()<=n) {
                    arr.add(dq.removeLast());
                }
                break;
            } else{
                dq.addFirst(dq.getLast()+"6");
                dq.addFirst(dq.getLast()+"8");
                arr.add(dq.removeLast());
            }
        }
        System.out.println(arr.size());
        for (int i = arr.size()-1; i >= 0; i--) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
}