import java.util.Scanner;

/**
 * tich ma tran voi chuyen vi cua no
 */
public class J02103 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        for (int t=1;t<=test;t++) {
            int n=scanner.nextInt(), m=scanner.nextInt();
            int a[][]=new int[n][m], b[][]=new int[m][n], res[][]=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    a[i][j]=scanner.nextInt();
                    b[j][i]=a[i][j];
                }
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for(int k=0;k<m;k++){
                        res[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Test "+t+":");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++) System.out.print(res[i][j]+" ");
                System.out.println();
            }
        }
        scanner.close();
    }
}

