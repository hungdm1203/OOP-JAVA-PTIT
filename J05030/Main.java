package J05030;

import java.util.*;

/**
 * bang diem thanh phan 1
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<SinhVien> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            scanner.nextLine();
            ds.add(new SinhVien(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble()));
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

