import java.util.*;
import java.io.*;

/**
 * cap so nguyen to trong file-1
 */
public class J07030 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1=(ArrayList<Integer>)in1.readObject(), a2=(ArrayList<Integer>)in2.readObject();
        int a[]=new int[1000001], b[]=new int[1000001];
        for (Integer i : a1) {
            a[i]++;
        }
        for (Integer i : a2) {
            b[i]++;
        }
        for(int i=0;i<1000001;i++){
            if(a[i]>0 && b[1000000-i]>0 && i<1000000-i && check(i) && check(1000000-i)){
                System.out.println(i+" "+(1000000-i));
            }
        }
    }

    public static boolean check(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    
}