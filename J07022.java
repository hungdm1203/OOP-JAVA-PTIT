import java.io.*;
import java.util.*;

/**
 * loai bo so nguyen
 */
public class J07022 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("DATA.in"));
        ArrayList<String> ds=new ArrayList<>();
        while (scanner.hasNext()) {
            if(scanner.hasNextInt()){
                scanner.next();
            } else ds.add(scanner.next());
        }
        Collections.sort(ds);
        for (String s : ds) {
            System.out.print(s+" ");
        }
    }
    
}