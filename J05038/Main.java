package J05038;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * bang ke tien luong
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt(); scanner.nextLine();
        ArrayList<NhanVien> arr=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            arr.add(new NhanVien(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }
        long sum=0;
        for (NhanVien nhanVien : arr) {
            System.out.println(nhanVien);
            sum+=nhanVien.getLuong();
        }
        System.out.println("Tong chi phi tien luong: "+sum);
        scanner.close();
    }
}


