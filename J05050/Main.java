package J05050;

import java.util.*;

/**
 * tinh tien dien
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<KhachHang> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            scanner.nextLine();
            ds.add(new KhachHang(i,scanner.nextLine(),scanner.nextInt(),scanner.nextInt()));
        }
        Collections.sort(ds);
        for (KhachHang khachHang : ds) {
            System.out.println(khachHang);
        }
        scanner.close();
    }
}


