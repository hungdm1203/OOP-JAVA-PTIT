import java.util.Scanner;

/**
 * kiem tra so fibonacci
 */
public class J01007 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            long n=scanner.nextLong();
            if(fib(n)){
                System.out.println("YES");
            } else System.out.println("NO");
        }
        scanner.close();
    }
    public static boolean fib(long n){
        long[] fi=new long[100];
        fi[0]=1; fi[1]=1;
        if(n==1||n==0) return true;
        for(int i=2;i<100;i++){
            fi[i]=fi[i-1]+fi[i-2];
            if(fi[i]==n){
                return true;
            }
            if(fi[i]>n){
                return false;
            }
        }
        return false;
    }
}