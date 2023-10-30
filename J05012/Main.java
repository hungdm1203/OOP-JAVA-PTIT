package J05012;

import java.util.*;

/**
 * tinh tien
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<Items> ds=new ArrayList<>();
        while (t-->0) {
            scanner.nextLine();
            ds.add(new Items(scanner.nextLine(), scanner.nextLine(), scanner.nextLong(), scanner.nextLong(), scanner.nextLong()));
        }
        Collections.sort(ds);
        for (Items items : ds) {
            System.out.println(items);
        }
        scanner.close();
    }
    
}

