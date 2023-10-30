import java.util.Scanner;

/**
 * ma tran nhi phan
 */
public class J02106 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(), a[][]=new int[n][3],dem=0;
        for(int i=0;i<n;i++){
            int tmp=0;
            for(int j=0;j<3;j++) {
                a[i][j]=scanner.nextInt();
                if(a[i][j]>0) tmp++;
            }
            if(tmp>=2) dem++;
        }
        System.out.println(dem);
        scanner.close();
    }
    
}