import java.util.Scanner;

/**
 * sap xep noi bot
 */
public class J02013 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for (int i=0 ; i<n ;i++) {
            a[i]=scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int check=1;
            for (int j = 0; j < n-1; j++) {
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                    check=0;
                }
            }

            if (check==1)
                break;

            System.out.print("Buoc "+(i+1)+": ");
            for (int k : a) {
                System.out.print(k+" ");
            }
            System.out.println();          
        }

        scanner.close();
    }
}