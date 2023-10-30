import java.util.Scanner;

/**
 * mang doi xung
 */
public class J02004 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt(), a[]=new int[100];
            for (int i = 0; i < n; i++) {
                a[i]=scanner.nextInt();
            }
            if(build(a, n)){
                System.out.println("YES");
            } else System.out.println("NO");
        }
        scanner.close();
    }
    public static boolean build(int a[],int n){
        int l=0,r=n-1;
        while(l<r){
            if(a[l]!=a[r]){
                return false;
            }
            l++;r--;
        }
        return true;
    }
}