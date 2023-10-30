package J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * danh sach mat hang
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<MatHang> arr=new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            scanner.nextLine();
            String name=scanner.nextLine(), donVi=scanner.nextLine();
            long mua=scanner.nextInt(), ban=scanner.nextInt();
            MatHang mh=new MatHang(i,name,donVi,mua,ban,ban-mua);
            arr.add(mh);
        }
        Collections.sort(arr);
        for (MatHang matHang : arr) {
            System.out.println(matHang);
        }
        scanner.close();
    }
}
