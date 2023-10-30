import java.util.Scanner;

/**
 * diem can bang
 */
public class J02014 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            int n=scanner.nextInt();
            long a[]=new long[n];
            long sum=0;
            for (int i = 0; i < n; i++) {
                a[i]=scanner.nextLong();
                sum+=a[i];
            }
            int check=-1;
            long s=0;
            for (int i = 0; i < a.length-1; i++) {
                if(sum-a[i]==s){
                    check=i+1;
                    break;
                }
                s+=a[i];
                sum-=a[i];
            }
            if (check>0){
                System.out.println(check);
            } else System.out.println(-1);
        }
        scanner.close();
    }
}