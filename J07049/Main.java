package J07049;

import java.io.*;
import java.util.*;

/**
 * tinh ngay het han bao hanh
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(new File("MUAHANG.in"));
        int n=Integer.valueOf(sc.nextLine());
        ArrayList<String> lID=new ArrayList<>();
        ArrayList<Product> lP=new ArrayList<>();
        while (n-->0) {
            String id=sc.nextLine();
            lP.add(new Product(id, sc.nextLine(), Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine())));
            lID.add(id);
        }

        ArrayList<Guest> lG=new ArrayList<>();
        n=Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            String name=sc.nextLine(),add=sc.nextLine(),id=sc.nextLine();
            int quantity=Integer.valueOf(sc.nextLine());
            String date=sc.nextLine();
            int k=lID.indexOf(id);
            lG.add(new Guest(i, name, add, lP.get(k), quantity, date));
        }

        Collections.sort(lG);
        for (Guest guest : lG) {
            System.out.println(guest);
        }
    }
}
