package J05068;

import java.util.*;

/**
 * quan ly kho xang dau
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<Kho> ds=new ArrayList<>();
        while (t-->0) {
            scanner.nextLine();
            ds.add(new Kho(scanner.next(), scanner.nextLong()));
        }

        Collections.sort(ds);
        for (Kho kho : ds) {
            System.out.println(kho);
        }
        scanner.close();
    }
    
}
