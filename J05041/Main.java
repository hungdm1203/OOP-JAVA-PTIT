package J05041;

import java.util.*;

/**
 * sap xep bang tinh cong
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();scanner.nextLine();
        ArrayList<NhanVien> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            String name=scanner.nextLine();
            long lcb=scanner.nextLong(), nc=scanner.nextLong(); scanner.nextLine();
            String cvu=scanner.nextLine();
            ds.add(new NhanVien(i,name,lcb,nc,cvu));
        }
        Collections.sort(ds);
        for (NhanVien nhanVien : ds) {
            System.out.println(nhanVien);
        }
        scanner.close();
    }
    
}

