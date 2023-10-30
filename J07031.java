import java.io.*;
import java.util.*;

/**
 * cap so nguyen to trong file-2
 */
public class J07031 {

    public static void main(String[] args) throws Exception {
        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1= (ArrayList<Integer>) ip.readObject();
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2= (ArrayList<Integer>) in.readObject();
        TreeSet<Integer> ts=new TreeSet<>();
        for (Integer i : arr1) {
            if(isPrime(i)) ts.add(i);
        }
        for (Integer i : ts) {
            if(ts.contains(1000000-i) && !arr2.contains(i) && !arr2.contains(1000000-i) && i<1000000-i){
                System.out.println(i+" "+(1000000-i));
            }
        }
    }


    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>=2;
    }
}