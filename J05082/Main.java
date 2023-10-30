package J05082;

import java.util.*;
/*
 * danh sach khach hang
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();scanner.nextLine();
        ArrayList<Guest> ds=new ArrayList<>();
        for (int i=1;i<=t;i++) {
            ds.add(new Guest(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        Collections.sort(ds);
        for (Guest guest : ds) {
            System.out.println(guest);
        }
        scanner.close();
    }
}

