package J05027;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * tim kiem giang vien
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();scanner.nextLine();
        ArrayList<GiangVien> ds=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            ds.add(new GiangVien(i,scanner.nextLine(),scanner.nextLine().toUpperCase()));
        }
        int q=scanner.nextInt();scanner.nextLine();
        while (q-->0) {
            String s=scanner.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+s+":");
            for (GiangVien giangVien : ds) {
                if(giangVien.getName().contains(s.toLowerCase())){
                    System.out.println(giangVien);
                }
            }
        }
        scanner.close();
    }
    
}

