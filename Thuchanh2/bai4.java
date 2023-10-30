package Thuchanh2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class bai4 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1= (ArrayList<Integer>) in.readObject(), arr2=(ArrayList<Integer>) ip.readObject();
        int a[]=new int[10000];
        int b[]=new int[10000];
        
        for (Integer i : arr1) a[i]++;
        for (Integer i : arr2) b[i]++;
        for(int i=10;i<10000;i++){
            if(a[i]>0 && b[i]>0 && check(String.valueOf(i))) System.out.println(i+" "+a[i]+" "+b[i]);
        }
    }

    public static boolean check(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)<s.charAt(i+1)) return false;
        }
        return true;
    }
}
