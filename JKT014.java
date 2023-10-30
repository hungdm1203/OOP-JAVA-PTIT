import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * dau tu chung khoan
 */
public class JKT014 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt(), a[]=new int[n];
            Deque<Integer> ds=new ArrayDeque<>();
            for(int i=0;i<n;i++){
                a[i]=scanner.nextInt();
            }
            for (int i = 0; i < a.length; i++) {
                while (ds.size()>0 && a[i]>=a[ds.getFirst()]) {
                    ds.removeFirst();
                }
                if(ds.size()==0){
                    System.out.print(i+1+" ");
                } else System.out.print(i-ds.getFirst()+" ");
                ds.addFirst(i);
            }
            System.out.println();
        }
        scanner.close();
    }
    
}
