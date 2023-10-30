import java.util.Arrays;
import java.util.Scanner;

/**
 * so xa cach
 */
public class J02022 {

    public static int n, a[]=new int[10], b[]=new int[10];

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            n=scanner.nextInt();
            Arrays.fill(a,0); Arrays.fill(b,0);
            Try(1);
        }
        scanner.close();
    }
    
    public static void Try(int i){
        for(int j=1; j<=n; j++){
            if(b[j]==0){
                a[i]=j;
                b[j]=1;
                if(i==n)
                    solve();
                else Try(i+1);
                b[j]=0;
            }
        }
    }

    public static void solve(){
        int check=1;
        for(int i=1;i<n;i++){
            if(Math.abs(a[i]-a[i+1])==1){
                check=0; break;
            }
        }
        if(check==1){
            for(int i=1;i<=n;i++) System.out.print(a[i]);
            System.out.println();
        }
    }


}