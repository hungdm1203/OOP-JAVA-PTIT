package J05036;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * tinh gia ban 1
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<MatHang> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            scanner.nextLine();
            ds.add(new MatHang(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLong(),scanner.nextLong()));
        }
        for (MatHang matHang : ds) {
            System.out.println(matHang);
        }
        scanner.close();
    }
}

