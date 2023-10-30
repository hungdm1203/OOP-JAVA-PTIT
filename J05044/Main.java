package J05044;

import java.util.*;

/**
 * liet ke nhan vien theo chuc vu
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
        scanner.nextLine();
        String s=scanner.nextLine();
        for (NhanVien nhanVien : ds) {
            if(nhanVien.getCvu().equals(s))System.out.println(nhanVien);
        }
        scanner.close();
    }
    
}

