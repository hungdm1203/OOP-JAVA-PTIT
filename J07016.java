import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * so nguyen to trong hai file nhi phan
 */
public class J07016 {

    public static void main(String[] args) throws Exception {
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1=(ArrayList<Integer>) in.readObject();
        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2=(ArrayList<Integer>) ip.readObject();
        int a[]=new int[10001], b[]=new int[10001];
        for(Integer i:a1) a[i]++;
        for(Integer i:a2) b[i]++;
        for(int i=0;i<10001;i++){
            if(a[i]>0&&b[i]>0&&check(i)) System.out.println(i+" "+a[i]+" "+b[i]);
        }
    }

    public static boolean check(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return n>=2;
    }
}