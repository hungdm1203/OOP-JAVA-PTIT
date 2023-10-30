package J05043;

import java.util.*;

/**
 * tinh thu nhap cho nhan vien
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
        
        for (NhanVien nhanVien : ds) {
            System.out.println(nhanVien);
        }
        scanner.close();
    }
    
}

