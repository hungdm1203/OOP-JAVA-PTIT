package J07010;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * danh sach sinh vien trong file-2
 */
public class Main {

    public static void main(String[] args) throws IOException{
        Scanner scanner=new Scanner(new File("SV.in"));
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<SinhVien> dsSv=new ArrayList<>();
        for(int i=1;i<=t;i++) {
            dsSv.add(new SinhVien(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }
        for (SinhVien sinhVien : dsSv) {
            System.out.println(sinhVien);
        }
    }
}