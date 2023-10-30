package J07048;

import java.io.*;
import java.util.*;

/**
 * danh sach san pham-2
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("SANPHAM.in"));
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<SanPham> ds=new ArrayList<>();
        while (t-->0) {
            ds.add(new SanPham(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        Collections.sort(ds);
        for (SanPham sanPham : ds) {
            System.out.println(sanPham);
        }
    }
    
}
