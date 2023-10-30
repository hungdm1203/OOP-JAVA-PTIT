package J05058;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * bang diem tuyen sinh
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<ThiSinh> ds=new ArrayList<>();
        while (t-->0) {
            scanner.nextLine();
            ds.add(new ThiSinh(scanner.nextLine(),scanner.nextLine(),scanner.nextDouble(),scanner.nextDouble(),scanner.nextDouble()));
        }

        Collections.sort(ds);
        for (ThiSinh thiSinh : ds) {
            System.out.println(thiSinh);
        }
        scanner.close();
    }
    
}


