package J05013;

import java.util.*;

/**
 * tuyen dung
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<ThiSinh> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            scanner.nextLine();
            ds.add(new ThiSinh(i,scanner.nextLine(),scanner.nextDouble(),scanner.nextDouble()));
        }

        Collections.sort(ds);
        for (ThiSinh thiSinh : ds) {
            System.out.println(thiSinh);
        }
        scanner.close();
    }
    
}
