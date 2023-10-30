package J05052;

import java.util.*;

/**
 * tra cuu don hang
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int  t=scanner.nextInt();
        ArrayList<MatHang> ds=new ArrayList<>();
        while (t-->0) {
            scanner.nextLine();
            ds.add(new MatHang(scanner.nextLine().trim(),scanner.nextLine(),scanner.nextLong(),scanner.nextLong()));
        }

        Collections.sort(ds);
        for (MatHang matHang : ds) {
            System.out.println(matHang);
        }
        scanner.close();
    }
    
}

