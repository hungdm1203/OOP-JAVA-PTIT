package J04017;

import java.util.Scanner;

public class Matrix {
    private long arr[][];
    private int n,m;

    public Matrix(int n, int m) {
        this.arr = new long[n][m];
        this.n = n;
        this.m = m;
    }

    public void nextMatrix(Scanner scanner){
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                this.arr[i][j]=scanner.nextInt();
            }
        }
    }

    public Matrix trans(){
        Matrix res=new Matrix(this.m,this.n);
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                res.arr[i][j]=this.arr[j][i];
            }
        }
        return res;
    }

    public Matrix mul(Matrix tmp){
        Matrix res=new Matrix(this.n, tmp.m);
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < tmp.m; j++) {
                for (int k = 0; k < tmp.n; k++) {
                    res.arr[i][j]+=this.arr[i][k]*tmp.arr[k][j];
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
                s=s+String.valueOf(this.arr[i][j])+" ";
            }
            s=s+"\n";
        }
        return s;
    }
    
}
