package J05010;

import java.util.*;

/**
 * sap xep danh sach mat hang
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<MatHang> dsMH=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            scanner.nextLine();
            String ten=scanner.nextLine(), nhom=scanner.nextLine();
            double mua=scanner.nextDouble(), ban=scanner.nextDouble();
            MatHang mh=new MatHang(i,ten,nhom,ban-mua);
            dsMH.add(mh);
        }
        Collections.sort(dsMH);
        for (MatHang matHang : dsMH) {
            System.out.println(matHang);
        }
        scanner.close();
    }
}
