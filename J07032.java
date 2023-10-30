import java.io.*;
import java.util.*;

/**
 * so thuan nghich trong file
 */
public class J07032 {

    public static void main(String[] args) throws Exception {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> arr1=(ArrayList<Integer>) in.readObject();
        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr2=(ArrayList<Integer>) ip.readObject();
        
        int a[]=new int[1000001];
        for (Integer i : arr1) {
            if(check(i.toString()) && arr2.contains(i)) a[i]++;
        }
        for (Integer i : arr2) {
            if(check(i.toString()) && a[i]>0) a[i]++;
        }

        int  dem=0;
        for (int i = 0; i < 1000001; i++) {
            if(a[i]>0) {
                System.out.println(i+" "+a[i]);
                dem++;
            }
            if(dem==10) break;
        }
    }


    public static boolean check(String s){
        StringBuilder tmp=new StringBuilder(s).reverse();
        if(!s.equals(tmp.toString())) return false;
        if(s.length()%2==0 || s.length()==1) return false;
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i)-'0')%2==0) return false;
        }
        return true;
    }
}
