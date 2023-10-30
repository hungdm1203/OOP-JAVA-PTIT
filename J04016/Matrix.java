package J04016;
import java.util.*;


public class Matrix {
    private int arr[][],n,m;

    

    public Matrix(int n, int m) {
        this.arr = new int[n][m];
        this.n = n;
        this.m = m;
    }



    public void nextMatrix(Scanner scanner){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.arr[i][j]=scanner.nextInt();
            }
        }
    }

    public Matrix mul(Matrix matrix){
        Matrix res=new Matrix(this.n, matrix.m);
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < matrix.m; j++) {
                for (int k = 0; k < matrix.n; k++) {
                    res.arr[i][j]+=this.arr[i][k]*matrix.arr[k][j];
                }
            }
        }
        return res;
    }



    @Override
    public String toString() {
        String s="";
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                s=s+this.arr[i][j]+" ";
            }
            s=s+"\n";
        }
        return s;
    }
   

}
