package J07046;

import java.io.*;
import java.util.*;

/**
 * danh sach luu tru
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("KHACH.in"));
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<Khach> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            ds.add(new Khach(i, scanner.nextLine().trim(), scanner.nextLine().trim(), scanner.nextLine().trim(), scanner.nextLine().trim()));
        }
        Collections.sort(ds);
        for (Khach khach : ds) {
            System.out.println(khach);
        }
    }
    
}
