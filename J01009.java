import java.util.Scanner;

/**
 * tong giai thua
 */
public class J01009 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=1;
        while (t-->0) {
            long n=scanner.nextInt();
            long s=1,tmp=1;
            for(int i=2;i<=n;i++){
                tmp=tmp*i;
                s=s+tmp;
            }
            System.out.println(s);
        }
        scanner.close();
    }
}