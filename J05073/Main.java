package J05073;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * tinh toan gia ban
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(); scanner.nextLine();
        ArrayList<Bill> ds=new ArrayList<>();
        while (n-->0) {
            String a[]=scanner.nextLine().trim().split("\\s+");
            ds.add(new Bill(a[0], Double.valueOf(a[1]), Integer.valueOf(a[2])));
        }

        for (Bill bill : ds) {
            System.out.println(bill);
        }
        scanner.close();
    }
    
}
