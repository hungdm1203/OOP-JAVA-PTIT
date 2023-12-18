import java.util.Scanner;

/**
 * lua chon tham lam
 */
public class J02023 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), s=sc.nextInt();
        int a[]=new int[n], b[]=new int[n];
        a[0]=1;b[0]=Math.min(s, 9);
        if(9*n<s ||s==0){
            System.out.println("-1 -1");
        } else{
            int tmp=s-1;
            for(int i=n-1;i>0;i--){
                a[i]=Math.min(tmp, 9);
                tmp-=a[i];
                if(tmp==0) break;
            }
            a[0]+=tmp;
            for (int i : a) System.out.print(i);
            System.out.print(" ");

            tmp=s-b[0];
            for(int i=1;i<n;i++){
                b[i]=Math.min(tmp, 9);
                tmp-=b[i];
                if(tmp==0) break;
            }
            for (int i : b) System.out.print(i);
        }
        sc.close();
    }
}