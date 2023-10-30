package J05048;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * bang theo doi nhap xuat hang
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<Hang> ds=new ArrayList<>();
        while (t-->0) {
            ds.add(new Hang(scanner.nextLine(),Long.valueOf(scanner.nextLine())));
        }
        for (Hang hang : ds) {
            System.out.println(hang);
        }
        scanner.close();
    }
    
}

