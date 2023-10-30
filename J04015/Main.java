package J04015;

import java.util.Scanner;

/**
 * tinh thu nhap giao vien
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        GiaoVien gv=new GiaoVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLong());
        System.out.println(gv.toString());
        scanner.close();
    }
}