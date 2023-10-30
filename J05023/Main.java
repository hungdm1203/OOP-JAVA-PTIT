package J05023;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * liet ke sinh vien theo khoa
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
            System.out.println("DANH SACH SINH VIEN KHOA " + s + ":");
            for (SinhVien sinhVien : dsSV) {
                if(s.substring(2).equals(sinhVien.getKhoa()))
                    System.out.println(sinhVien);
            }
        }
        scanner.close();
    }
    
}



