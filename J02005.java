import java.util.Scanner;

/**
 * hop cua hai day so
 */
public class J02005 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(), m=scanner.nextInt() , a[]=new int[1000], b[]=new int[1000];
        for (int i = 0; i < n; i++) {
            a[scanner.nextInt()]++;
        }
        for (int i = 0; i < m; i++) {
            b[scanner.nextInt()]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (a[i]>0&&b[i]>0) {
                System.out.print(i+" ");
            }
        }
        scanner.close();
    }
}