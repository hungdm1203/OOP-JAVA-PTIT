
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * TH9
 */
public class TH9 {

    public static void main(String[] args) throws Exception {
        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1=(ArrayList<Integer>) ip.readObject();
        ArrayList<Integer> arr2=(ArrayList<Integer>) in.readObject();
        int a[]=new int[10000], b[]=new int[10000];
        for (Integer i : arr1) {
            if(check(i) && arr2.contains(i)) a[i]++;
        }
        for (Integer i : arr2) {
            if(check(i) && arr1.contains(i)) b[i]++;
        }

        for(int i=0;i<10000;i++){
            if(a[i]>0 && b[i]>0 && i>=10){
                System.out.println(i+" "+a[i]+" "+b[i]);
            }
        }
    }

    public static boolean check(int n){
        String s=String.valueOf(n);
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)>s.charAt(i+1)) return false;
        }
        return true;
    }
}