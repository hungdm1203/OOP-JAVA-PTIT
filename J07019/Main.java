package J07019;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * hoa don-1
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("DATA1.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<Sanpham> listSP=new ArrayList<>();
        ArrayList<String> listID=new ArrayList<>();
        while (n-->0) {
            String id=scanner.nextLine();
            listSP.add(new Sanpham(id, scanner.nextLine(), Integer.valueOf(scanner.nextLine()), Integer.valueOf(scanner.nextLine())));
            listID.add(id);
        }

        Scanner sc=new Scanner(new File("DATA2.in"));
        n=Integer.valueOf(sc.nextLine());
        ArrayList<Hoadon> listHD=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String s[]=sc.nextLine().trim().split("\\s+");
            int x=listID.indexOf(s[0].substring(0, 2));
            listHD.add(new Hoadon(i, s[0], listSP.get(x), Long.valueOf(s[1])));
        }

        for (Hoadon hoadon : listHD) {
            System.out.println(hoadon);
        }
    }
}
