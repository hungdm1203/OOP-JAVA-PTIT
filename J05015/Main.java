package J05015;

import java.util.*;

/**
 * dua xe dap
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();scanner.nextLine();
        ArrayList<Cyclist> ds=new ArrayList<>();
        while (t-->0) {
            ds.add(new Cyclist(scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        Collections.sort(ds);
        for (Cyclist cyclist : ds) {
            System.out.println(cyclist);
        }
        scanner.close();
    }
}

