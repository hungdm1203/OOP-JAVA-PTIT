package J05024;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * liet ke sinh vien theo nganh
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt(); scanner.nextLine();
        ArrayList<SinhVien> arr=new ArrayList<>();
        while (t-->0) {
            arr.add(new SinhVien(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }
        int n=scanner.nextInt(); scanner.nextLine();
        while (n-->0) {
            String res=scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH "+res.toUpperCase()+":");
            for (SinhVien sv : arr) {
                if(sv.getNganh().equalsIgnoreCase(res)) System.out.println(sv);
            }
        }
        scanner.close();
    }
    
}

