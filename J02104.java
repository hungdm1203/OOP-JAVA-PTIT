import java.util.Scanner;

/**
 * danh sach canh
 */
public class J02104 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(), a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) a[i][j]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(a[i][j]==1) System.out.printf("(%d,%d)\n",i+1,j+1);
            }
        }
        scanner.close();
    }
}

