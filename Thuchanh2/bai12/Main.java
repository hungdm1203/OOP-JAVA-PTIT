package Thuchanh2.bai12;

import java.io.*;
import java.util.*;

/**
 * quan ly ban hang-2
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new File("KH.in"));
        int n=Integer.valueOf(scanner.nextLine());
        ArrayList<Guest> listG=new ArrayList<>();
        ArrayList<Items> listI=new ArrayList<>();
        ArrayList<Bill> listB=new ArrayList<>();

        for (int i=1;i<=n;i++) {
            listG.add(new Guest(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));    
        }

        Scanner sc=new Scanner(new File("MH.in"));
        n=Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            listI.add(new Items(i,sc.nextLine(),sc.nextLine(),Integer.valueOf(sc.nextLine()),Integer.valueOf(sc.nextLine())));
        }

        Scanner ip=new Scanner(new File("HD.in"));
        n=Integer.valueOf(ip.nextLine());
        for (int i=1;i<=n;i++) {
            String arr[]=ip.nextLine().trim().split("\\s+");
            int id1=Integer.valueOf(arr[0].substring(3))-1;
            int id2=Integer.valueOf(arr[1].substring(3))-1;

            listB.add(new Bill(i,listG.get(id1),listI.get(id2),Integer.valueOf(arr[2])));
        }

        for (Bill bill : listB) {
            System.out.println(bill);
        }
    }
    
}

