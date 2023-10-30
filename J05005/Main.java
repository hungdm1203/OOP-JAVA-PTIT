package J05005;

import java.util.*;

/**
 * danh sach doi tuong sinh vien 3
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<SinhVien> dsSV=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            scanner.nextLine();
            SinhVien sv=new SinhVien(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextDouble());
            dsSV.add(sv);
        }
        Collections.sort(dsSV);
        for (SinhVien sinhVien : dsSV) {
            System.out.println(sinhVien.toString());
        }
        scanner.close();
    }
}