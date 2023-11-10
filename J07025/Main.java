package J07025;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * danh sach khach hang trong file
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("KHACHHANG.in"));
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<Guest> listG=new ArrayList<>();
        for(int i=1;i<=t;i++){
            listG.add(new Guest(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
        }
        Collections.sort(listG);
        for (Guest guest : listG) {
            System.out.println(guest);
        }
    }
}