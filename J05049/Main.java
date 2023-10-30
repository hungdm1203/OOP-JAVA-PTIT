package J05049;

import java.util.*;

/**
 * bang theo doi nhap xuat hang
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=Integer.valueOf(scanner.nextLine());
        ArrayList<Hang> ds=new ArrayList<>();
        while (t-->0) {
            ds.add(new Hang(scanner.nextLine(),Long.valueOf(scanner.nextLine())));
        }
        String s=scanner.nextLine();
        Collections.sort(ds);
        for (Hang hang : ds) {
            if(s.equals(hang.getId())) System.out.println(hang);
        }
        scanner.close();
    }
    
}

