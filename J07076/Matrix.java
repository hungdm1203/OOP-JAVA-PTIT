package J07076;

import java.util.Arrays;

public class Matrix {
    private int n,m;
    private int a[][];
    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a=new int[n][m];
    }

    public void setMatrix(String s){
        String str[]=s.split("\\s+");
        for(int i=0;i<this.n;i++){
            for (int j=0;j<this.m;j++) a[i][j]=Integer.valueOf(str[i*m+j]);
        }
    }

    public void toStr() {
        for (int[] is : a) {
            for (int i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public void sapXep(int x){
        int res[]=new int[this.n];
        for(int i=0;i<n;i++) res[i]=this.a[i][x];
        Arrays.sort(res);
        for(int i=0;i<n;i++) this.a[i][x]=res[i];
    }

    

}
