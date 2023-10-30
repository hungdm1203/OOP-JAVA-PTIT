import java.util.Scanner;

/**
 * danh sach ke
 */
public class J02105 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(), a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) a[i][j]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.printf("List(%d) = ",i+1);
            for(int j=0;j<n;j++){
                if(a[i][j]==1) System.out.print(j+1+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

