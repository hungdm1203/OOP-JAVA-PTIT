
import java.util.Scanner;

/**
 * TH1
 */
public class TH1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt(), a[]=new int[1001];
            for(int i=0;i<n;i++){
                a[scanner.nextInt()]++;
            }
            for (int i = 0; i <= 1000; i++) {
                if(a[i]>0&&i%2==0) System.out.print(i+" ");
            }
            System.out.println();
            for (int i = 1000; i >=0; i--) {
                if(a[i]>0&&i%2!=0) System.out.print(i+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}