package J05078;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * bang luong theo phong ban
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(); scanner.nextLine();
        ArrayList<PhongBan> dsPB=new ArrayList<>();
        ArrayList<NhanVien> dsNV=new ArrayList<>();
        ArrayList<String> dsmaPB=new ArrayList<>();

        while (n-->0) {
            String s=scanner.nextLine();
            int x=s.indexOf(" ");
            dsPB.add(new PhongBan(s.substring(0, x), s.substring(x+1)));
            dsmaPB.add(s.substring(0, x));
        }

        n=scanner.nextInt();
        while (n-->0) {
            scanner.nextLine();
            String s=scanner.nextLine();
            int a=dsmaPB.indexOf(s.substring(3));
            dsNV.add(new NhanVien(s, scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), dsPB.get(a)));
        }

        scanner.nextLine();
        String s=scanner.nextLine();
        for (PhongBan pb : dsPB) {
            if(pb.getMaPB().equals(s)){
                System.out.println("Bang luong phong "+pb.getTenPB()+":");
            }
        }
        for (NhanVien nv : dsNV) {
            if(nv.getPB().equals(s)) System.out.println(nv);
        }
        scanner.close();
    }
}


