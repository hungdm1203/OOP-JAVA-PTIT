package J05042;

import java.util.*;

/**
 * bang xep hang
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<SinhVien> ds=new ArrayList<>();
        while (t-->0) {
            scanner.nextLine();
            ds.add(new SinhVien(scanner.nextLine(),scanner.nextInt(),scanner.nextInt()));
        }
        Collections.sort(ds);
        for (SinhVien sinhVien : ds) {
            System.out.println(sinhVien);
        }
        scanner.close();
    }
    
}



