package J06001;

import java.util.*;

/**
 * tinh toan hoa don ban quan ao
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        ArrayList<SanPham> dsSP=new ArrayList<>();
        ArrayList<HoaDon> dsHD=new ArrayList<>();

        while (n-->0) {
            scanner.nextLine();
            dsSP.add(new SanPham(scanner.nextLine(), scanner.nextLine(), scanner.nextLong(), scanner.nextLong()));
        }

        n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            String s=scanner.next();
            long x=scanner.nextLong();
            for (SanPham sp : dsSP) {
                if(s.startsWith(sp.getMaSP())){
                    dsHD.add(new HoaDon(i, s, x, sp));
                }
            }
        }

        Collections.sort(dsHD);
        for (HoaDon hoaDon : dsHD) {
            System.out.println(hoaDon);
        }
        scanner.close();
    }
    
}
