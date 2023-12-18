package J07047;

import java.io.*;
import java.util.*;

/**
 * quan ly khach san
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("DATA.in"));
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<Room> dsRoom=new ArrayList<>();
        ArrayList<KhachHang> dsKH=new ArrayList<>();
        ArrayList<String> dsType=new ArrayList<>();
        while (t-->0) {
            String s[]=scanner.nextLine().trim().split("\\s+");
            dsRoom.add(new Room(s[0],s[1],s[2],s[3]));
            dsType.add(s[0]);
        }

        t=Integer.valueOf(scanner.nextLine());
        for(int i=1;i<=t;i++){
            String nameKH=scanner.nextLine(), rID=scanner.nextLine(), start=scanner.nextLine(), end=scanner.nextLine();
            int x=dsType.indexOf(rID.charAt(2)+"");
            dsKH.add(new KhachHang(i, nameKH, rID, start, end, dsRoom.get(x)));
        }

        Collections.sort(dsKH);
        for (KhachHang khachHang : dsKH) {
            System.out.println(khachHang);
        }
    }
    
}