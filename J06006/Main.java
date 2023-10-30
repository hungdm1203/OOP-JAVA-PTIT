package J06006;

import java.util.*;

/**
 * quan ly ban hang-2
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt(); scanner.nextLine();
        ArrayList<Guest> listG=new ArrayList<>();
        ArrayList<Items> listI=new ArrayList<>();
        ArrayList<Bill> listB=new ArrayList<>();

        for (int i=1;i<=n;i++) {
            listG.add(new Guest(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));    
        }

        n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            scanner.nextLine();
            listI.add(new Items(i,scanner.nextLine(),scanner.nextLine(),scanner.nextInt(),scanner.nextInt()));
        }

        n=scanner.nextInt();scanner.nextLine();
        for (int i=1;i<=n;i++) {
            String arr[]=scanner.nextLine().trim().split("\\s+");
            int id1=Integer.valueOf(arr[0].substring(3))-1;
            int id2=Integer.valueOf(arr[1].substring(3))-1;

            listB.add(new Bill(i,listG.get(id1),listI.get(id2),Integer.valueOf(arr[2])));
        }

        Collections.sort(listB);
        for (Bill bill : listB) {
            System.out.println(bill);
        }
    }
    
}

