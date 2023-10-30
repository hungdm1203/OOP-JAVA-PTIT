package J05022;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * liet ke sinh vien theo lop
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        ArrayList<SinhVien> dsSV=new ArrayList<>();
        while (n-->0) {
            dsSV.add(new SinhVien(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t-->0) {
            String s=scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
            for (SinhVien sinhVien : dsSV) {
                if(s.equals(sinhVien.getLop()))
                    System.out.println(sinhVien);
            }
        }
        scanner.close();
    }
    
}

