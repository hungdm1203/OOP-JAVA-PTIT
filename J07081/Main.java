package J07081;

import java.io.*;
import java.util.*;

/*
 * sap xep danh sach sinh vien
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> list=new ArrayList<>();
        int n=Integer.valueOf(scanner.nextLine());
        while (n-->0) {
            list.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        Collections.sort(list);
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien);
        }
    }
}
