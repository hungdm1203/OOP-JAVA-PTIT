package TH14;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<SinhVien> ds1=new ArrayList<>();
        ArrayList<DeTai> ds2=new ArrayList<>();
        ArrayList<HoiDong> ds3=new ArrayList<>();
        ArrayList<String> dsMSV=new ArrayList<>();
        ArrayList<String> dsDT=new ArrayList<>();

        Scanner scanner=new Scanner(new File("SINHVIEN.in"));
        int n=Integer.valueOf(scanner.nextLine());
        while (scanner.hasNextLine()) {
            String msv=scanner.nextLine().trim();
            ds1.add(new SinhVien(msv,scanner.nextLine().trim(),scanner.nextLine().trim(),scanner.nextLine().trim()));
            dsMSV.add(msv);
        }
        Collections.sort(dsMSV);
        Collections.sort(ds1);


        Scanner sc=new Scanner(new File("DETAI.in"));
        n=Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            String id="DT"+String.format("%03d", i);
            ds2.add(new DeTai(id, sc.nextLine().trim(), sc.nextLine().trim()));
            dsDT.add(id);
        }


        Scanner ip=new Scanner(new File("HOIDONG.in"));
        n=Integer.valueOf(ip.nextLine());
        for (int i=1;i<=n;i++) {
            String str[]=ip.nextLine().trim().split("\\s+");
            int x=dsMSV.indexOf(str[0]), y=dsDT.indexOf(str[1]);
            ds3.add(new HoiDong(ds1.get(x), ds2.get(y), Integer.valueOf(str[2].substring(2))));
        }


        
        Collections.sort(ds3);
        int tmp=0;
        for (HoiDong hd : ds3) {
            int k=hd.getStt();
            if(k!=tmp) {
                tmp=k;
                System.out.println("DANH SACH HOI DONG "+tmp+":");
            }
            System.out.println(hd);
        }
    }
}
