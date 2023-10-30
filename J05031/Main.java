package J05031;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * bang diem thanh phan 2
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<SinhVien> ds=new ArrayList<>();
        while (t-->0) {
            scanner.nextLine();
            ds.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
        }
        Collections.sort(ds);
        int dem=1;
        for (SinhVien sinhVien : ds) {
            System.out.println(dem+" "+sinhVien);
            dem++;
        }
        scanner.close();
    }
}


