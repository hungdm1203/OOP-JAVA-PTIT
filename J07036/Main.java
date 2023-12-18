package J07036;

import java.io.*;
import java.util.*;

/**
 * bang diem theo lop
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("SINHVIEN.in"));
        ArrayList<String> listMSV=new ArrayList<>();
        ArrayList<SinhVien> listS=new ArrayList<>();
        ArrayList<String> listID=new ArrayList<>();
        ArrayList<MonHoc> listM=new ArrayList<>();
        ArrayList<BangDiem> listB=new ArrayList<>();

        int n=Integer.valueOf(scanner.nextLine());
        while (n-->0) {
            String msv=scanner.nextLine();
            listS.add(new SinhVien(msv, scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
            listMSV.add(msv);
        }

        Scanner sc=new Scanner(new File("MONHOC.in"));
        n=Integer.valueOf(sc.nextLine());
        while (n-->0) {
            String s=sc.nextLine();
            listM.add(new MonHoc(s, sc.nextLine(), Integer.valueOf(sc.nextLine())));
            listID.add(s);
        }

        Scanner s=new Scanner(new File("BANGDIEM.in"));
        n=Integer.valueOf(s.nextLine());
        while (n-->0) {
            String str[]=s.nextLine().split("\\s+");
            int x=listMSV.indexOf(str[0]), y=listID.indexOf(str[1]);
            listB.add(new BangDiem(listS.get(x),listM.get(y),Double.valueOf(str[2])));
        }

        Collections.sort(listB);
        n=Integer.valueOf(s.nextLine());
        while (n-->0) {
            String str=s.nextLine();
            System.out.println("BANG DIEM lop "+str+":");
            for (BangDiem b : listB) {
                if(b.getLop().equals(str)) System.out.println(b);
            }
        }
    }
}