package J07050;

import java.io.*;
import java.util.*;

/**
 * sap xep mat hang
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("MATHANG.in"));
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<MatHang> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            ds.add(new MatHang(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }

        Collections.sort(ds);
        for (MatHang matHang : ds) {
            System.out.println(matHang);
        }
    }
    
}
