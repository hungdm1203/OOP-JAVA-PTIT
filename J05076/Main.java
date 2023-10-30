package J05076;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * nhap xuat hang
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt(); scanner.nextLine();
        ArrayList<MatHang> dsMH=new ArrayList<>();
        ArrayList<DonHang> dsDH=new ArrayList<>();
        ArrayList<String> dsID=new ArrayList<>();
        
        while (t-->0) {
            String id=scanner.nextLine();
            dsMH.add(new MatHang(id, scanner.nextLine(), scanner.nextLine()));
            dsID.add(id);
        }

        t=scanner.nextInt();scanner.nextLine();
        while (t-->0) {
            String str[]=scanner.nextLine().split("\\s+");
            int n=dsID.indexOf(str[0]);
            dsDH.add(new DonHang(dsMH.get(n), Integer.valueOf(str[1]), Integer.valueOf(str[2]), Integer.valueOf(str[3])));
        }

        for (DonHang dh : dsDH) {
            System.out.println(dh);
        }

        scanner.close();
    }
    
}

