package TH7;

import java.io.*;
import java.util.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> ds=new ArrayList<>();
        while (scanner.hasNextLine()) {
            ds.add(new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(),scanner.nextLine()));
        }
        Collections.sort(ds);
        for (SinhVien sinhVien : ds) {
            System.out.println(sinhVien);
        }
    }
}
