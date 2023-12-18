package J07054;

import java.io.*;
import java.util.*;

/**
 * tinh diem trung binh
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("BANGDIEM.in"));
        int t=Integer.valueOf(scanner.nextLine().trim());
        ArrayList<SinhVien> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            ds.add(new SinhVien(i, scanner.nextLine().trim(), Double.valueOf(scanner.nextLine().trim()), Double.valueOf(scanner.nextLine().trim()), Double.valueOf(scanner.nextLine().trim())));
        }
        Collections.sort(ds);
        SinhVien sv=ds.get(0);
        int dem=1;
        for (SinhVien sinhVien : ds) {
            if (sv.getScore()==sinhVien.getScore()) {
                sinhVien.setRank(sv.getRank());
            } else{
                sv=sinhVien;
                sinhVien.setRank(dem);
            }
            dem++;
            System.out.println(sinhVien);
        }
    }
}
