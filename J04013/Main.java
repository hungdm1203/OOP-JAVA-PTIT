package J04013;

import java.util.Scanner;

/**
 * bai toan tuyen sinh
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ThiSinh ts=new ThiSinh(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println(ts.toString());
        scanner.close();
    }
}
