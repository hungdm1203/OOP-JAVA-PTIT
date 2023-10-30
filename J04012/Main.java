package J04012;

import java.util.Scanner;

/**
 * bai toan tinh cong
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        NhanVien nv=new NhanVien(scanner.nextLine(), scanner.nextLong(), scanner.nextLong(), scanner.next());
        System.out.println(nv);
        scanner.close();
    }
}
