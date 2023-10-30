package J05021;

import java.util.*;

/**
 * sap xep theo ma sinh vien
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<SinhVien> dsSV=new ArrayList<>();
        while (scanner.hasNextLine()) {
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

