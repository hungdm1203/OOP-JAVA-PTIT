package J05064;

import java.util.*;

/**
 * bang thu nhap giao vien
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<GiaoVien> ds=new ArrayList<>();
        int t=scanner.nextInt(), ht=0, hp=0;
        while (t-->0) {
            scanner.nextLine();
            String ma=scanner.nextLine(), name=scanner.nextLine();
            long lcb=scanner.nextLong();
            if(ma.substring(0,2).equals("HT")){ 
                ht++;
                if(ht<=1) ds.add(new GiaoVien(ma,name,lcb));
            }
            else if(ma.substring(0,2).equals("HP")){ 
                hp++;
                if(hp<=2) ds.add(new GiaoVien(ma,name,lcb));
            } else ds.add(new GiaoVien(ma,name,lcb));
        }

        for (GiaoVien gv:ds) {
            System.out.println(gv);
        }
        scanner.close();
    }
    
}
