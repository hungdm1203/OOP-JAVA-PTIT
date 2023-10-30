import java.util.Scanner;

/**
 * sap xep doi cho truc tiep
 */
public class J02010 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for (int i=0 ; i<n ;i++) {
            a[i]=scanner.nextInt();
        }
        
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[j]<a[i]){
                    int tmp=a[j];
                    a[j]=a[i];
                    a[i]=tmp;
                }
            }
            System.out.print("Buoc "+(i+1)+": ");
            for (int k : a) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}