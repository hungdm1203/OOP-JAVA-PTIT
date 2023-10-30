package J05045;

import java.util.*;

/**
 * sap xep nhan vien theo thu nhap
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        ArrayList<NhanVien> ds=new ArrayList<>();
        for(int i=1;i<=t;i++){
            scanner.nextLine();
            ds.add(new NhanVien(i,scanner.nextLine(),scanner.nextLine(),scanner.nextLong(),scanner.nextLong()));
        }
        Collections.sort(ds);
        for (NhanVien nhanVien : ds) {
            System.out.println(nhanVien);
        }
        scanner.close();
    }
    
}

