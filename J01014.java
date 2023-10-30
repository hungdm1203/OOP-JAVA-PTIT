import java.util.Scanner;

/**
 * uoc so nguyen to lon nhat
 */
public class J01014 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            long n=scanner.nextLong();
            check(n);
        }
        scanner.close();
    }
    public static void check(long n){
        int i=2;
        long tmp=0;
        while(i<=Math.sqrt(n)+1){
            if(n%i==0){
                tmp=i;
                n=n/i;
            }else i++;
        }
        tmp=Math.max(n,tmp);
        System.out.println(tmp);
    }
}