
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

/**
 * TH4
 */
public class TH4 {

    public static void main(String[] args) throws Exception {
        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> arr=(ArrayList<Integer>) ip.readObject(), res=new ArrayList<>();
        Collections.sort(arr);
        for (Integer i : arr) {
            if(i>=100 && isPrime(i) && !res.contains(i)){
                System.out.println(i);
                res.add(i);
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