import java.util.Scanner;

/**
 * hop cua hai day so
 */
public class J01026 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            long n=scanner.nextLong();
            if(Math.pow((int)Math.sqrt(n), 2)==n){
                System.out.println("YES");
            } else System.out.println("NO");
        }
        scanner.close();
    }
}