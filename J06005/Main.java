package J06005;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * quan li ban hang-1
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();scanner.nextLine();
        ArrayList<Guest> dsG=new ArrayList<>();
        ArrayList<Items> dsI=new ArrayList<>();
        ArrayList<Bill> dsB=new ArrayList<>();

        for(int i=1;i<=n;i++){
            dsG.add(new Guest(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            scanner.nextLine();
            dsI.add(new Items(i, scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextInt()));
        }

        n=scanner.nextInt();scanner.nextLine();
        for(int i=1;i<=n;i++){
            String str[]=scanner.nextLine().trim().split("\\s+");
            int x=Integer.valueOf(str[0].substring(2)), y=Integer.valueOf(str[1].substring(2));
            dsB.add(new Bill(i, dsG.get(x-1), dsI.get(y-1), Integer.valueOf(str[2])));
        }

        for (Bill bill : dsB) {
            System.out.println(bill);
        }
        scanner.close();
    }
    
}
