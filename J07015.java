import java.io.*;
import java.util.*;

/**
 * so nguyen to trong file nhi phan
 */
public class J07015 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr=(ArrayList<Integer>) in.readObject();
        int a[]=new int[10000];
        for (Integer i : arr) {
            if(isPrime(i)) a[i]++;
        }
        for (int i=0 ; i<10000;i++) {
            if(a[i]>0) System.out.println(i+" "+a[i]);
        }
        in.close();
    }

    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
}