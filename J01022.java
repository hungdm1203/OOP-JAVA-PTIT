import java.util.Scanner;

/**
 * xau nhi phan
 */
public class J01022 {

    public static long[] fib=new long[93];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        Fib();
        while (t-->0) {
            long n=scanner.nextLong();
            long k=scanner.nextLong();
            System.out.println(check(n,k));
        }
        scanner.close();
    }

    public static void Fib(){
        fib[1]=0;
        fib[1]=1;
        for(int i=2;i<93;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
    }

    public static long check(long n,long k){
        if(n==1) return 0;
        if(n==2) return 1;
        if(k>fib[(int)n-2]){
            return check(n-1,k-fib[(int)n-2]);
        } else return check(n-2,k);
    }
}