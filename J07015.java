import java.io.*;
import java.util.*;

/**
 * so nguyen to trong file nhi phan
 */
public class J07015 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr=(ArrayList<Integer>) ip.readObject();
        int a[]=new int[10001];
        for (Integer i : arr) {
            a[i]++;
        }

        for(int i=0;i<10001;i++){
            if(a[i]>0&&check(i)) System.out.println(i+" "+a[i]);
        }
    }
    

    public static boolean check(int n){
        if (n<2) {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}