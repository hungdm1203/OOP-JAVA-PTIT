import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * so 0 va so 9
 */
public class J08024 {

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
        Deque<String> dq=new ArrayDeque<>();
        dq.add("9");
        while (true) {
            BigInteger a=new BigInteger(dq.getLast()), b=new BigInteger(String.valueOf(n));
            if(a.remainder(b).equals(BigInteger.ZERO)){
                System.out.println(dq.getLast());
                break;
            } else{
                dq.addFirst(dq.getLast()+"0");
                dq.addFirst(dq.getLast()+"9");
                dq.removeLast();
            }
        }
    }
}