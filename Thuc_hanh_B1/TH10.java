
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 * TH10
 */
public class TH10 {

    public static void main(String[] args) throws Exception {
        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> arr1=(ArrayList<String>) ip.readObject();
        ArrayList<Integer> arr2=(ArrayList<Integer>) in.readObject();
        TreeSet<String> ds=new TreeSet<>();
        for (String s : arr1) {
            for (Integer i : arr2) {
                String res=s+i;
                ds.add(res);
            }
        }
        for (String string : ds) {
            System.out.println(string);
        }
    }
}