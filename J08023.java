import java.util.Scanner;
import java.util.Stack;

/**
 * hinh chu nhat lon nhat
 */
public class J08023 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt();
            int a[]=new int[n];
            for (int i=0;i<n;i++) {
                a[i]=scanner.nextInt();
            }

            Stack<Integer> st=new Stack<>();
            int l[]=new int[n], r[]=new int[n];
            for(int i=0;i<n;i++){
                while (!st.isEmpty() && a[st.peek()]>=a[i]) {
                    st.pop();
                }
                if(st.isEmpty()) l[i]=-1;
                else l[i]=st.peek();
                st.add(i);
            }
            while (!st.isEmpty()) {
                st.pop();
            }
            for(int i=n-1;i>=0;i--){
                while (!st.isEmpty() && a[st.peek()]>=a[i]) {
                    st.pop();
                }
                if(st.isEmpty()) r[i]=n;
                else r[i]=st.peek();
                st.add(i);
            }
            long res=0;
            for(int i=0;i<n;i++){
                res=Math.max(res, (long)a[i]*(r[i]-l[i]-1));
            }
            System.out.println(res);
        }
        scanner.close();
    }
}