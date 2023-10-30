import java.util.Scanner;

/**
 * phan tich thua so nguyen to
 */
public class J01008 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i=1;i<=t;i++) {
            long n=scanner.nextLong();
            ptich(i,n);
            System.out.println();
        }
        scanner.close();
    }
    public static void ptich(int i, long n){
        System.out.printf("Test %d: ",i);
        for (int j=2; j<=Math.sqrt(n); j++) {
            int tmp=0;
            while(n%j==0){
                tmp++;
                n=n/j;
            }
            if(tmp!=0){
                System.out.printf("%d(%d) ", j,tmp);
            }
        }
        if(n!=1){
            System.out.printf("%d(%d)", n,1);
        }
    }
}