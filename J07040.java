import java.io.*;
import java.util.*;

/**
 * liet ke theo thu tu xuat hien
 */
public class J07040 {

    public static void main(String[] args) throws Exception {
        ObjectInputStream ip=new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner scanner=new Scanner(new File("VANBAN.in"));
        ArrayList<String> arr=(ArrayList<String>) ip.readObject();
        TreeSet<String> ts=new TreeSet<>();

        for (String string : arr) {
            String s[]=string.trim().toLowerCase().split("\\s+");
            ts.addAll(Arrays.asList(s));
        }
        while (scanner.hasNext()) {
            String s=scanner.next().toLowerCase();
            if(ts.contains(s)){
                System.out.println(s);
                ts.remove(s);
            }
        }

    }
}