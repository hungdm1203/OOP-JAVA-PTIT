package J07037;

import java.io.*;
import java.util.*;

/**
 * danh sach doanh nghiep
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("DN.in"));
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<DoanhNghiep> ds=new ArrayList<>();
        while (t-->0) {
            ds.add(new DoanhNghiep(scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }
        Collections.sort(ds);
        for (DoanhNghiep doanhNghiep : ds) {
            System.out.println(doanhNghiep);
        }
    }
    
}
