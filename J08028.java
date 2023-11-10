import java.util.*;

/**
 * hinh chu nhat don sac
 */
public class J08028 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt(), n=scanner.nextInt();
        int a[]=new int[n], b[]=new int[n], l[]=new int[n], r[]=new int[n];
        long res=0;

        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
            b[i]=m-a[i];
        }

        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while (!st.isEmpty()&&a[st.peek()]>=a[i]) {
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
            while (!st.isEmpty()&&a[st.peek()]>=a[i]) {
                st.pop();
            }
            if(st.isEmpty()) r[i]=n;
            else r[i]=st.peek();
            st.add(i);
        }
        while (!st.isEmpty()) {
            st.pop();
        }
        for(int i=0;i<n;i++){
            res=Math.max(res, (long)a[i]*(r[i]-l[i]-1));
        }


        for(int i=0;i<n;i++){
            while (!st.isEmpty()&&b[st.peek()]>=b[i]) {
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
            while (!st.isEmpty()&&b[st.peek()]>=b[i]) {
                st.pop();
            }
            if(st.isEmpty()) r[i]=n;
            else r[i]=st.peek();
            st.add(i);
        }


        for(int i=0;i<n;i++){
            res=Math.max(res, (long)b[i]*(r[i]-l[i]-1));
        }
        System.out.println(res);
        scanner.close();
    }
}