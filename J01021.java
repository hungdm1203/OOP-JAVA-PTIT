import java.util.Scanner;

/**
 * tinh luy thua
 */
public class J01021 {
    public static final int mod=(int)1e9+7;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        while(true){
            long a=scanner.nextLong();
            long b=scanner.nextLong();
            if(a==0 && b==0){
                break;
            }
            System.out.println(pow(a,b));
        }
        scanner.close();
    }

    public static long pow(long a,long b){
        if(b==0) return 1;
        if(b==1) return a%(mod);
        long s=pow(a,(long)b/2)%mod;
        if(b%2==0){
            return (s*s)%mod;
        } else{
            return (((s*s)%mod)*(a%mod))%mod;
        }
    }
}