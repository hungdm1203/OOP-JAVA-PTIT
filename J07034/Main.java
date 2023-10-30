package J07034;

import java.io.*;
import java.util.*;

/**
 * Main
 */
public class Main  { 

    public static void main(String[] args) throws IOException{
        Scanner scanner=new Scanner(new File("MONHOC.in"));
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<MonHoc> ds=new ArrayList<>();
        while (t-->0) {
            ds.add(new MonHoc(scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }
        Collections.sort(ds);
        for (MonHoc monHoc : ds) {
            System.out.println(monHoc);
        }
    }
}