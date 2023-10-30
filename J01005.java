import java.util.Scanner;

/**
 * chia tam giac
 */
public class J01005 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt();
            int h=scanner.nextInt();
            chia(n,h);
            System.out.println();
        }
        scanner.close();
    }
    public static void chia(int n,int h){
        for(double i=1;i<n;i++){
            System.out.printf("%6f ",Math.sqrt(i/n)*h);
        }
    }
}