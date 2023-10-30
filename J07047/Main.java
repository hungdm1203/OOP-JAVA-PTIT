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
        while (t-->0) {
            dsRoom.add(new Room(scanner.nextLine()));
        }

        t=Integer.valueOf(scanner.nextLine());
        for(int i=1;i<=t;i++){
            String nameKH=scanner.nextLine(), rID=scanner.nextLine(), start=scanner.nextLine(), end=scanner.nextLine();
            for (Room r : dsRoom) {
                if(r.getLoai().equals(rID.substring(2,3))){
                    long rDG=r.getDonGia();
                    double rPhi=r.getPhi();
                    dsKH.add(new KhachHang(i, nameKH, rID, start, end, rDG, rPhi));
                }
            }
        }

        Collections.sort(dsKH);
        for (KhachHang khachHang : dsKH) {
            System.out.println(khachHang);
        }
    }
    
}