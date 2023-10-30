package J05020;

import java.util.*;

/**
 * sap xep sinh vien theo lop
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        scanner.nextLine();
        ArrayList<SinhVien> dsSV=new ArrayList<>();
        while (t-->0) {
            SinhVien sv=new SinhVien(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
            dsSV.add(sv);
        }
        Collections.sort(dsSV);
        for (SinhVien sinhVien : dsSV) {
            System.out.println(sinhVien);
        }
        scanner.close();
    }
}

