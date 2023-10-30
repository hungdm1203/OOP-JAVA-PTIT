import java.util.Scanner;

/**
 * sap xep chon
 */
public class J02011 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for (int i=0 ; i<n ;i++) {
            a[i]=scanner.nextInt();
        }
        
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j = i+1; j < n; j++) {
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int tmp=a[i];
            a[i]=a[min];
            a[min]=tmp;


            System.out.print("Buoc "+(i+1)+": ");
            for (int k : a) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}