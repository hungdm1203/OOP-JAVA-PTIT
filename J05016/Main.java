package J05016;

import java.util.*;

/**
 * hoa don khach san
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=Integer.valueOf(scanner.nextLine().trim());
        ArrayList<Guest> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            ds.add(new Guest(i, scanner.nextLine().trim(), scanner.nextLine().trim(), scanner.nextLine().trim(), scanner.nextLine().trim(),Integer.valueOf(scanner.nextLine().trim())));
        }

        Collections.sort(ds);
        for (Guest guest : ds) {
            System.out.println(guest);
        }
        scanner.close();
    }
    
}

