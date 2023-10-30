import java.util.Scanner;

/**
 * dien tich da giac
 */
public class J05008 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t-->0){
            int n=scanner.nextInt();
            int a[]=new int[n], b[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=scanner.nextInt();
                b[i]=scanner.nextInt();
            }

            double area=0;
            for (int i = 0; i < n; i++) {
                area+=0.5*(a[i]*b[(i+1)%n] - a[(i+1)%n]*b[i]);
            }
            System.out.printf("%.3f\n",Math.abs(area));
        }
        scanner.close();
    }
    
}