package J07020;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * hoa don-2
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("KH.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<Guest> listG=new ArrayList<>();
        ArrayList<Product> listP=new ArrayList<>();
        ArrayList<Bill> listB=new ArrayList<>();
        for(int i=1;i<=n;i++){
            listG.add(new Guest(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        Scanner sc=new Scanner(new File("MH.in"));
        n=Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            listP.add(new Product(i, sc.nextLine(), sc.nextLine(), Long.valueOf(sc.nextLine()), Long.valueOf(sc.nextLine())));
        }

        Scanner ip=new Scanner(new File("HD.in"));
        n=Integer.valueOf(ip.nextLine());
        for(int i=1;i<=n;i++){
            String s[]=ip.nextLine().trim().split("\\s+");
            int g=Integer.valueOf(s[0].substring(2)), p=Integer.valueOf(s[1].substring(2));
            listB.add(new Bill(i, listG.get(g-1), listP.get(p-1), Long.valueOf(s[2])));
        }

        for (Bill bill : listB) {
            System.out.println(bill);
        }
    }
}