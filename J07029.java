import java.io.*;
import java.util.*;

/**
 * so nguyen to lon nhat trong file
 */
public class J07029 {

    public static void main(String[] args) throws Exception {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr=(ArrayList<Integer>) in.readObject();
        int a[]=new int[1000001];
        for (Integer i : arr) {
            a[i]++;
        }

        int dem=0;
        for(int i=1000000;i>=0;i--){
            if(a[i]>0&&check(i)){
                System.out.println(i+" "+a[i]);
                dem++;
            }
            if(dem==10) break;
        }
    }

    public static boolean check(int n){
        if(n<2) return false;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

}