import java.util.*;

/**
 * day con co tong le
 */
public class J02024 {
    public static ArrayList<String> res;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            Integer a[]=new Integer[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a,Collections.reverseOrder());
            res=new ArrayList<>();
            Try(-1,0,a,"");
        }
        sc.close();
    }

    public static void Try(int id,int sum,Integer a[],String s){
        if(sum%2!=0){
            res.add(s);
            System.out.println(s);
        }

        for(int i=a.length-1;i>id;i--){
            Try(i,sum+a[i],a,s+a[i]+" ");
        }
    }
}