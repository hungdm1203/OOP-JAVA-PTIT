package J05007;

import java.util.*;

/**
 * sap xep danh sach doi tuong nhan vien
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<NhanVien> dsNV=new ArrayList<>();
        int t=scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= t; i++) {
            NhanVien nv=new NhanVien(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            dsNV.add(nv);
        }
        Collections.sort(dsNV);
        for (NhanVien nhanVien : dsNV) {
            System.out.println(nhanVien);
        }
        scanner.close();
    }
    
}
