package J07052;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * bang diem tuyen sinh
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("THISINH.in"));
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<ThiSinh> ds=new ArrayList<>();
        while (t-->0) {
            ds.add(new ThiSinh(scanner.nextLine().trim(),scanner.nextLine().trim(),scanner.nextLine().trim(),scanner.nextLine().trim(),scanner.nextLine().trim()));
        }


        int chiTieu=scanner.nextInt();
        double diemChuan=100;
        Collections.sort(ds);
        for (ThiSinh thiSinh : ds) {
            if(chiTieu==0) break;
            chiTieu--;
            diemChuan=Math.min(diemChuan, thiSinh.getSum());
        }

        System.out.println(String.format("%.1f", diemChuan));
        for (ThiSinh thiSinh : ds) {
            System.out.print(thiSinh);
            if(thiSinh.getSum()<diemChuan) System.out.println(" TRUOT");
            else System.out.println(" TRUNG TUYEN");
        }
        scanner.close();
    }
    
}


