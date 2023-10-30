import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * sap xep chen
 */
public class J02012 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for (int i=0 ; i<n ;i++) {
            a[i]=scanner.nextInt();
        }
        ArrayList<Integer> b=new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            b.add(a[i]);
            Collections.sort(b);
            System.out.print("Buoc "+(i)+": ");
            for (int k : b) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}