package J06006;

import java.util.*;


/**
 * quan ly ban hang-2
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Guest>listG=new ArrayList<>();
        ArrayList<Items> listI=new ArrayList<>();
        ArrayList<Bill> listB=new ArrayList<>();
        int n=Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            listG.add(new Guest(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        n=Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            listI.add(new Items(i, sc.nextLine(), sc.nextLine(), Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine())));
        }
        n=Integer.valueOf(sc.nextLine());
        for(int i=1;i<=n;i++){
            String s[]=sc.nextLine().split("\\s+");
            listB.add(new Bill(i, listG.get(Integer.valueOf(s[0].substring(2))-1), listI.get(Integer.valueOf(s[1].substring(2))-1), Integer.valueOf(s[2])));
        }
        Collections.sort(listB);
        for (Bill bill : listB) {
            System.out.println(bill);
        }
    }
    
}

