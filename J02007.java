import java.util.*;

/**
 * dem so lan xuat hien
 */
public class J02007 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for (int j = 1; j <= t; j++) {
            int n=scanner.nextInt();
            int a[]=new int[100],b[]=new int[100000];
            for (int i = 0; i < n; i++) {
                a[i]=scanner.nextInt();
                b[a[i]]++;
            }
            System.out.println("Test "+j+":");
            for (int i = 0; i < n; i++) {
                if (b[a[i]]>0){
                    System.out.println(a[i]+" xuat hien "+b[a[i]]+" lan");
                    b[a[i]]=0;
                }
            }
        }
        scanner.close();
    }
}