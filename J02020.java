import java.util.Scanner;

/**
 * liet ke to hop-1
 */
public class J02020 {
    public static int a[]=new int[10],n,k,dem;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt(); k=scanner.nextInt(); dem=0;
        Try(1);
        scanner.close();
        System.out.printf("\nTong cong co %d to hop",dem);
    }


    public static void Try(int i){
        for(int j=a[i-1]+1; j<=n-k+i; j++){
            a[i]=j;
            if(i==k){
                solve();
                dem++;
            }
            else Try(i+1);
        }
    }

    public static void solve(){
        for(int i=1;i<=k;i++){
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
    
}
