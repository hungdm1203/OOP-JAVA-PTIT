import java.util.*;
import java.io.*;

/**
 * cap so nguyen to trong file-1
 */
public class J07030 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1= (ArrayList<Integer>) in.readObject(), arr2=(ArrayList<Integer>) ip.readObject();
        TreeSet<Integer> s1=new TreeSet<>(), s2=new TreeSet<>();
        for (Integer i : arr1) {
            if(isPrime(i)) s1.add(i);
        }
        for (Integer i : arr2) {
            if(isPrime(i)) s2.add(i);
        }
        for (Integer i : s1) {
            if(s2.contains(1000000-i) && i<1000000-i) System.out.println(i+" "+(1000000-i));
        }
    }

    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
}