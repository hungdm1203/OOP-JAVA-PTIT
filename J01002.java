import java.util.Scanner;

/**
 * tinh tong n so nguyen duong dau tien
 */
public class J01002 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            System.out.println((long)n*(n+1)/2);
        }
        sc.close();
    }
}