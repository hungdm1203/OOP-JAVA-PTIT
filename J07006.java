import java.io.*;
import java.util.*;

/**
 * so khac nhau trong file-3
 */
public class J07006 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> arr= (ArrayList<Integer>) ip.readObject();
        int a[]=new int[1001];
        for (Integer i : arr) {
            a[i]++;
        }
        for(int i=0;i<=1000;i++){
            if(a[i]>0) System.out.println(i+" "+a[i]);
        }
        ip.close();
    }
    
}