package Thuchanh2.bai11;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("MUAHANG.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<SanPham> listSP=new ArrayList<>();
        ArrayList<KhachHang> listKH=new ArrayList<>();
        ArrayList<String> listID=new ArrayList<>();
        while (n-->0) {
            String id=scanner.nextLine();
            listID.add(id);
            listSP.add(new SanPham(id, scanner.nextLine(), Integer.valueOf(scanner.nextLine()), Integer.valueOf(scanner.nextLine())));
        }
        n=Integer.valueOf(scanner.nextLine());
        for(int i=1;i<=n;i++){
            String name=scanner.nextLine(),add=scanner.nextLine(),id=scanner.nextLine();
            int soluong=Integer.valueOf(scanner.nextLine());
            String time=scanner.nextLine();
            int x=listID.indexOf(id);
            listKH.add(new KhachHang(i,name,add,time,listSP.get(x),soluong));
        }
        Collections.sort(listKH);
        for (KhachHang khachHang : listKH) {
            System.out.println(khachHang);
        }
    }
}
