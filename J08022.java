import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

/**
 * phan tu ben phai dau tien lon hon
 */
public class J08022 {


    public static void build(int a[]){
        Deque<Integer> dq=new ArrayDeque<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = a.length-1; i >=0; i--) {
            while (!dq.isEmpty() && a[dq.getFirst()]<=a[i]) {
                dq.removeFirst();
            }
            if(dq.isEmpty()){
                arr.add(-1);
            } else arr.add(a[dq.getFirst()]);
            dq.addFirst(i);
        }
        for (int i=arr.size()-1; i>=0; i--) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=scanner.nextInt();
            }
            build(a);
        }
        scanner.close();
    }
}