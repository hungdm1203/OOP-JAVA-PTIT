package J04014;

import java.util.Scanner;

/**
 * tinh toan phan so
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0) {
            PhanSo p1=new PhanSo(scanner.nextLong(),scanner.nextLong()), p2=new PhanSo(scanner.nextLong(),scanner.nextLong());
            PhanSo p3=p1.TinhC(p2);
            System.out.println(p3.toString() +" "+ p1.TinhD(p2, p3).toString());
        }
        scanner.close();
    }
}