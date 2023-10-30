package J04009;

import java.util.Scanner;

/**
 * dien tich tam giac
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            Point p1=new Point(scanner.nextDouble(), scanner.nextDouble()), p2=new Point(scanner.nextDouble(), scanner.nextDouble()), p3=new Point(scanner.nextDouble(), scanner.nextDouble());
            
            double a=p1.distance(p2), b=p1.distance(p3), c=p2.distance(p3);

            if(a+b>c && a+c>b && b+c>a){
                System.out.printf("%.2f\n",Math.sqrt((a+b+c)*(a+b-c)*(-a+b+c)*(a-b+c))/4.0);
            } else System.out.println("INVALID");
        }
        scanner.close();
    }
}
