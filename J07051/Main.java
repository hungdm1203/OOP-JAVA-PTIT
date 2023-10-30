package J07051;

import java.io.*;
import java.util.*;

/**
 * tinh tien phong
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("KHACHHANG.in"));
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<KhachHang> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            ds.add(new KhachHang(i, scanner.nextLine().trim(), scanner.nextLine().trim(), scanner.nextLine().trim(), scanner.nextLine().trim(), scanner.nextLine().trim()));
        }

        Collections.sort(ds);
        for (KhachHang khachHang : ds) {
            System.out.println(khachHang);
        }
    }
    
}
