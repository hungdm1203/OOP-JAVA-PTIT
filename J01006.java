import java.util.Scanner;

/**
 * tinh so fibonacci
 */
public class J01006 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt();
            fib(n);
        }
        scanner.close();
    }
    public static void fib(int n){
        long a=1;
        long b=1;
        for(int i=3;i<=n;i++){
            a=a+b;
            b=a-b;
        }
        System.out.println(a);
    }
}