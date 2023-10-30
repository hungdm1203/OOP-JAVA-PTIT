import java.util.Scanner;

/**
 * uoc so chia het cho 2 
 */
public class J01012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            long n=scanner.nextLong();
            int dem=0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if(n%i==0){
                    if(i%2==0) dem++;
                    if((n/i)%2==0) dem++;
                    if(n/i==i&&i%2==0) dem--;
                }
            }
            System.out.println(dem);
        }
        scanner.close();
    }
}