package J07027;

import java.io.*;
import java.util.*;

/**
 * quan ly bai tap nhom
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("SINHVIEN.in"));
        ArrayList<Sinhvien> listSV=new ArrayList<>();
        ArrayList<String> listMSV=new ArrayList<>();
        int n=Integer.valueOf(scanner.nextLine());
        while (n-->0) {
            String msv=scanner.nextLine();
            listMSV.add(msv);
            listSV.add(new Sinhvien(msv, scanner.nextLine(), scanner.nextLine()));
        }

        Scanner sc=new Scanner(new File("BAITAP.in"));
        ArrayList<String> listBT=new ArrayList<>();
        n=Integer.valueOf(sc.nextLine());
        while (n-->0) {
            listBT.add(sc.nextLine());
        }

        Scanner ip=new Scanner(new File("NHOM.in"));
        while (ip.hasNextLine()) {
            String s[]=ip.nextLine().trim().split("\\s+");
            int x=listMSV.indexOf(s[0]);
            listSV.get(x).setBT(listBT.get(Integer.valueOf(s[1])-1),Integer.valueOf(s[1]));
        }

        Collections.sort(listSV);
        for (Sinhvien s : listSV) {
            System.out.println(s);
        }
    }
}
